/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MetodosMatriz {
    int matriz[][];
    int nFilas;
    int nCol;
    public   void ingresarMatriz(){
      
      
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Ingrese numero de filas:");
        nFilas=ingreso.nextInt();
        System.out.print("Ingrese numero de columnas:");
        nCol=ingreso.nextInt();
        matriz=new int[nFilas][nCol];
       //llenar matriz
        for (int i=0;i<nFilas;i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("matriz["+i+"]["+j+"]: ");
                  matriz[i][j]=ingreso.nextInt();
            }
        }   
    }
    public  void mostrarMatriz(){
            for (int i=0;i<nFilas;i++) {
                 for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");           
            }
        }
}
