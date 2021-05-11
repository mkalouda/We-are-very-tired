package com.class28.GroupExercise;

public class Registration {
    private String email;
    private String userName;
    private String password;

    /*public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }*/

    void setEmail(String email){
        if(email.contains("@yahoo.com")){
            this.email=email;
        }else{
            System.out.println("Email used must be yahoo");
        }
    }

    String getEmail(){
        return email;
    }

    void create(String userName, String password){
        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password can not be empty");
        }else if(userName.length()<6 || password.length()<6){
            System.out.println("Username or password can not be less than 6 characters");
        }else if(userName.equals(password)){
            System.out.println("Username and password can not be same");
        }else {
            this.userName=userName;
            this.password=password;
            System.out.println("Username and password is created");
        }
    }

}
