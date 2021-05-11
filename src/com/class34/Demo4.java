package com.class34;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            String name=null;
            System.out.println(name.length());
            int arr[]={10,60};
            System.out.println(arr[5]);
            System.out.println(arr[-1]);
        }catch (NullPointerException e){
            System.out.println("Can not call methods on a null object");
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero, please contact HR");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound please stay inside");
        }catch (Exception e){
            System.out.println("TO HANDLE ANY OTHER ERROR");
        }
    }
}
