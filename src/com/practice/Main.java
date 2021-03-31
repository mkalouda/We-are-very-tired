package com.practice;

public class Main {

    static String alphabetical(String str){
        String answer="";

        for (int i=0; i<str.length(); i++){
            char greatest= str.charAt(i);
            if(str.charAt(i)>greatest || str.charAt(0)==greatest){
                answer+=str.charAt(i);
            }
        }return answer;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }

}
