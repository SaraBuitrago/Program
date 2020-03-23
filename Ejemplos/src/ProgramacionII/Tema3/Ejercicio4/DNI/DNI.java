/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio4.DNI;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class DNI {

    private int numero;
    private char letra;
    private String numLetra;

    public DNI() {

    }

    public DNI(int numero) {
        this.numero = numero;
    }

    public DNI(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public DNI(String numLetra) {
        this.numLetra = numLetra;
    }

    @Override

    public String toString() {
        return "Dni: numero = " + this.numero + ", letra = " + letra;
    }

    public static void main(String[] args) {
        //Son ejemplos.

        DNI dni1 = new DNI(10000000, 'c');
        DNI dni2 = new DNI(-1, 'a');
        DNI dni3 = new DNI(12345876, '?');

        System.out.println("DNI1: " + dni1);

        System.out.println("DNI1: " + dni2);

        System.out.println("DNI1: " + dni3);
    }

}
