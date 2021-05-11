package com.reviewclass10;


public class DatabaseTester {
    public static void main(String[] args) {
        DataBase dataBase = new OracleDatabase();
        dataBase.readFromDataBase("Database1");
        dataBase.writeFromDataBase("Database1");
        dataBase.modifyFromDataBase("Database1");
    }
}
