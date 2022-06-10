/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author alumnos
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosCola mc=new MetodosCola();
        mc.encolarFifo("Ecuador",50);
        mc.encolarFifo("Peru",25);
        mc.encolarFifo("Colombia",1200);
        mc.encolarFifo("Paraguay",100);
        mc.imprimir();
        mc.mayorPoblacion();
        //mc.desencolar();
        //mc.imprimir();
        //mc.desencolar();
        //mc.imprimir();
    }
    
}
