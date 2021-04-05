package com.practice;

class Repl {
    public static String alphabetical(String str){
        char a=str.charAt(0);
        String c="";
        c=c+str.charAt(0);
        for(int i=1; i<str.length();i++){
            if (str.charAt(i)>a){
                a=str.charAt(i);
                c=c+str.charAt(i);
            }else{
                a=str.charAt(i);
            }
        }
        return c;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}




