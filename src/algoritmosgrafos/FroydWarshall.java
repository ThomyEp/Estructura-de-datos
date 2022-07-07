/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosgrafos;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class FroydWarshall {
    //Metodos para determinar todos los camios Algoritmo de Floyd
    public String algoritmoFroyd( int matrizPeso[][]){ // metodo para ver los caminos posibles para llegar de un punto a otro
        int vertices = matrizPeso.length; //cantidad de vertices en la matriz de peso
        int matrizAdyacencia[][] = matrizPeso;
        String caminos[][] = new String[vertices][vertices]; // guarda todos los caminos 
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminosRecorrido = "";
        String caminitos = "";
        float temporal1;
        float temporal2;
        float temporal3;
        float temporal4;
        float minimo; //camino minimo
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                caminos[i][j] = "";  //iniciamos en blanco el vector caminos
                caminosAuxiliares[i][j] = "";
            }
        }//fin for i
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                temporal1 = matrizAdyacencia[i][j];
                temporal2 = matrizAdyacencia[i][k];
                temporal3 = matrizAdyacencia[k][j];
                temporal4 = temporal2 + temporal3;
                //encontrar al minimo
                minimo = Math.min(temporal1, temporal4); //toma valor minimo
                if (temporal1 != temporal4) {
                    if (minimo == temporal4) {
                        caminosRecorrido = "";
                        caminosAuxiliares[i][j] = k + "";
                        caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminosRecorrido) + (k + 1);
                    }//fin if minimo == temporal4
                }//fin if temporal1 != temporal4
                matrizAdyacencia[i][j] = (int) minimo; //cast
                }//fin for 
            }//fin for i
        }//fin for k
        for (int i = 0; i < vertices; i++) {
            int suma = 0;
            int suma2 = 0;
            for (int j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 999) { //si el valor no es infinitp 000000
                    if (i != j) {  //si no es 0
                        if (caminos[i][j].equals("")) {
                             suma += matrizPeso[i][j];
                            caminitos +=  "De (" +(i+1)+ "--->" +(j+1)+") irse por..(" +(i+1)+ "," +(j+1)+ ")\tsu peso minimo es: " +suma+ "\n";
                        }else {
                            suma2 += matrizPeso[i][j];
                            caminitos +=  "De (" +(i+1)+ "--->" +(j+1)+") irse por..(" +(i+1)+ "," +caminos[i][j]+ "," +(j+1)+ ")\tsu peso minimo es: " +suma2+ "\n";
                            suma2 = 0;
                        }// fin if/else
                    }//fin if i != j
                } //fin if matrizAdyacencia[i][j] != 1000
            } //fin for j
        }//fin for i
    return  "Los diferentes caminos mas cortos entre vertices son:\n" +caminitos; 
    }//fin metodo Froyd
    public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminosRecorrido){
        if (caminosAuxiliares[i][k] == "") {
            return "";
        }else {
            //recursividad
            caminosRecorrido += caminosR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminosRecorrido) + (Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+ ", ";
        }//fin if/else
        return caminosRecorrido;
    }//fin metodo caminosR
    
    public  void ingresarMatrizPesos(int matrizPeso[][]){ //metodo ingresar matriz 
        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingrese la matriz de peso" );
        for (int i = 0; i < matrizPeso.length; i++) {
            for (int j = 0; j < matrizPeso[i].length; j++){
                System.out.print( "["+(i+1)+ "] [" +(j+1)+ "]:");
                matrizPeso[i][j] = sc.nextInt();
            }
        }
    }//fin metodo ingresarMatrizPesos
    public  void imprimirMatriz(int matrizPeso[][]){ //metodo imprimir maatriz
        System.out.println("-----Matriz de Pesos-----");
        System.out.println("    1  2  3  4");
        for (int i = 0; i < matrizPeso.length; i++) {
             System.out.print( (i+1)+"  " );
            for (int j = 0; j < matrizPeso[i].length; j++) {
                System.out.print( "[" +matrizPeso[i][j]+ "]" );
            }
            System.out.println("");
        }
    }//fin metodo imprimir matrizPesos
}//fin clase FroyWarshall
