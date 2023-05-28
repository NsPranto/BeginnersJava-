package array_demo;

import java.util.ArrayList;

public class ArrayList_Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1=new ArrayList<>();
        ArrayList<Integer> number2=new ArrayList<>();
        ArrayList<Integer> number3=new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("Number 1= "+number1);

        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.println("Number 2= "+number2);

        //By '.addAll' method we can assign arraylist name
        number3.addAll(0, number1);
        System.out.println("Number 3= "+number3);
        
        //'.equals' method can check equality between two arraylist
        //'boolean example' prints out the result true or false
        Boolean result=number1.equals(number3);
        System.out.println("Number1==Number3 :"+result);

        Boolean result2=number1.equals(number2);
        System.out.println("Number1==Number2 :"+result2);
    }
}
