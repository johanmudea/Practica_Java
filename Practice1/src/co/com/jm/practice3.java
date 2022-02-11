package co.com.jm;

public class practice3 {


    public void pairsWhile(){
        System.out.println("-----------------------------------------------");
        System.out.println("WHILE");
        System.out.println("-----------------------------------------------");
        int i=1;
        while(i<=100){
            if(i % 2 == 0){
                    System.out.println("The "+i+" is Pair.");

            }else if(i % 2 != 0){
                   System.out.println("The "+i+" is NOT Pair.");
            }
        i++;

        }
        System.out.println("-----------------------------------------------");
        System.out.println("FOR");
        System.out.println("-----------------------------------------------");

    }

    public void pairsFor(){
        int j;
        for (j=1;j<=100;j++){
            if(j % 2 == 0){
                System.out.println("The "+j+" is Pair.");

            }else if(j % 2 != 0){
                System.out.println("The "+j+" is NOT Pair.");
            }


        }


    }

}
