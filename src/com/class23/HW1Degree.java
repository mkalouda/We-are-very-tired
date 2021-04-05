package com.class23;

public class HW1Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends  HW1Degree{


}
class Masters extends HW1Degree{

    void getPrerequisite() {
        System.out.println("Then hopefully get a masters");
    }

    public static void main(String[] args) {
        Masters masters = new Masters();
        Bachelors bachelors = new Bachelors();
        HW1Degree hw1Degree = new HW1Degree();
        hw1Degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}
