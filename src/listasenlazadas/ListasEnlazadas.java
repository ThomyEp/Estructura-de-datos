/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadas;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MetodosListas  ml=new MetodosListas();
       // System.out.println("Ingrese el nombre");
        //String nombre=sc.next();
        //System.out.println("Ingrese la nota");
         //float not=sc.nextFloat();
         ml.insertarInicio(4.1,"jhony");
         ml.insertarInicio(7.1,"Maria");
         ml.insertarInicio(5.5,"Jose");
         ml.insertarInicio(8.2,"Rita");
         ml.mostrarLista();
         ml.insertarFin(7.1, "Tatiana");
         ml.insertarFin(1.2, "Andrea");
         ml.insertarFin(4.5, "Juan");
         ml.insertarFin(3.3, "Pepe"); 
         ml.mostrarLista();
         ml.insertarPosicion(1, 2.9, "Sofia");
         ml.insertarPosicion(7, 7.6, "Poleth");
         ml.insertarPosicion(3, 5.7, "Camila");
         ml.mostrarLista();
    }
   
}
