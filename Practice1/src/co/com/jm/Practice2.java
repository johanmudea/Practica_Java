package co.com.jm;

import java.util.Scanner;

public class Practice2 {

    public void function2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input Radius: ");
        String radius = sc.nextLine();
        double doble = Double.parseDouble(radius);

        double area = Math.PI*Math.pow(doble, 2);


        System.out.println("You choose Radius: "+ radius);
        System.out.println("Your Area is: "+ area);



    }
    public void iva() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input price of product to calculate the IVA(with decimals) : ");
        String inputPrice = sc.nextLine();
        double price = Double.parseDouble(inputPrice);
        double IVA_PERCENTAGE = 21;

        double ivaCalc = (price*IVA_PERCENTAGE)/100;
        double priceCalc = price+ivaCalc;

        System.out.println("Your product IVA value is: "+ ivaCalc);
        System.out.println("Your product TOTAL price is: "+ priceCalc);


    }
}


