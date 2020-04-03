/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Ejercicio06;

import Examen.Utils;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Credenciales {

    private int longitud;
    private Calidad calidad;
    private String contraseña;

    /*  public Credenciales(int longitud) {
        Utils.generaContraseña(this.longitud);
    }*/
    public Credenciales(int longitud, Calidad calidad, String contraseña) {
        this.longitud = longitud;
        this.calidad = calidad;
        this.contraseña = contraseña;
    }

    public Calidad getCalidad() {
        return this.calidad;
    }

    public void setPassword(String contraseña) throws Exception {
        if (!(this.longitud.equals(this.contraseña))) {
            throw new Exception();
        } else {

            Utils.calculaCalidad(contraseña);
            this.contraseña = contraseña;
            this.calidad = calidad;
        }
    }

    @Override

    public String toString() {
        return ("Longitud: " + this.longitud + "Calidad: " + this.calidad);
    }
}
