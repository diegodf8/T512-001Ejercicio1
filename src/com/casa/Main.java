package com.casa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long fact=1;
        long numero2;

        Scanner reader = new Scanner (System.in);
        System.out.println("Introduzca numero entero para calcular factorial");
        numero2=reader.nextLong();

        for (long i=1;i<=numero2;i++){
            fact*=i;
        }
        System.out.println("El factorial de "+numero2+" es "+fact);
    }
}
