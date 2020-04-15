/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema4.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Agenda {

    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<Contacto>();
    }
//Añadir contacto nuevo

    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
//Listar contactos

    public void listarContactos(List<Contacto> contactos) {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }
//Contacto existe

}
