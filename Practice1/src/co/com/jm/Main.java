package co.com.jm;


import co.com.jm2.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input name:");
        String nombre = sc.nextLine();
        System.out.println("Input age:");
         int edad = sc.nextInt();
        System.out.println("Input sex:");
        char sexo = sc.next().charAt(0);
        System.out.println("Input weight:");
        String peso1 = sc.nextLine();
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Input height:");
        String altura1 = sc.nextLine();
        double altura = Double.parseDouble(altura1);
        System.out.println("**********************************************************");
        System.out.println("We are Working on create a Object with these iformation:");
        System.out.println("Please wait a a few seconds more");
        System.out.println("**********************************************************");



        Person ob1 = new Person();


        ob1.setName(nombre);
        ob1.setAge(edad);
        ob1.setWeight(peso);
        ob1.setHeight(altura);
        ob1.calcIMC();
        ob1.comprobarSexo(sexo);
        ob1.esMayorDeEdad();
        System.out.println(ob1.toString());






        System.out.println("Input name:");
        String nombre1 = sc.nextLine();
        System.out.println("Input age:");
        int edad1 = sc.nextInt();
        System.out.println("Input sex:");
        char sexo1 = sc.next().charAt(0);
        System.out.println("Input weight:");
        String peso3 = sc.nextLine();
        double peso2 = Double.parseDouble(sc.nextLine());
        System.out.println("Input height:");
        String altura3 = sc.nextLine();
        double altura2 = Double.parseDouble(altura3);
        System.out.println("**********************************************************");
        System.out.println("We are Working on create a Object with these iformation:");
        System.out.println("Please wait a few seconds more");
        System.out.println("....................");

        Person ob2 = new Person();

        ob2.setName(nombre1);
        ob2.setAge(edad1);
        ob2.setSex(sexo1);
        ob2.calcIMC();
        ob2.comprobarSexo(sexo);
        ob2.esMayorDeEdad();
        System.out.println(ob2.toString());

        System.out.println("**********************************************************");
        System.out.println("We are Working on create a Object with default information");
        System.out.println("Please wait a few seconds more");
        System.out.println("**********************************************************");

        Person ob3 = new Person();

        ob3.setName("johan");
        ob3.setAge(29);
        ob3.setWeight(80.5);
        ob3.setHeight(1.7);
        ob3.calcIMC();
        ob3.comprobarSexo(sexo);
        ob3.esMayorDeEdad();
        System.out.println(ob3.toString());






















        //Practice1 pr1 = new Practice1();
       //pr1.function1();

        //Practice2 pr2 = new Practice2();
        //pr2.function2();
        //pr2.iva();

        //practice3 pr3 = new practice3();
        //pr3.pairsWhile();
        //pr3.pairsFor();

        //Practice4 pr4 = new Practice4();
        //pr4.doWhile();
        //pr4.weekend();

        //Practice5 pr5 = new Practice5();
        //pr5.smile();

        //Practice6 pr6 = new Practice6();
        //pr6.differences();
        //pr6.dateNow();
        //pr6.introducedNumber();

        //Practice7 pr7 = new Practice7();
        //pr7.menuActors();

    }
}





