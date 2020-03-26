/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio4.DNI;

import ProgramacionII.utilidades.utils;
import java.util.List;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Main {

    public static void main(String[] args) {
//Pedir por teclado el nombre, la edad, el sexo, el peso y la altura
        List<Persona> personas = new ArrayList();

        String nombre = utils.leerString();
        int edad = utils.leerEntero();
        Sexo sexo = utils.leerSexo();
        float peso = utils.leerFloat();
        float altura = utils.leerFloat();

        float altura2 = utils.leerFloat();

        //Crear 3 objetos de la clase persona
        //El primer objeto obtendrá las variables pedidas por teclado
        Persona personas1 = new Persona(nombre, edad, sexo, peso, altura);

        //Volver a pedir datos al usuario.
//El segundo objeto obtendrá las variables pedidas excepto peso y altura que es por defecto
        Persona personas2 = new Persona(nombre, edad, sexo, peso, altura2);
        Persona personas3 = new Persona();

    }
}
