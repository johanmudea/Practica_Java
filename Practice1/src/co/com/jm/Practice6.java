package co.com.jm;

import java.util.Scanner;

public class Practice6 {

    Scanner sc = new Scanner(System.in);



    public void differences(){

        System.out.println("Please, input your first word : ");
        String first = sc.nextLine();

        System.out.println("Please, input your last word : ");
        String last = sc.nextLine();

        if(first.equalsIgnoreCase(last)){

            System.out.println("Are Equals");

        } else
            System.out.println(" Are Not Equals");

        for (int i = 0; i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                System.out.println("ok");




            }
        }











    }



}
