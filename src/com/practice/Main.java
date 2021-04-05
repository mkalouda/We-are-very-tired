package com.practice;

public class Main {

    static String alphabetical(String str){
        String answer="";
        char greatest = str.charAt(0);

        for (int i=1; i<str.length(); i++){
            if(str.charAt(i)>greatest){
                greatest=str.charAt(i);
                answer+=str.charAt(i);
            }else{
                greatest=str.charAt(i);
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
