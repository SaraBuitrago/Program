/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema4.Ejercicio6;

import ProgramacionII.utilidades.utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Main {

    public static void main(String[] args) {

    }

    public int mostrarMenu() {
        int opcion = 0;
        System.out.println("AGENDA");
        System.out.println("1. Introducir contactos ");
        System.out.println("2. Listar contactos existentes");
        System.out.println("3. Salir");

        opcion = utils.leerEntero("Elija una opcion: ");
        return opcion;
    }

    public void menu() {
        int opcion = mostrarMenu();
        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                break;

        }
    }
}
