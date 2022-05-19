/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresmatricesparalelas;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class VetoresMatricesParalelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         metodos m=new metodos();
        m.ingresar();
        m.imprimir();
        System.out.println("");
        System.out.println("Promedio general");
        m.promedioGeneral();
        m.imprimirPromedio();
        System.out.println("Promedio asignaturas");
        m.promedioMateria();
        System.out.println("Buscar nota mayor");
        m.notaMayor();
 }
}
