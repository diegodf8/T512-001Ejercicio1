package com.cice.usoclases;

public class Personaje {

    String nombre;
    int vida;
    boolean hacemagia;


    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void  detenerse(){
        System.out.println("OK, me detengo");
    }

    public void correr(){
        System.out.println("Voy corriendo");
    }

    public void saltar(){
        System.out.println("Estoy saltando");
    }

    // metodos get y set

    public void setNombre(String name){

        nombre = name;
    }

}
