package com.casa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int fact=1;
        int numero=7;
        int numero2;

        Scanner reader = new Scanner (System.in);
        numero2=reader.nextInt();

        for (int i=1;i<=numero2;i++){
            fact*=i;
            System.out.println(fact);
        }

    }
}
