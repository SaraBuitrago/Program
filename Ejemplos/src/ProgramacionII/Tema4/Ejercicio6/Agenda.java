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

    public void addContacto(Contacto contac) throws AgendaException {
        if (existeContacto(contactos, contac)) {
            //Aquí compruebo que si el contacto existe, lanzo la excepcion
            throw new AgendaException(AgendaException.NOMBRE_REPETIDO);
        } else {
            this.contactos.add(contac);
        }

    }
//Listar contactos

    public void listarContactos(List<Contacto> contactos) {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }
//Contacto existe

    public boolean existeContacto(List<Contacto> contactos, Contacto cont) throws AgendaException {
        for (int i = 0; i < contactos.size() - 1; i++) {
            if (contactos.get(i).equals(cont)) {
                return true;
            }
        }
        return false;

    }
}
