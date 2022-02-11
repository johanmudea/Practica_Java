package co.com.jm;

import java.util.Scanner;

public class Practice1 {

    public void function1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input first number: ");
        int number1 = sc.nextInt();

        System.out.println("Please, input second number: ");
        int number2 = sc.nextInt();

        if(number1>number2){
            System.out.println(number1 + " is bigger than "+number2);
        }
        else if(number2>number1){
            System.out.println(number2 + " is bigger than "+number1);

        }
        else if(number1 == number2){
            System.out.println(number2 + " and "+number1+ " are equals.");


        }



    }

}
