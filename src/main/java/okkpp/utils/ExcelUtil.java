package okkpp.utils;

import java.io.File;
import java.io.IOException;
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

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月19日 上午11:33:38 
 * @version 1.0 
 */
public class ExcelUtil {

	public static void main(String[] args) {
		File file = new File("B:\\download_excel\\1.xls");
		ExcelUtil eu = new ExcelUtil();
		try {
			eu.xls(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//解析结果存为 list map data
	public List<Map<String,Object>> data = new ArrayList<>();
	public Map<String,Object> info = new HashMap<>();
	public void xls(File file) throws InvalidFormatException, IOException{
		Workbook workbook = WorkbookFactory.create(file);
		//获取excel表格页数
		int sheetCount = workbook.getNumberOfSheets();
		if(sheetCount<2)return;
		
		Sheet sheet = workbook.getSheetAt(0);
		sheet.removeColumnBreak(0);
		int rows = sheet.getLastRowNum() + 1;
		int cols = sheet.getRow(3).getPhysicalNumberOfCells();
		List<String> keys = getKeys(workbook.getSheetAt(0),4);
		if(keys.size()==0) {
			System.out.println("没有找到key集合！");
			return;
		}
		this.data = new ArrayList<>();
		getData(sheet, rows, cols, 4, keys);
	}
	private int JUMP = 43;
	private void getData(Sheet sheet,int rows,int cols,int startRowNum,List<String> keys) {
		for (int row = startRowNum; row < rows; row++){
			Row r = sheet.getRow(row);
			Map<String,Object> map = new HashMap<>();
			if(!isNeed(parseCell(r.getCell(1))))continue;
			for(int i=0;i<cols-JUMP;i++){
				//这个地方需要修改 ！！！！！！！！！！！！！！关于data的key值定位
				map.put(keys.get(i), parseCell(r.getCell(i==0?i:i+JUMP)));
			}
			//System.out.println(new Gson().toJson(map));
			this.data.add(map);
		}
	}
	private List<String> getKeys(Sheet sheet,int rowNum){
		List<String> list = new ArrayList<>();
		int cols = sheet.getRow(rowNum-1).getPhysicalNumberOfCells();
		Row row = sheet.getRow(rowNum-1);
		for(int i=0;i<cols-JUMP;i++){
			list.add(this.parseCell(row.getCell(i==0?i:i+JUMP)));
		}
		int i=0;
		for(String key : list) {
			this.info.put("field"+i, key);
			i++;
		}
		//System.out.println(new Gson().toJson(info));
		return list;
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
	private boolean isNeed(String code) {
		switch(code) {
		case "ALB":
		case "BGR":
		case "BIH":
		case "CZE":
		case "EST":
		case "HRV":
		case "HUN":
		case "LTU":
		case "LVA":
		case "MKD":
		case "MNE":
		case "POL":
		case "ROU":
		case "SRB":
		case "SVK":
		case "SVN": return true;
			default : return false;
		}
	}
	/**	public String parseFile(MultipartFile mfile,String path) {
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
			if(size<1)return "没有数据。";
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return "文件错误。";
		} catch (IOException e) {
			e.printStackTrace();
			return "解析错误。";
		} catch (InvalidFormatException e) {
			e.printStackTrace();
			return "无效文件。";
		}
		return "上传成功！一共"+size+"条数据。";
	}**/
}
