/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema4.Ejercicio6;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Contacto {

    private String nombre;
    private String email;
    private int telefono;

    //Inicializo todos los atributos
    public Contacto(String nombre, String email, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    //El usuario me establece un valor
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //El usuario me pide un dato
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override

    public String toString() {
        return "Nombre: " + this.nombre + "Email: " + this.email + "Telefono: " + this.telefono;
    }

}
