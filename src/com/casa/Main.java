package com.casa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long fact=1;
        long numero2;
        int [] num = {3,5,7,34,3};
        int aux=0;

        /*Scanner reader = new Scanner (System.in);
        System.out.println("Introduzca numero entero para calcular factorial");
        numero2=reader.nextLong();

        for (long i=1;i<=numero2;i++){
            fact*=i;
        }
        System.out.println("El factorial de "+numero2+" es "+fact);
        */
        for (int j :num){
            System.out.println(j);
        }

        for (int k=0;k<num.length;k++){
            System.out.println(num[k]);
        }

        int l=0;
        int acu=0;
        System.out.println("++++++++++++++++++++++++++++");
        while (num[l]<20){
            System.out.println(num[l]);
            acu+=num[l];
            System.out.println("ACU:"+acu);

            l++;
        }

    }
}
