/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafosdirigidos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class metodosGrafos {
    private int matrizA[][];
    private int matrizB[][];
    
    public metodosGrafos(){ // metodo constructor
        this.matrizA = new int[6][6]; //declarar matriz a de 6x6
        this.matrizB = new int[6][6]; //declarar matriz b de 6x6
    } // fin metodo contrustor
    
    public void ingresarDato(){ //metodo para ingresar datos del grafo
       Scanner sc = new Scanner( System.in ); // sc para ingresar datos por teclado
       int numeroAristas = 0; // variable para ingresar datos int de aristas
        for ( int i = 1; i <= matrizA.length-1; i++ ) { // estructura for para obtener el numero de aristas de la matriz
            System.out.print( "Ingrese el numero de vertices adyacentes al vertice " +i+ ":" );
            numeroAristas = sc.nextInt(); // ingresar datos por teclado
            if ( (numeroAristas != 0) && (numeroAristas <= 5) ) {
                System.out.print( "Ingrese los vertices adyacentes: " );
                for ( int j = 1; j <= numeroAristas; j++ ) {
                    int dato = sc.nextInt();
                    matrizA[i][dato] =1;
                }
            }else{
                if ( numeroAristas > 5) { //evalua numero de ariastas es mayor a 5
                    System.out.println( "El grafo no tiene ese numero de vertice" );
                }
            }//fin if/else
        } //fin for 
    }//fin metodo ingresarDato
    
    public void imprimirMatriz(){
        System.out.println( "Esta es la matriz de Adyacencia" );
        for (int[] m : matrizA) {
             System.out.println( Arrays.toString(m) );
        }
    }//fin metodo imprimirMAtriz
    
}//fin clase metodosGrafos
