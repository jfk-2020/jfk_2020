package com.jfk.lesson23Generics;

public class ResourceUpdateProcessor <T extends ResourceReader> {
    public static void main(String[] args) {
        ResourceUpdateProcessor<SQLReader> sqlReader = new ResourceUpdateProcessor<SQLReader>();
        ResourceUpdateProcessor<ExcelReader> excelReader = new ResourceUpdateProcessor<ExcelReader>();
    }
}
