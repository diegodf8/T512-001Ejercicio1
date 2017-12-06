package com.casa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long fact=1;
        long numero2;

        Scanner reader = new Scanner (System.in);
        numero2=reader.nextInt();

        for (long i=1;i<=numero2;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
