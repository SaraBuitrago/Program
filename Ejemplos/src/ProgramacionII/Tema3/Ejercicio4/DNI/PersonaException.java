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
public class PersonaException extends Exception {

    public static final String EDAD_INVALIDA = "La edad debe ser mayor o igual a 0";
    public static final String PESO_INVALIDO = "El peso debe ser mayor a 0";
    public static final String ALTURA_INVALIDA = "La altura debe ser mayor a 0";

    public PersonaException(String mensaje) {
        super(mensaje);
    }
}
