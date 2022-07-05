/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafosdirigidos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GrafosDirigidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner( System.in );
        int op = 0;
        metodosGrafos mg = new metodosGrafos();
        mg.ingresarDato();
        mg.imprimirMatrizA();
        mg.grado();
        mg.grafoConexo();
    }
    
}
