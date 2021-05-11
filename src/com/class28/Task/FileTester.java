package com.class28.Task;

public class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new PdfFile(), new WordFile()};
        for (File file:files){
            file.open();
            file.edit();
            file.close();
            System.out.println();
        }
    }
}
