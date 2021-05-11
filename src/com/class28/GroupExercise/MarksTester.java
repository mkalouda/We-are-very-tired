package com.class28.GroupExercise;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA=new StudentA(90,88,80);
        studentA.getPercentage();

        System.out.println();

        StudentB studentB=new StudentB(99,91,94,88);
        studentB.getPercentage();
    }
}
