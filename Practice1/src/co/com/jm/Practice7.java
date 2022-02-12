package co.com.jm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice7 {

    public void menuActors(){

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int input;

        while (!exit){

            System.out.println("------------------------------------------");
            System.out.println("******CYMETOGRAPHIC MANAGEMENT*******");
            System.out.println("------------------------------------------");
            System.out.println("1. NEW ACTOR" );
            System.out.println("2. SEARCH ACTOR" );
            System.out.println("3. DELETE ACTOR" );
            System.out.println("4. MODIFY ACTOR" );
            System.out.println("5. LOOK ALL ACTORS" );
            System.out.println("6. LOOK ACTOR'S MOVIES");
            System.out.println("7. LOOK ACTOR'S MOVIES CATEGORY" );
            System.out.println("8. EXIT");
            System.out.println("------------------------------------------");

            try{
                System.out.println("Would you like to introduce the number: ");
                input = sc.nextInt();

                switch (input){

                    case 1:
                        System.out.println("You select 1. NEW ACTOR ");
                        break;

                    case 2:
                        System.out.println("You select 2. SEARCH ACTOR ");
                        break;

                    case 3:
                        System.out.println("You select 3. DELETE ACTOR ");
                        break;

                    case 4:
                        System.out.println("You select 4. MODIFY ACTOR ");
                        break;

                    case 5:
                        System.out.println("You select 5. LOOK ALL ACTORS ");
                        break;

                    case 6:
                        System.out.println("You select 6. LOOK ACTOR'S MOVIES ");
                        break;

                    case 7:
                        System.out.println("You select 7. LOOK ACTOR'S MOVIES CATEGORY ");
                        break;

                    case 8:
                        System.out.println("You select 8. EXIT. GOOD BYE! :) ");
                        exit = true;
                        break;

                    default:
                        System.out.println("Please insert a valid option:  ");

                }


            } catch (InputMismatchException e){
                System.out.println("Please insert a valid option:  ");
                sc.next();

            }

        }







    }



}
