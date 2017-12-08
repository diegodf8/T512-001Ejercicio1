package com.cice.ejercicios;

public class Ejercicio04 {
    public static void main(String [] args){

        double[] notas = {10, 6.7, 8,10, 10};
        double notaMedia = 0;
        double aux = 0 ;

        for (double i : notas) {
            aux+=i;
        }

        notaMedia = aux / notas.length;

        System.out.println("La nota media es: " + notaMedia);

        if (notaMedia < 5) {
            System.out.println("INSUFICIENTE");
        }
        else if (notaMedia < 6 ){
            System.out.println("SUFICIENTE");
        }
        else if (notaMedia < 7.5 ) {
            System.out.println("BIEN");
        }
        else if (notaMedia < 8.5 ) {
            System.out.println("NOTABLE");
        }
        else {
            System.out.println("SOBRESALIENTE");
        }

        int notaEntero = (int) notaMedia;  //casting

        System.out.println("Nota media entera: "+ notaEntero);

    }




}
