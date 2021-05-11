package com.class28.GroupExercise;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.setEmail("mkksd@yahoo.com");
        System.out.println(registration.getEmail());

        registration.create("munzzzzzzz","123456");
    }
}
