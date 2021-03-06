/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio4.DNI;

import java.util.Random;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class DNI {

    private int numero;
    private char letra;

    public DNI() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(99999999);
        this.letra = calcularLetra(numero);
    }

    public DNI(int numero) throws DniException {
        comprobarNumero(numero);
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

//Lo que mete el usuario
    public DNI(int numero, char letra) throws DniException {
        comprobarNumero(numero);
        comprobarLetra(numero, letra);
        this.numero = numero;
        this.letra = letra;

    }

    public DNI(String numLetra) throws DniException {
        if (numLetra.length() > 9) {
            throw new DniException(DniException.LONGITUD_INVALIDA);
        } else {
            //Cojo desde el primer caracter que quiero extraer hasta primer caracter que ya no deseo extraer
            String numero = numLetra.substring(0, numLetra.length() - 1);
            //Convierto String en entero
            int numeroDni = 0;
            try {
                numeroDni = Integer.parseInt(numero);
            } catch (Exception ex) {
                throw new DniException(DniException.NUMERO_INVALIDO);
            }

            /*charAt devuelve el caracter de una cadena, se pone length -1 porque si fuera length
            se saldria de la cadena*/
            char letraDni = numLetra.charAt(numLetra.length());
            comprobarNumero(numeroDni);
            comprobarLetra(numeroDni, letraDni);
        }

    }

    public char calcularLetra(int numero) {
        int resultado;
        char letra = 0;

        switch (resultado = numero % 23) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;

        }
        return letra;

    }
//Compruebo si la letra introducida por el usuario es correcta.

    public void comprobarLetra(int numero, char letra) throws DniException {
        if (letra != calcularLetra(numero)) {
            throw new DniException(DniException.LETRA_INVALIDA);
        }
    }
//Compruebo si el numero metido por el usuario es correcto

    public void comprobarNumero(int numero) throws DniException {
        if (numero < 0 || numero > 99999999) {
            throw new DniException(DniException.NUMERO_INVALIDO);
        }

    }

    @Override

    public String toString() {
        return "" + this.numero + "" + this.letra;
    }

}
