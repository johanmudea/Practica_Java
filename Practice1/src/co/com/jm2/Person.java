package co.com.jm2;

public class Person {
    private String name = "";
    private int age = 0;
    private int DNI=0;
    private char sex= 'M';
    private double weight = 0;
    private double height = 0;


    public Person(){

        int randomDNI;
        double eightDigits = 10000000 + Math.random() * 90000000;
        randomDNI=(int) eightDigits;


        this.name = "";
        this.age = 0;
        this.DNI = randomDNI;
        this.sex= 'M';
        this.weight = 0;
        this.height = 0;

        System.out.println("Constructor Working.");
        System.out.println("**********************************************************");


    }

    public Person(String name, int age, char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;

        System.out.println("Constructor Working.");
        System.out.println("**********************************************************");

    }

    public Person(String name, int age, char sex, int DNI, double weight, double height){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.DNI=DNI;
        this.weight=weight;
        this.height=height;

        System.out.println("Constructor Working.");
        System.out.println("**********************************************************");



    }

    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;

    }
    public int getAge(int age){
        return this.age;
    }

    public void setSex(char sex){
        this.sex=sex;

    }
    public char getSex(){
        return this.sex;
    }

    public void setWeight(double weight){
        this.weight=weight;

    }
    public double getWeight(){
        return this.weight;
    }

    public void setHeight(double height){
        this.height=height;

    }
    public double getHeight(){
        return this.height;
    }




    public int calcIMC(){

        double temp = height*height;
        double imc1 = weight/temp;

        int imc =(int) Math.round(imc1);

        System.out.println("Your IMC is: "+imc);

        int RET;

        if(imc<20){

            System.out.println("You are thin");
            System.out.println("**********************************************************");

            RET=-1;
        }else if(imc>25){

            System.out.println("Let's slim a little bit");
            System.out.println("**********************************************************");

            RET=1;
        } else{

            System.out.println("Your weight is ideal");
            System.out.println("**********************************************************");

            RET=0;
        }

        return RET;

    }

    public boolean esMayorDeEdad(){

        boolean value=false;
        if(age<18){
            System.out.println("Just "+ age +", You are a child. ");

            value=false;

        } else{
            System.out.println("With "+age+ " is enough, you are a Big man. ");

            value=true;
        }

      return value;
    }


    public void comprobarSexo(char sex){
         if(sex == 'M'){
             System.out.println("Effectly, the result is correct.");
         }else{
             //System.out.println("The selection is not correct. you wil be asigned 'M' by default");
             sex = 'M';
         }
        System.out.println("Your sex is: "+sex);
        System.out.println("**********************************************************");




    }

     public void  generateDNI(){
        int randomDNI;
        double eightDigits = 10000000 + Math.random() * 90000000;
            randomDNI=(int) eightDigits;
            System.out.println(randomDNI);

     }




    public String toString(){


        System.out.println("**********************************************************");
        return "Name "+name+" age "+ age+" DNI "+ DNI+" sex "+sex+" weight "+weight+" height "+height;

    }







}
