package com.reviewclass10;

public abstract class DataBase {

    public abstract void readFromDataBase(String dataBaseName);
    public abstract void writeFromDataBase(String dataBaseName);
    public abstract void modifyFromDataBase(String dataBaseName);
}

class OracleDatabase extends DataBase{

    @Override
    public void readFromDataBase(String dataBaseName) {
        System.out.println("We are the Oracle experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }

    @Override
    public void writeFromDataBase(String dataBaseName) {
        System.out.println("We are the Oracle experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }

    @Override
    public void modifyFromDataBase(String dataBaseName) {
        System.out.println("We are the Oracle experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }
}

class MicrosoftDatabase extends DataBase{

    @Override
    public void readFromDataBase(String dataBaseName) {
        System.out.println("We are the Microsoft experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }

    @Override
    public void writeFromDataBase(String dataBaseName) {
        System.out.println("We are the Microsoft experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }

    @Override
    public void modifyFromDataBase(String dataBaseName) {
        System.out.println("We are the Microsoft experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }
}

abstract class IBMDatabases extends DataBase{

    @Override
    public void readFromDataBase(String dataBaseName) {
        System.out.println("We are the IBM experts we have provided the implementation" +
                "Reading data from the OracleDataBase");
    }
}
