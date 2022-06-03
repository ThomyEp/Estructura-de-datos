/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionlistas;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class AplicacionListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Lista enlazada simple 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Lista enlazada simple");
        Lista lea=new Lista();
        lea.insertar(1, 10);
        lea.insertar(2, 40);
        lea.insertar(3, 15);
        lea.insertar(4, 30);
        lea.mostrarLista();
        System.out.print("Ingrese el numero que desea buscar:");
        int x=sc.nextInt();
        if (lea.buscarElemento(x)) {
            System.out.println("El elemento:"+x+" si existe en la lista");
        }
        else{
            System.out.println("El elemento:"+x+" no existe en la lista");
        }
        lea.mayorElemento(); 
        lea.ordenarLista();
        lea.mostrarLista();
        System.out.println("Ingrese la posicion del elemento que desea eliminar:");
         int y=sc.nextInt();
        lea.borrarElemento(y);
        lea.mostrarLista();
        System.out.println("");
        
        System.out.println("Lista actual");
        lea.mostrarLista();
        System.out.println("Ingrese primera posicion que desea cambiar");
        int a=sc.nextInt();
        System.out.println("Ingrese primera posicion que desea cambiar");
        int b=sc.nextInt();
        lea.intercambioElemento(a, b);
        lea.mostrarLista();
        System.out.println("Lista Ordenada");
        lea.ordenarLista();
        lea.mostrarLista();
    }
       
    }
    
}
