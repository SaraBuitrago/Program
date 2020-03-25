/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Escribir un programa que defina variables que representen el número de días
de un año, el número de horas que tiene un día, el número de minutos que
tiene una hora y el número de segundos que tiene un minuto. Emplear las
variables que ocupen el mínimo espacio de memoria posible. A continuación,
calcular el número de segundos que tiene un año y almacenar el valor del
cálculo en otra variable.*/
package ProgramacionII.Tema1.EjerciciosT1;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int dias = 365;
        int horas = 24;
        int minutos = 60;
        int segundos = 60;

        //Calcular el numero de segundos que tiene un año y almacenar valor en otra variable
        int segAnio;

        segAnio = dias * horas * minutos * segundos;

        //sout cnt+space
        System.out.println("El numero de segundos en un año es: " + segAnio);
    }
}
