/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio4.DNI;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Persona {

    private String nombre;
    private int edad;
    private DNI dni;
    private Sexo sexo;
    private float peso;
    private float altura;

    public Persona() {
        this.nombre = "";
        this.dni = new DNI();
        this.edad = 0;
        this.sexo = sexo.FEMENINO;
        this.peso = 0;
        this.altura = 0;
    }
//Siempre hay que inicializar todos los atributos

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = new DNI();
        this.peso = 0;
        this.altura = 0;

    }

    //Todos los atributos menos dni por defecto
    public Persona(String nombre, int edad, Sexo sexo, float peso, float altura) {
        this.nombre = nombre;
        this.dni = new DNI();
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Todos los atributos
    public Persona(String nombre, DNI dni, int edad, Sexo sexo, float peso, float altura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //SETTERS   float peso, float altura
    //CON LOS SETTERS ME ESTABLECEN
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws PersonaException {
        if (this.edad > 0) {
            this.edad = edad;
        } else {
            throw new PersonaException(PersonaException.EDAD_INVALIDA);
        }
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;

    }

    public void setPeso(float peso) throws PersonaException {
        if (this.peso < 40 || this.peso > 350) {
            throw new PersonaException(PersonaException.PESO_INVALIDO);

        } else {
            this.peso = peso;
        }
    }

    public void setAltura(float altura) throws PersonaException {
        if (this.altura < 1.40 || 3.00 >= this.altura) {
            throw new PersonaException(PersonaException.ALTURA_INVALIDA);

        } else {
            this.altura = altura;
        }
    }

    //GETTERS String nombre, int edad,Sexo sexo, float peso,float altura
    //CON LOS GETTERS OBTIENEN
    public String getNombre() {
        return this.nombre;
    }

    public DNI getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public float calcularIMC() {
        return (this.peso / (this.altura * this.altura));
    }

    public PesoCorporal valorarPesoCorporal() {
        if (this.calcularIMC() < 18) {
            return PesoCorporal.BAJO_PESO;
        } else if (this.calcularIMC() > 25) {
            return PesoCorporal.SOBREPESO;
        } else {
            return PesoCorporal.PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad() {

        /**
         * if (this.edad > 18) { return true; } else { return false; }
         */
        //Devuelve directamente true or false
        return this.edad > 18;
    }

    @Override

    public String toString() {
        return "Nombre: " + this.nombre + "DNI: " + this.dni + "Edad: " + this.edad + "Sexo: " + this.sexo
                + "Peso: " + this.peso + "Altura: " + this.altura + "IMC: " + this.calcularIMC()
                + "Valorar peso corporal: " + this.valorarPesoCorporal()
                + "Mayor o menor de edad: " + this.esMayorDeEdad();
    }

}
