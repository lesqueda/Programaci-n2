package com.company;

import java.util.ArrayList;

import Seleccion.Entrenador;
import Seleccion.Tecnico;
import Seleccion.Futbolista;
import Seleccion.SeleccionFutbol;


public class Main {

    // ArrayList de Objetos SeleccionFutbol. Independientemente de las clases hijas a la que pertenece el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        Entrenador barriteau = new Entrenador(1, "Byron", "Barriteau", 33, "89jjh54");
        Futbolista gallardo = new Futbolista(2, "Jose", "Gallardo", 22, "15", "Centro");
        Tecnico morales = new Tecnico(3, "Joaquin", "Morales", 20, "tecnico", 8);

        integrantes.add(barriteau);
        integrantes.add(gallardo);
        integrantes.add(morales);


        //Viaje
        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos Ejecutan el mismo metodo)");

        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre()+ " " + integrante.getApellido()+ " ->");
            integrante.Viajar();
        }

        //Concentracion
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos Ejecutan el mismo metodo)");

        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre()+ " " + integrante.getApellido()+ " ->");
            integrante.Concentrarse();
        }

        //Entrenamiento
        System.out.println("Solamente el entrenador y el futbolista tienen metodos para entrenar");
        System.out.println(barriteau.getNombre()+ " " + barriteau.getApellido() + " "+ "->");
        barriteau.dirigirEntrenamiento();

        System.out.println("Solamente el entrenador y el futbolista tienen metodos para entrenar");
        System.out.println(gallardo.getNombre()+ " " + gallardo.getApellido() + " "+ "->");
        gallardo.Entrenar();


    }
}
