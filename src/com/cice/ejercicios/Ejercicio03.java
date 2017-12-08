package com.cice.ejercicios;

public class Ejercicio03 {
    public static void main (String [] args ){

        int[] numeros = {10,20,36,49,56};

        System.out.println("/////////////////////////////////////");
        for (int j =0; j < numeros.length; j++){
            System.out.println(numeros[j]);
        }

        System.out.println("**************************************");

        for (int i: numeros){
            System.out.println(i);
        }

    }
}
