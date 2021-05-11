package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");

        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // System.out.println(iterator.next());get an error since they have already been called,will have to call again

        Iterator<String> iterator2 = subjects.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().length() > 4) {
                iterator2.remove();
            }
            System.out.println(iterator2.next());
        }

        /*Iterator<String> iterator3 = subjects.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
            System.out.println(iterator3.hasNext());
            System.out.println(iterator3.next());
            if (iterator3.next().length() > 4) {
                iterator3.remove();
            }
        }*/

        Iterator<String> iterator3 = subjects.iterator();
        while (iterator3.hasNext()){
            String var = iterator3.next();
            if(var.length()>4){
                iterator3.remove();
            }
        }
        System.out.println(subjects);


    }
}