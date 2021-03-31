package com.class22;

public class UserInfo extends UserClass{
    String address;
    UserInfo(String name, String phoneNumber, String address){
        super(name, phoneNumber);
        this.address=address;
    }

    void userDetail(){
        System.out.println("Name: " + name + " Phone number: " + phoneNumber + " Address: " + address);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("munz", "444-233-2222", "123 Wallaby way");
        userInfo.userDetail();
    }
}
