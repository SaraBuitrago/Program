/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio4.DNI;

import ProgramacionII.utilidades.utils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Main {

    public static void main(String[] args) throws PersonaException {
//Pedir por teclado el nombre, la edad, el sexo, el peso y la altura
        List<Persona> personas = new ArrayList();

        String nombre = utils.leerString("Introduzca nombre: ");
        int edad = utils.leerEntero("Introduzca edad");
        Sexo sexo = utils.leerSexo();
        float peso = utils.leerFloat("Introduzca peso");
        float altura = utils.leerFloat("Introduzca altura");

        //Crear 3 objetos de la clase persona
        //El primer objeto obtendrá las variables pedidas por teclado
        Persona personas1 = new Persona(nombre, edad, sexo, peso, altura);

        //El segundo objeto obtendrá las variables pedidas excepto peso y altura que es por defecto
        Persona personas2 = new Persona(nombre, edad, sexo);
        Persona personas3 = new Persona();

        //Volver a pedir datos al usuario.
        String nombre3 = utils.leerString("Introduzca nombre");
        int edad3 = utils.leerEntero("Introduzca edad");
        Sexo sexo3 = utils.leerSexo();
        float peso3 = utils.leerFloat("Introduzca peso");
        float altura3 = utils.leerFloat("Introduzca altura");
//Utilizar los métodos sets
        personas3.setNombre(nombre3);
        personas3.setSexo(sexo3);
        personas3.setEdad(edad3);
        personas3.setPeso(peso3);
        personas3.setAltura(altura3);

        for (Persona persona : personas) {

            System.out.println("Su peso corporal es: " + persona.valorarPesoCorporal());
        }
        for (Persona persona : personas) {

            System.out.println("¿Es mayor de edad?: " + persona.esMayorDeEdad());
        }
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
            System.out.println(persona.getDni());
            System.out.println(persona.getSexo());
            System.out.println(persona.getPeso());
            System.out.println(persona.getAltura());
        }
    }
}
