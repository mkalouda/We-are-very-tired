package com.class22;

class grandParent{
    String color ="White";
}

class parent extends grandParent{
    String color ="Black";
}

class grandChild extends parent{
    String color ="Red";
    void printInfo(){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        grandChild grandChild = new grandChild();
        grandChild.printInfo();
    }
}


