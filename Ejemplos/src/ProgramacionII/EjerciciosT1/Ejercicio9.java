/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.EjerciciosT1;

import ProgramacionII.utilidades.utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
/*Escribir un programa que solicite al usuario dos vectores de N elementos y
que imprima su producto escalar.*/
public class Ejercicio9 {

    public static void main(String[] args) {

        System.out.println("Introduzca numero de elementos: ");
        //Me sale introduzca numero porque la funcion leerEntero tiene un println de leer numero
        int elementos = utils.leerEntero();

        System.out.println("Introduzca primer vector");
        for (int i = 0; i <= elementos; i++) {
            System.out.println(i + " Introduzca numero: ");
            int numero = utils.leerEntero();
        }
        System.out.println("Introduzca segundo vector");

        for (int i = 0; i <= elementos; i++) {
            System.out.println(i + " Introduzca numero: ");
            int numero = utils.leerEntero();
        }
    }
}
