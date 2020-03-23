/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.EjerciciosT1;

/*Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100.
Calcular además cuantos hay y visualizar cada uno de ellos.*/
/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 5 == 0) {
                suma = suma + numero;
                contador++;
                System.out.println("Numero: " + numero);
            }

        }
        System.out.println("La suma es: " + suma);
        System.out.println("El numero total es: " + contador);
    }
}
