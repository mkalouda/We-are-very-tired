package com.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws IOException {

        String path =System.getProperty("user.dir")+"/Files/Configuration.properties";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("name"));
    }
}
