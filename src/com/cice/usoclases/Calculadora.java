package com.cice.usoclases;

import java.util.Scanner;

public class Calculadora {

    Scanner sc = new Scanner(System.in);
    int numerando1 = 0;
    int numerando2 = 0;
    public void mostrarMenu(){

        // variable internas del metodo
        int opcion = 0;

        System.out.println("CALCULADORA");
        System.out.println("****************");

        do{

            System.out.println("1.- SUMAR");
            System.out.println("2.- RESTAR");
            System.out.println("3.- MULTIPLICAR");
            System.out.println("4.- DIVIDIR");
            System.out.println("0.- SALIR");
            System.out.println("****************");
            System.out.print("Selecciona operacion: ");

            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 0:
                    System.out.println("Gracias por usar la calculadora");
                    break;
                default:
                    System.out.println("La opcion selecciona no es valida");

            }

        }while (opcion != 0);

    }

    public void recogidaDatos(){

        System.out.print("Inroduce el primer numerando: ");
        numerando1 = sc.nextInt();

        System.out.print("Introduce el segundo numerando");
        numerando2 = sc.nextInt();

    }

    public void sumar(){

      /*  int numerando1 = 0;
        int numerando2 = 0;

        System.out.print("Inroduce el primer numerando: ");
        numerando1 = sc.nextInt();

        System.out.print("Introduce el segundo numerando");
        numerando2 = sc.nextInt();
*/
       recogidaDatos();
       System.out.println("El resultado de la suma es: " + (numerando1 + numerando2));
       System.out.println("***********************************");

    }

    public void restar(){

        recogidaDatos();
        System.out.println("El resultado de la resta es: " + (numerando1 - numerando2));
        System.out.println("***********************************");
    }

    public void multiplicar(){

        recogidaDatos();
        System.out.println("El resultado de la multiplicacion es: " + (numerando1 * numerando2));
        System.out.println("***********************************");
    }

    public void dividir(){

        recogidaDatos();
        System.out.println("El resultado de la division es: " + (numerando1 / numerando2));
        System.out.println("***********************************");
    }

}
