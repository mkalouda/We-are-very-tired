package com.class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mariamosman/Desktop/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        Map<String,String> map = new HashMap<>();

        int noOfRowsInASheet = sheet.getPhysicalNumberOfRows();
        System.out.println(noOfRowsInASheet);
        for (int i = 1; i < noOfRowsInASheet; i++) {
            Row row = sheet.getRow(i);

            int noOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                //System.out.print(row.getCell(j)+" ");
                String key = sheet.getRow(0).getCell(j).toString();
                String value = row.getCell(j).toString();
                System.out.print(key+" "+value+" ");
                map.put(key,value);
            }
            System.out.println();
        }
    }
}
