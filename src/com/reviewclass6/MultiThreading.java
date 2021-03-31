package com.reviewclass6;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Starting the download");
        downloadTheGame();
        System.out.println("Waiting for the downlaod");
        extractTheGame();
        System.out.println("Done");
    }
    public static void downloadTheGame() throws  InterruptedException{
        Thread.sleep(10000);
        System.out.println("Game download");
    }

    public static void extractTheGame() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("Extracting the Game");
    }

}
