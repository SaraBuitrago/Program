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
        List<Persona> personas;

        String nombre = utils.leerString();
        int edad = utils.leerEntero();
        Sexo sexo;
        float peso = utils.leerDouble();
        float altura = utils.leerDouble();

        //Crear 3 objetos de la clase persona
        Persona personas1 = new Persona();
        Persona personas2 = new Persona();
        Persona personas3 = new Persona();

        //El primer objeto obtendrá las variables pedidas por teclado
        personas1(nombre, edad, sexo, peso, altura);
        //El segundo objeto obtendrá las variables pedidas excepto peso y altura que es por defecto

        persona2(nombre, edad, sexo, peso, altura2);

        Persona persona3 = new Persona();

    }
}
