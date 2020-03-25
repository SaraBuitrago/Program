/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema1.EjerciciosT1;

/*Escribir un programa que muestre por consola los mayores números enteros
que se pueden representar mediante un char, short e int.*/
/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        char letra = 'a';
        short numero = 1;
        int numeroEntero = 20;
        int entero;
        entero = (int) letra;

        System.out.println("Tipo char: " + entero);

        entero = (int) numero;
        System.out.println("Tipo short: " + entero);

        entero = (int) numeroEntero;

        System.out.println("Tipo entero: " + entero);
    }
}
