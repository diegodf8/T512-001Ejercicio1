package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args){
       int opcion = 0;
       int a = 0;
       int b = 0;
        Scanner sc = new Scanner(System.in);
       do{
           System.out.println("****MENU****");
           System.out.println("Elige una opcion");
           System.out.println("1.-Suma");
           System.out.println("2.-Resta");
           System.out.println("0.-Salir");
           System.out.println("*******************");

           opcion = sc.nextInt();
           System.out.println("Has elegido: "+ opcion);
           System.out.println();


           if (opcion == 1){
               System.out.print("Introduce A: ");
               a = sc.nextInt();

               System.out.print("Introduce B: ");
               b = sc.nextInt();

               System.out.print("SUMA:" + (a + b));
               System.out.println();
           }
           else if (opcion == 2){
               System.out.print("Introduce A: ");
               a = sc.nextInt();

               System.out.print("Introduce B: ");
               b = sc.nextInt();

               System.out.print("RESTA:" + (a - b));
               System.out.println();
           } else {
               System.out.println("ADIOS");
           }
       } while(opcion != 0);

    }
}
