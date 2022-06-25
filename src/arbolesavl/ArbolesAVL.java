/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesavl;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArbolesAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        metodosAVL arbAVL = new metodosAVL(); //intancia la clase metodosAVL par ser utilizada en la clase principal
        arbAVL.insertar(5);//insertar datos//       5
        arbAVL.insertar(3);          //            /  \         
        arbAVL.insertar(7);          //           3    7
        arbAVL.insertar(1);          //         /  \  /  \  
        arbAVL.insertar(4);          //        1   4  6  10
        arbAVL.insertar(6);
        arbAVL.insertar(10);
        arbAVL.imprimirNiveles(); //metodo para imprimir arbol por niveles
        System.out.println( "\n----Pre Orden----" );
        arbAVL.preOrden(); //metodo imprimir en preOrden
         System.out.println( "\n----In Orden----" );
        arbAVL.inOrden(); //Metodo imprimir en inOrden
         System.out.println( "\n----Pos Orden----" );
        arbAVL.posOrden(); //metodo imprime postOrden
        System.out.println( "\n----Buscar elemento en el arbol----" );
        System.out.print( "Ingrese dato que desea buscar en el Arbol AVL: " );
        int dato = sc.nextInt(); //ingresamos dato a buscar por teclado
        if (arbAVL.buscar(dato)!=0) { //evaluamos si el elemeto existe en el metodo int buscar
            System.out.println( "El dato " +dato+ " existe en el arbol" );
        }else{
            System.out.println( "El dato " +dato+ " no existe en el arbol" );
        }//fin if/else evaluar si elemento a buscar existe
        System.out.println( "Cantidad nodos del arbol: " +arbAVL.cantidadNodos());
        arbAVL.promedio();//metodo promedio del arbol
        System.out.println("\n----Nodos Padre-----");
        arbAVL.nodosPadre(); //metodo imprime nodos padre
        System.out.println("\n----Nodos Hijo----");
        arbAVL.nodosHoja(); //metodo imprime nodos hijo
    }
    
}
