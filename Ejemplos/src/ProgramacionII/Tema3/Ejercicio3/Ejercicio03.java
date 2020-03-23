/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio3;

import ProgramacionII.utilidades.utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio03 {

    //Esta definido a nivel de clase ¿Qué significa static?
    public static void main(String[] args) {
        showMenu();
    }

    public static Racional leerRacional() {
        System.out.println("Introduzca el numerador del racional: ");
        int numerador = utils.leerEntero();
        System.out.println("Introduzca el denominador del racional: ");
        int denominador = utils.leerEntero();
        return new Racional(numerador, denominador);
    }

    //Que un método sea estático es una excepcion
    public static void showMenu() {
        Racional r1;
        Racional r2;
        Racional resultado = null;

        boolean salir = false;

        while (!salir) {
            System.out.println("* Calculadora de Racionales -> Opciones");
            System.out.println("1. Sumar dos racionales");
            System.out.println("2. Multiplicar dos racionales");
            System.out.println("3. Simplificar dos racionales");
            System.out.println("4. Salir de la calculadora");
            System.out.println("\n\n");
            System.out.println("Elige una opcion");
            int opcion = utils.leerEntero();

            switch (opcion) {
                case 1:
                    r1 = leerRacional();
                    r2 = leerRacional();
                    resultado = r1.suma(r2);
                    break;
                case 2:
                    r1 = leerRacional();
                    r2 = leerRacional();
                    resultado = r1.multiplica(r2);
                    break;
                case 3:
                    r1 = leerRacional();
                    resultado = r1.simplificar();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor, introduzca un numero valido");
            }
            if (resultado != null) {
                System.out.println("El resultado es: " + resultado);
                resultado = null;
            }

        }
    }
}
