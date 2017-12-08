package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main (String [] args) {

        String nombreApellido;
        String fechaNacimiento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Mostrar Nombre y fecha de nacimiento");
        System.out.println("*************************************");
        System.out.print("Introduce tu nombre completo: ");
        nombreApellido = sc.nextLine();
        System.out.print("Introduce fecha de nacimiento: ");
        fechaNacimiento = sc.nextLine();

        System.out.println("Me llamo "+ nombreApellido +" y he nacido el "+ fechaNacimiento);


    }
}
