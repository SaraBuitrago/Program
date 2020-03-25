/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3;

import java.util.ArrayList;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class PruebaListas {

    public static void main(String[] args) {
        //Lo utilizaremos para una lista de usuarios.
        //ArrayList es una lista
        //List es una interfaz
        //Lo que se pone entre <> son clases o el tipo.
        ArrayList<String> elementos = new ArrayList<String>();

        elementos.add("Esto es una cadena");
        String elemento1 = "Otra cadena";
        elementos.add(elemento1);
        elementos.remove(elemento1);
        elementos.size(); //Me dice cuantos objetos tengo en la cadena

        for (int i = 0; i < 10; i++) {
            elementos.add("Cadena: " + i);
        }

        for (int i = 0; i < elementos.size(); i++) {
            System.out.println("Elemento en la posicion " + i + " es: " + elementos.get(i));
        }
        //Tipo(String) de la coleccion elementos
        //Me define una variable y va hasta size()-1
        for (String s : elementos) {
            System.out.println("Elemento es: " + s);
        }
    }
}
