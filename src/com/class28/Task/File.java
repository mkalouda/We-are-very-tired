package com.class28.Task;

public abstract class File {
    public void edit(){
        System.out.println("Editing the file");
    }
    public void close(){
        System.out.println("File closed");
    }
    abstract void open();
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("Special class to open Java files");
    }
}

class WordFile extends File{

    @Override
    void open() {
        System.out.println("Opening the word file");
    }
}

class PdfFile extends File{

    @Override
    void open() {
        System.out.println("Opening the PDF file");
    }
}
