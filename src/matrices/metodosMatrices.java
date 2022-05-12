/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class metodosMatrices {
    int[][] matriz;
    int FILAS;
    int COLUMNAS;
    Scanner entrada = new Scanner(System.in);
    int f, c, mayor, menor;
    int filaMayor, filaMenor, colMayor, colMenor;
    //definir tamaño matriz
    public void ingresarMatrriz(){
        System.out.print("Ingrese numeros de filas:");
        FILAS=entrada.nextInt();
        System.out.print("Ingrese numero de columnas:");
        COLUMNAS=entrada.nextInt();
        matrizCuadrada();
        matriz = new int[FILAS][COLUMNAS];
        for(f=0;f<FILAS;f++){
            for(c=0;c<COLUMNAS;c++){
                System.out.print("matriz ["+f+"]["+c+"]:");
                matriz[f][c]=entrada.nextInt();
            }
        }
    }
    public void mostrarMatriz(){
      System.out.println("La matriz ingresada es:");
            for (f = 0; f < FILAS; f++) { 
            for (c = 0; c < COLUMNAS; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    
    }
    public int sumaMatriz(){
        int suma=0;
        System.out.print("La suma de los elemetos de la matris ingrsada es: ");
         for (f = 0; f < FILAS; f++) { 
            for (c = 0; c < COLUMNAS; c++) {
                suma=suma+matriz[f][c];
            }
        }
        return suma;
      }
    public void matrizCuadrada(){
        if(COLUMNAS!=FILAS){
            System.out.println("La matriz  no es cuadrada");
        } else{
            System.out.println("La matriz es cuadrada");  
        }
    }
    public int sumaDiagonal(){
    int sumad=0;
        System.out.println("Los elementos de la diagonal es:");
     for (f = 0; f < FILAS; f++) {
            for (c=0; c < COLUMNAS; c++) {
                if(f==c){
             sumad=sumad+matriz[f][c];
         }
        }  
     }
        return sumad;
    }
    
    public void  buscarElmento(){
        int elemento;
      
        System.out.print("Ingrese elemento que desea buscar:");
        elemento=entrada.nextInt();
      for (f =0; f<FILAS;f++) {
            for (c=0; c < COLUMNAS; c++) {
             if(elemento==matriz[f][c]){
                 System.out.println("Elemento existe"+elemento+" en la posicicion"+matriz[f][c]);
             }
             else{            }  
            System.out.println("Elemento no existe");
             }
         }
    }
 }


       
    
 

