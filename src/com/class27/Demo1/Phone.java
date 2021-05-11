package com.class27.Demo1;

abstract class Phone{
    void makeCalls(){
        System.out.println("Calling");
    }
    void sendText(){
        System.out.println("Sending tect");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}
class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphone uses photos app to display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone users can unlock the phone by faceID");
    }
}
class Samsung extends Phone{

    @Override
    void unlockPhone() {
        System.out.println("Can unlock both with faceID and fingerprint");
    }

    @Override
    void displayPictures() {
        System.out.println("Use the gallery app to display the pictures");
    }
}
