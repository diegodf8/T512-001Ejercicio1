package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("*************");
        System.out.print("Introduce un numero entero: ");
        a = sc.nextInt();
        System.out.print("Introduce otro numero entero: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("A (" + a + ") es mayor que B( " + b + ")");
        } else if (a == b) {
            System.out.println("A (" + a + ") es igual que B (" + b + ")");
        } else {
            System.out.println("A (" + a + ") es menor que B (" + b + ")");
        }
    }

}