/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema3.Ejercicio3;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Racional {

    private int numerador;
    private int denominador;

    //CONSTRUCTOR POR DEFECTO: NO RECIBE PARÁMETROS.
    //Constructor siempre se inicializa
    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    //Constructor por copia
    public Racional(Racional r) {
        this.numerador = r.numerador;
        this.denominador = r.denominador;

    }

    public Racional(int numerador, int denominador) {
        //Comprobar que denominador es !=0

        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setNumerador(int num) {
        this.numerador = num;

    }

    public Racional suma(Racional r2) {
        int resNum;
        int resDen;

        //3/5 +2/3 = (3*3 +2*5) /15 = 19/15
        resDen = this.denominador * r2.denominador;
        resNum = (this.numerador * r2.denominador) + (r2.numerador * this.denominador);

        return new Racional(resNum, resDen);
    }

    public Racional multiplica(Racional r2) {
        int resNum;
        int resDen;
        resNum = this.numerador * r2.numerador;
        resDen = this.denominador * r2.denominador;

        return new Racional(resNum, resDen);
    }

    public Racional simplificar() {
        int resNum = this.numerador;
        int resDen = this.denominador;
        int menor = 0;

        /*
        if (this.numerador > this.denominador) {
            menor = this.denominador;
        } else {
            menor = this.numerador;
        }
         */
        //Devuelve this.denominador si es true y devuelve this.numerador si es false.
        menor = (this.numerador > this.denominador) ? this.denominador : this.numerador;
        for (int i = menor; i > 1; i--) {
            if ((resNum % i == 0) && (resDen % i == 0)) {
                resNum = resNum / i;
                resDen = resDen / i;

            }
        }
        return new Racional(resNum, resDen);
    }

    public String toString() {
        return "" + this.numerador + "/" + this.denominador;
    }
}
