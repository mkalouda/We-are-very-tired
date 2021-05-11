package com.reviewclass10;


import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(110);
        numbers.add(33);
        numbers.add(11);
        numbers.add(25);
        System.out.println(numbers);

        int index = numbers.indexOf(110);
        numbers.remove(index);
        System.out.println(numbers);

        numbers.remove(new Integer(2));
        System.out.println(numbers);

    }
}
