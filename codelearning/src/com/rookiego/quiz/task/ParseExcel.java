package com.rookiego.quiz.task;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ParseExcel {
	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\D\\Desktop\\high-canada.xls";
		InputStream stream = new FileInputStream(path);

		String college = "圣力嘉应用艺术与技术学院";
		List result = new ArrayList();

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(stream);

		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			System.out.println("SHEET" + (numSheet + 1));
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				List rowList = new ArrayList();
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);

				int minColIx = hssfRow.getFirstCellNum();
				int maxColIx = hssfRow.getLastCellNum();

				for (int colIx = minColIx; colIx < maxColIx; colIx++) {
					HSSFCell cell = (HSSFCell) hssfRow.getCell(colIx);
					if (cell == null) {
						continue;
					}
					rowList.add(cell);

				}

				if (rowList.contains(college)) {
					result.add(rowList);
					result.add("\n");
				}

				System.out.println(rowList);
				System.out.println();
			}

		}
		System.out.println("解析完成");

		System.out.println("同属于圣力嘉应用艺术与技术学院的学生名录为：");
		System.out.println(result);

		
	}

}
