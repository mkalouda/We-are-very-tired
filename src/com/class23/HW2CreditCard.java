package com.class23;

public class HW2CreditCard {
    double balance;
    double interest;


    void calculate(double balance){
        interest = balance*.04;
        System.out.println(interest);
    }
}
class Visa extends HW2CreditCard{

}
class AX extends HW2CreditCard{

    void calculate(double balance){
        interest = balance*.03;
        System.out.println(interest);
    }
}

class Tester{
    public static void main(String[] args) {
        HW2CreditCard hw2CreditCard = new HW2CreditCard();
        hw2CreditCard.calculate(1000);

        Visa visa = new Visa();
        visa.calculate(1000);

        AX ax = new AX();
        ax.calculate(1000);
    }
}

