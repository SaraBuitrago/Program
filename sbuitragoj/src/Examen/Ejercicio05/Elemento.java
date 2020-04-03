/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Ejercicio05;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Elemento extends Atomo {

    private Grupo grupo;

    public Elemento(int neutrones, int protones, int electrones, Grupo grupo) throws AtomoException {
        super(neutrones, protones, electrones);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    @Override

    public String toString() {
        return super.toString() + "Grupo: " + this.grupo;
    }
}
