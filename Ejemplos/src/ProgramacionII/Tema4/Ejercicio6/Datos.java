/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionII.Tema4.Ejercicio6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Sara Buitrago <sarambj@hotmail.com>
 */
public class Datos {

    public static void guardarDatos(Agenda agenda) {
        File file = new File("c:/got/agenda.dat");

        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);

            //Escribir contacto
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error en la escritura");
        } finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void obtenerDatos(Agenda agenda) {
        File file = new File("c:/got/agenda.dat");

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);

            //Leer contacto
            String nombre = dataInputStream.readUTF();
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error en la lectura");
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /*FileInput: En los apuntes pone que no es recomendable usar ImputStream para guardar información a largo plazo,
    pone que es recomendable para almacenar información temporal. ¿Eso que significa?*/
}
