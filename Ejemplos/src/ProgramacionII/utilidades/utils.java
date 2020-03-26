/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.utilidades;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//Al poner el asterisco decimos que todo lo que tiene el paquete io lo importe
import java.io.*;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class utils {

    public static int leerEntero() {
        //Variable que le ponemos las iniciales del elemento
        InputStreamReader isr = null;
        BufferedReader consola = null;
        int resultado = 0;
        boolean salir = false;
        while (!salir) {
            try {
                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                //Para que funcione lo de consola. tiene que compilar todo el codigo anterior
                System.out.println("Introduzca un numero:");
                String comando = consola.readLine();
                resultado = Integer.parseInt(comando);
                salir = true;
                //Exception e: Cuando haya cualquier excepcion
            } catch (Exception e) {
                System.out.println("Error. Debe introducir un numero. \n");
            }
        }

        return resultado;

    }

    public static int leerDouble() {
        //Variable que le ponemos las iniciales del elemento
        InputStreamReader isr = null;
        BufferedReader consola = null;
        double resultado = 0;
        boolean salir = false;
        while (!salir) {
            try {
                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                //Para que funcione lo de consola. tiene que compilar todo el codigo anterior
                System.out.println("Introduzca un numero:");
                String comando = consola.readLine();
                resultado = Double.parseDouble(comando);
                salir = true;
                //Exception e: Cuando haya cualquier excepcion
            } catch (Exception e) {
                System.out.println("Error. Debe introducir un numero. \n");
            }
        }

        return resultado;

    }

    public static String leerString() {
        //Variable que le ponemos las iniciales del elemento
        InputStreamReader isr = null;
        BufferedReader consola = null;
        System.out.println("Introduzca una cadena:");
        String resultado = "";
        boolean error = true;
        while (error) {
            try {
                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                //Para que funcione lo del consola. tiene que compilar todo el codigo anterior
                resultado = consola.readLine();
                if (!resultado.isEmpty()) {
                    error = false;
                }
                //Exception e: Cuando haya cualquier excepcion
            } catch (Exception e) {
                System.out.println("Ha habido un error introduzca un string de nuevo \n");
            }
        }
        return resultado;

    }

}
