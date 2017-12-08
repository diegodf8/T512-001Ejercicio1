package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main (String [] args ){

        int[] numeros = {10,20,36,49,56};
        int numerotabla = 1;

        System.out.println("/////////////////////////////////////");
        for (int j =0; j < numeros.length; j++){
            System.out.println(numeros[j]);
        }

        System.out.println("**************************************");

        for (int i: numeros){
            System.out.println(i);
        }
        System.out.print("Introduce numero para calcular su tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        numerotabla=sc.nextInt();



        for (int k =0; k <=10; k++){
            System.out.println(numerotabla +" * " + k + " " + (k*numerotabla));

        }

    }
}
