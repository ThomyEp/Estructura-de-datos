/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasenlazadas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ColasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MetodosCola mc=new MetodosCola();
        mc.encolarFifo("Ecuador",50);
        mc.encolarFifo("Peru",25);
        mc.encolarFifo("Colombia",1200);
        mc.encolarFifo("Paraguay",100);
        mc.imprimir();
        System.out.println(" --------Pais con mayor poblacion--------");
        mc.mayorPoblacion();
        System.out.println("--------Buscar pais y devolver su poblacion:--------");
        mc.devolverPoblacion1("Ecuador");
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
    }
    
}
