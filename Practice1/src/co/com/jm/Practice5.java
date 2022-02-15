package co.com.jm;

import java.util.Scanner;

/**
9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
10. Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
11. Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
*/

public class Practice5 {

    Scanner sc = new Scanner(System.in);

    public  void smile() {



        //QUE HACER CON LA TILDE DE LA A
        String S1 = new String("La sonrisa es y será la mejor arma contra la tristeza");
        System.out.println(S1);
        System.out.println("Please, input your Phrase making sense with the example: ");
        String S2 = sc.nextLine();

        System.out.println("-----PHRASES-----");
        System.out.println("Original String is ': " + S1);
        System.out.println("String after replacing all 'a' with 'e': " + S1.replace('a', 'e'));
        System.out.println(S1.replace('a', 'e'));
        System.out.println(S1+" y "+S2);
        System.out.println("-----REPLACE CHARACTERS-----");
        System.out.println(S2.replace(" ", ""));
        System.out.println("-----LENGTH CHARACTERS-----");
        int numbersOfCharacters = S2.length();
        System.out.println("the total of characters in: "+ S2 +" is: "+ numbersOfCharacters);
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        for (int i = 0; i <S2.length();i++ ){
            if (S2.charAt(i)=='a') {
                contadorA++;
            }else if(S2.charAt(i)=='e') {
                contadorE++;
            }else if(S2.charAt(i)=='i') {
                contadorI++;
            }else if(S2.charAt(i)=='o') {
                contadorO++;
            }else if(S2.charAt(i)=='u') {
                contadorU++;
            }
        }
        System.out.println("The Phrase " + S2 + "contains " + contadorA + " As");
        System.out.println("The Phrase " + S2 + "contains " + contadorE + " Es");
        System.out.println("The Phrase " + S2 + "contains " + contadorI + " Is");
        System.out.println("The Phrase " + S2 + "contains " + contadorO + " Os");
        System.out.println("The Phrase " + S2 + "contains " + contadorU + " Us");

    }



}
