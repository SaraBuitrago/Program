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
public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            Fecha fecha = new Fecha(20, 10, 2018);
            System.out.println("La fecha es: " + fecha);

            fecha.setAnio(2019);
            System.out.println("Ahora la fecha es: " + fecha);

            Date date = new Date();
            System.out.println("La fecha y la hora actual es: " + date);

            Date date2 = new Date(2020 - 1900, 2 - 1, 31);
            System.out.println("La fecha es: " + date2);

            //Fecha correcta
            Fecha fecha1 = new Fecha(29, 2, 2020);
            System.out.println(fecha1);
            //Fecha está mal
            Fecha fecha2 = new Fecha(30, 4, 2020);
            System.out.println(fecha2);
            Fecha fecha3 = new Fecha(12, 4, 2020);
            System.out.println(fecha3);

            //Se ejecuta hasta aquí, pero aquí salta la excepción
            Fecha fecha4 = new Fecha(1, -1, 2020);
            System.out.println(fecha4);
            Fecha fecha5 = new Fecha(1, 1, -10);
            System.out.println(fecha5);

            Fecha fecha6 = new Fecha(29, 2, 2020);
            fecha6.setAnio(2021);

            System.out.println(fecha6);

        } catch (DateException e) {
            e.printStackTrace();
        }

    }

}
