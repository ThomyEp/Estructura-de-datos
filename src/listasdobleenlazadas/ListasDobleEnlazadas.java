/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobleenlazadas;

import java.util.Scanner;


/**
 *
 * @author alumnos
 */
public class ListasDobleEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MetodosListaDoble lde=new MetodosListaDoble();
        lde.insertarDatos(1, 10);
        lde.insertarDatos(2, 20);
        lde.insertarDatos(3, 30);
        lde.insertarDatos(1, 50);
        lde.imprimirLista();
     
        if (lde.listaOrdenada()) {
            System.out.println("Lista esta ordenada");
        }
        else{
            System.out.println("Lista esta desordenada");
        }
        System.out.print("Ingrese el numero que desea buscar:");
        int num=sc.nextInt();
        if ( lde.buscarDato(num)) {
            System.out.println("El dato "+num+" si existe");
        }
        else{
            System.out.println("El dato "+num+" no existe");
        }
       
        
    }
    
}
