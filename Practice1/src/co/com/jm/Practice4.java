package co.com.jm;

import java.util.Scanner;
/**
7. Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
8. Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
*/

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
    String day="";

    public void weekend(){

        System.out.println("Please, input your Day: ");
        String day = sc.nextLine();
        String selection = "";

          switch (day)
          {

              case "monday":
                  System.out.println("You will have to work");
                  break;
              case "tuesday":
                  System.out.println("You will have to work");
                  break;
              case "wednesday":
                  System.out.println("You will have to work");
                  break;
              case "thursday":
                  System.out.println("You will have to work");
                  break;
              case "friday":
                  System.out.println("You will have to work");
                  break;
              case "saturday":
                  System.out.println("You deserve a break");
                  System.out.println("ENJOY with your friends.");
                  break;
              case "sunday":
                  System.out.println("You deserve a break");
                  System.out.println("ENJOY with your Family.");
                  break;

              default:
                  System.out.println("Please insert a valid day in english, Thanks. ");
                  break;
          }

    }
}
