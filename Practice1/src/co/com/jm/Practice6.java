package co.com.jm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
12. Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
13. Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
14. Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
*/

public class Practice6 {

    Scanner sc = new Scanner(System.in);


    public void differences() {

        System.out.println("Please, input your first word : ");
        String first = sc.nextLine();

        System.out.println("Please, input your last word : ");
        String last = sc.nextLine();

        if (first.equalsIgnoreCase(last)) {

            System.out.println("Are Equals");

        } else
            System.out.println(" Are Not Equals");

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                System.out.println("ok");


            }
        }


    }

    /**
     * Podemos obtener la fecha-hora actual usando la clase LocaleDateTime con el método now().
     * Devuelve la fecha y la hora en formato YYYY-MM-DD-hh-mm-ss.zzz que parece 2020-09-22T14:39:33.889798.
     * Para hacerlo más fácil de leer, usaremos DateTimeFormatter.ofPattern(pattern)
     * que toma un patrón de fecha y hora que podemos personalizar según nuestras necesidades.
     * es necesario (import java.time.format.DateTimeFormatter;)
     */

    public void dateNow() {

        System.out.println("Would you like to know the current date? y/n: ");
        String answer = sc.nextLine();

        switch (answer) {

            case "y":
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                System.out.println("Year/Month/Day (HH:mm:ss)-> " + dtf.format(LocalDateTime.now()));
                break;
            case "n":
                System.out.println("You select /no");
                System.out.println("GOOD BYE");
                break;

            default:
                System.out.println("Please insert a valid option");


        }


    }

    public void introducedNumber() {

        System.out.println("Would you like to introduce the number: ");
        int input = sc.nextInt();

        for(int i= input; i<=1000;i=i+2){
            System.out.println(i);

        }


     }
}










