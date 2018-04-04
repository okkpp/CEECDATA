package okkpp.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��19�� ����11:33:38 
 * @version 1.0 
 */
public class ExcelUtil {

	//���������Ϊ list map data
	public List<Map<String,String>> data;
	//String path=request.getSession().getServletContext().getRealPath("images/");
	public String parseFile(MultipartFile mfile,String path) {
		String fileName = mfile.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
		int size = 0;
		try {
			File file = new File(
					path
					+new SimpleDateFormat("yyyyMMddHHmmss").format(System.currentTimeMillis())
					+"."+suffix);
			file.getParentFile().mkdirs();
			
			mfile.transferTo(file);
			this.xls(file);
			size = this.data.size();
			if(size<1)return "û�����ݡ�";
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return "�ļ�����";
		} catch (IOException e) {
			e.printStackTrace();
			return "��������";
		} catch (InvalidFormatException e) {
			e.printStackTrace();
			return "��Ч�ļ���";
		}
		return "�ϴ��ɹ���һ��"+size+"�����ݡ�";
	}
	public void xls(File file) throws InvalidFormatException, IOException{
		Workbook workbook = WorkbookFactory.create(file);
		int sheetCount = workbook.getNumberOfSheets();
		if(sheetCount<2)return;
		
		Sheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum() + 1;
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		List<String> keys = getKeys(workbook.getSheetAt(1));
		if(keys.size()!=cols)return;
		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		//���� ������ �ӵڶ��п�ʼ---������ͷ
		for (int row = 1; row < rows; row++){
			Row r = sheet.getRow(row);
			Map<String,String> map = new HashMap<String, String>();
			for(int i=0;i<cols;i++){
				map.put(keys.get(i), parseCell(r.getCell(i)));
			}
			data.add(map);
		}
		System.out.println("data size:"+data.size());
		this.data = data;
	}
	
	private String parseCell(Cell cell){
		String res = "";
		if(cell!=null)
			switch(cell.getCellType()){
			case Cell.CELL_TYPE_STRING:
				res = cell.getStringCellValue();break;
			case Cell.CELL_TYPE_NUMERIC:
				res = cell.getNumericCellValue()+"";break;
			case Cell.CELL_TYPE_FORMULA:
				res = cell.getCellFormula();break;
			case Cell.CELL_TYPE_BLANK:
				res = " ";break;
			case Cell.CELL_TYPE_BOOLEAN:
				res = cell.getBooleanCellValue()+"";break;
			case Cell.CELL_TYPE_ERROR:
				res = "";break;
			}
		return res;
	}
	private List<String> getKeys(Sheet sheet){
		List<String> list = new ArrayList<String>();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		Row row = sheet.getRow(0);
		for(int i=0;i<cols;i++){
			list.add(this.parseCell(row.getCell(i)));
		}
		return list;
	}
}
