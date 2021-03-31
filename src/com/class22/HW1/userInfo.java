package com.class22.HW1;

public class userInfo extends userClass{
    String address;

    public userInfo(String name, String mobileNumber,String address) {
        super(name,mobileNumber);
        this.address = address;
    }

    void userDetails(){
        System.out.println(name+" "+ mobileNumber+" "+address);
    }
}
