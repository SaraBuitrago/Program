package ProgramacionII.Tema3.Ejercicio5;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Password {

    private int longitud;
    private String contraseña;
    //La longitud por defecto será de 8 caracteres

    //Siempre hay que inicializar todos los atributos
    public Password() {
        this.longitud = 8;
        this.contraseña = "password";
    }
//Longitud que nosotros le pasemos

    public Password(int longitud) {
        this.longitud = longitud;

        this.contraseña = this.generarPassword();
    }

    public boolean esFuerte() {
        int numeros = 0;
        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < this.contraseña.length(); i++) {
            //Pregunta si la letra en la posición i es mayuscula.
            if (Character.isUpperCase(contraseña.charAt(i))) {
                mayusculas++;
                //Pregunta si la letra en la posición i es minuscula.
            } else if (Character.isLowerCase(contraseña.charAt(i))) {
                minusculas++;
            } else {
                numeros++;
            }
        }
        if (numeros > 5 && mayusculas > 2 && minusculas > 1) {
            return true;
        } else {
            return false;
        }
    }

//??
    public String generarPassword() {
        //La contraseña generada se guardará en password
        String password = "";
        String minusculas = "qwertyuiopasdfghjklñzxcvbnm";
        String mayusculas = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
        String numeros = "1234567890";

        Random aleatorio = new Random();

        for (int i = 0; i < this.longitud; i++) {

        }

        return password;
    }

    //Con los getters se obtiene información
    public String getContraseña() {
        return this.contraseña;
    }

    public int getLongitud() {
        return this.longitud;
    }

    //Con los setters se establece información
    public void setLongitud(int longitud) {
        this.longitud = longitud;

    }
}
