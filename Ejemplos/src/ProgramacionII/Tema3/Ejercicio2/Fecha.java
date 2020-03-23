/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio2;

import java.util.Date;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //Constructor por defecto
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1990;

    }

    public Fecha(int dia, int mes, int anio) throws DateException {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        comprobarFecha(dia, mes, anio);
    }
    //GETTERS

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }

    //SETTERS
    public void setDia(int dia) throws DateException {
        comprobarFecha(dia, this.mes, this.anio);
        this.dia = dia;

    }

    public void setMes(int mes) throws DateException {
        //El dia que ya tengo, el año que tengo y el mes que me pasan.
        comprobarFecha(this.dia, mes, this.anio);
        this.mes = mes;
    }

    public void setAnio(int anio) throws DateException {

        //El dia que ya tengo el mes que ya tengo el año que me pasan.
        comprobarFecha(this.dia, this.mes, anio);
        this.anio = anio;
    }

    //Es privado porque solo yo en esta clase puedo comprobar la fecha.
    private void comprobarFecha(int dia, int mes, int anio) throws DateException {
        Date fechaGenerada = new Date(anio - 1900, mes - 1, dia);
        if (fechaGenerada.getMonth() != (mes - 1) || anio < 1900) {
            throw new DateException();
        }
    }

    //La clase fecha no puede tener un sout ni ninguna clase que no tenga que interactuar con el usuario. 
    @Override
    public String toString() {
        return "" + this.dia + "/" + this.mes + "/" + this.anio;
    }
}
