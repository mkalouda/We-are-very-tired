package com.class28.GroupExercise;

public abstract class Marks {

    abstract void getPercentage();
    double subject1;
    double subject2;
    double subject3;

    public Marks(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
}
class StudentA extends Marks{
    double average=0;
    public StudentA(double subject1, double subject2, double subject3) {
        super(subject1, subject2, subject3);
    }

    @Override
    void getPercentage() {
        average=(subject1+subject2+subject3)/3;
        System.out.println("Student A average is "+average);
    }
}

class StudentB extends Marks{

    double subject4;
    double average=0;

    public StudentB(double subject1, double subject2, double subject3, double subject4) {
        super(subject1, subject2, subject3);
        this.subject4=subject4;
    }

    @Override
    void getPercentage() {
        average=(subject1+subject2+subject3+subject4)/4;
        System.out.println("Student B average is "+average);
    }
}
