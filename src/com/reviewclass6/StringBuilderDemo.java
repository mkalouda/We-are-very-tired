package com.reviewclass6;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        //stringBuilder.append(" Batch 9").delete(0,5);
        //stringBuilder.append(" Batch 9").deleteCharAt(0)
        //stringBuilder.append(" Batch 9").insert(13, ".bye ");
        stringBuilder.append(" How are you jack");
        stringBuilder.insert(stringBuilder.indexOf("you")+4,"bye ");
        System.out.println(stringBuilder.indexOf("you"));

        System.out.println(stringBuilder);

        String string = new String("Hello");
        string.concat(" Batch 9");
        System.out.println(string);
    }
}
