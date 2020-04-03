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
public class DniException extends Exception {

    public static final String NUMERO_INVALIDO = "El numero debe estar comprendido entre 0 y 99999999";
    public static final String LETRA_INVALIDA = "La letra es invalida";
    public static final String LONGITUD_INVALIDA = "La longitud debe ser de 9 digitos";

    public DniException(String mensaje) {
        super(mensaje);

    }

}
