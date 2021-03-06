package com.class29;

import java.util.ArrayList;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        System.out.println(subjects);

        for(int i=0; i<subjects.size(); i++){
            if(subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        System.out.println(subjects);

        for(int i=subjects.size()-1; i>=0; i--){
            if(subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        System.out.println(subjects);
    }
}
