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

public class ExcelUtil {

	public static void main(String[] args) {
		File file = new File("B:\\GDP.xlsx");
		ExcelUtil eu = new ExcelUtil();
		try {
			eu.xls(file,0,3);
//			for(Map<String,Object> map : eu.data)System.out.println(map.get("field0"));
//			for(String k : eu.info.keySet())System.out.println(eu.info.get(k));
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Map<String,Object>> data = new ArrayList<>();
	public Map<String,Object> info = new HashMap<>();
	
	public void xls(File file,int sheetNum,int rowNum) throws InvalidFormatException, IOException{
		Workbook workbook = WorkbookFactory.create(file);
		//鑾峰彇excel琛ㄦ牸椤垫暟
		int sheetCount = workbook.getNumberOfSheets();
		if(sheetCount<0)return;
		
		Sheet sheet = workbook.getSheetAt(sheetNum);
		sheet.removeColumnBreak(0);
		int rows = sheet.getLastRowNum() + 1;
		//System.out.println("rows:"+rows);
		int cols = sheet.getRow(rowNum-1).getPhysicalNumberOfCells();
		//System.out.println("cols:"+cols);
		List<String> keys = getKeys(sheet,rowNum);
		//for(String s : keys)System.out.print(s+" ");
		if(keys.size()==0) {
			System.out.println("没有找到key集合！");
			return;
		}
		this.data = new ArrayList<>();
		getData(sheet, rows, cols, rowNum, keys);
	}
	private int JUMP = 0;
	private void getData(Sheet sheet,int rows,int cols,int startRowNum,List<String> keys) {
		for (int row = startRowNum; row < rows; row++){
			Row r = sheet.getRow(row);
			Map<String,Object> map = new HashMap<>();
			//if(!isNeed(parseCell(r.getCell(1))))continue;
			for(int i=0;i<cols-JUMP;i++){
				String c = parseCell(r.getCell(i==0?i:i+JUMP));
				map.put("field"+i, c);
				//System.out.print(c+" ");
			}
			//System.out.println();
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
	public boolean isNeed(String code) {
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
}
