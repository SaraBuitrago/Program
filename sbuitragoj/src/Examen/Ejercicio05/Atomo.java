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
public class Atomo {

    //Atributos
    private int neutrones;
    private int protones;
    private int electrones;

//Contructores
    public Atomo() {
        this.neutrones = 0;
        this.protones = 1;
        this.electrones = 1;
    }

    public Atomo(int neutrones, int protones, int electrones) throws AtomoException {
        if (this.electrones < 1 || this.neutrones < 0 || this.protones < 1) {
            throw new AtomoException(AtomoException.VALOR_INFERIOR);
        } else {
            this.electrones = electrones;
            this.protones = protones;
            this.neutrones = neutrones;
        }
    }

    //Métodos
    //Getters(Obtengo)
    public int getElectrones() {
        return this.electrones;
    }

    public int getProtones() {
        return this.protones;
    }

    public int getNeutrones() {
        return this.neutrones;
    }

    //Setter (Establezco)
    public void setElectrones(int electrones) throws AtomoException {
        if (this.electrones < 1) {
            throw new AtomoException(AtomoException.VALOR_ELECTRON);
        } else {
            this.electrones = electrones;
        }

    }

    public void setProtones(int protones) throws AtomoException {
        if (this.protones < 1) {
            throw new AtomoException(AtomoException.VALOR_PROTON);
        } else {
            this.protones = protones;
        }

    }

    public void setNeutrones(int neutrones) throws AtomoException {

        if (this.neutrones < 0) {
            throw new AtomoException(AtomoException.VALOR_NEUTRON);
        } else {
            this.neutrones = neutrones;
        }

    }

    public boolean isIon() {
        return this.electrones != this.protones;
    }

    public int getAtomicMassNumber() {
        return this.neutrones + this.protones;
    }

    @Override

    public String toString() {
        return ("Numero de electrones: " + this.electrones
                + "Numero de protones: " + this.protones
                + "Numero de neutrones: " + this.neutrones
                + "Masa: " + this.getAtomicMassNumber()
                + "¿Es un ión?: " + this.isIon());
    }
}
