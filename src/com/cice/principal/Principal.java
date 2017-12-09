package com.cice.principal;

import com.cice.usoclases.Personaje;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args){

        Personaje prota = new Personaje();
        Scanner sc = new Scanner (System.in);
        String nombreprota;
        System.out.print("Introduce el nombre: ");
        nombreprota=sc.nextLine();
        prota.setNombre(nombreprota);

        prota.caminar();
        prota.correr();
        prota.detenerse();
        prota.saltar();

    }
}
