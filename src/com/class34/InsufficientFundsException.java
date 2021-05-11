package com.class34;

public class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(String msg){
           super(msg);
    }
}
