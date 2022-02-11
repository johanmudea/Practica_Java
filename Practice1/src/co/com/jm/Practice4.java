package co.com.jm;

import java.util.Scanner;

public class Practice4 {

    Scanner sc = new Scanner(System.in);
    int number;

    public void doWhile() {

        do {
            System.out.println("Please, input your number: ");
            number = sc.nextInt();
            if (number >= 0) {
                System.out.println("Number is: " + number);
            }
        }

        while (number<0);


    }


}
