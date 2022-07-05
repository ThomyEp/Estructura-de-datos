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
        this.matrizA = new int[6][6]; //declarar matriz a de 5x5
        this.matrizB = new int[6][6]; //declarar matriz b de 5x5
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
    
    public void grado(){ //Grado de cada vertice , el grad omayor es el grado del grafo
        int grado[] = new int [6]; // declarar e inicializar el vector co tamaño 6
        int contador;
        for (int i = 1; i <= matrizA.length-1; i++) {
            contador = 0; //resetea al contador cada vez que hace el bucle
            for (int j = 1; j <= matrizA[i].length-1; j++) {
                if ((matrizA[i][j] == 1)|| (matrizA[j][i] == 1) ) {
                    contador += 1; //suma 1 al contador
                }//fin if
            }//fin for j
            grado[i] = contador; //asignar los valores de contador al vector grafos
        }//fin for i
        //imprimir vector grafo
        for (int i = 1; i <= grado.length-1; i++) {
            System.out.println( "El grado del vertice " +i+ " es:" +grado[i] );
        } //fin for i
    }//fin meotodo grado
    /*public void imprimirMatriz(){
        System.out.println( "Esta es la matriz de Adyacencia" );
        for (int[] m : matrizA) {
             System.out.println( Arrays.toString(m) );
        }
    }//fin metodo imprimirMAtriz*/
    public void imprimirMatrizA(){
        System.out.println( "Esta es la matriz de Adyacencia" );
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print( " " +matrizA[i][j]);
            }
            System.out.print( "\n" );
        }
    }//fin metodo imprimirMAtriz
    public void grafoConexo(){ //metodo para ver si un grafico es conexo
        boolean bandera;
        int contador = 0;
        for (int i = 1; i < matrizA.length-1; i++) {
            bandera = false;
            for (int j = 1; j < matrizA[i].length-1; j++) {
                if (matrizA[i][j] == 1) {
                    bandera = true;
                }//fin if
            }//fin for j
            if (bandera) {
                contador += 1;
            }//fin if
        }//fin for i
        if (contador == matrizA.length-1) {
            System.out.println( "El grafo es Conexo" );
        }else {
            System.out.println( "No es Conexo" );
        }//fin if/else
    }//fin metodo grafoConexo
}//fin clase metodosGrafos
