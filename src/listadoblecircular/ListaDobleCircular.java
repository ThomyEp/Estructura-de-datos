/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoblecircular;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class ListaDobleCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MetodosDobleCircular ldc=new MetodosDobleCircular();
        ldc.insertarInicio(100);
        ldc.insertarInicio(50);
        ldc.insertarInicio(25);
        ldc.imprimir();
        System.out.println("La lista tiene: "+ldc.cantidadNodos()+" nodos");
        ldc.insertarUltimoo(125);
        ldc.imprimir();
        ldc.borrarNodo(3);
        ldc.imprimir();
        System.out.print("Ingrese el elemento que desea buscar: ");
        int num=sc.nextInt();
        if (ldc.buscarElemento(num)==true) {
            System.out.println("El elemento "+num+" existe");
        }
        else{
            System.out.println("El elemento "+num+" no existe");
        }
        ldc.promedio();
        ldc.Buscar(50);
    }
 
}
