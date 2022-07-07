/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmodijkstra;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class metodosDijkstra {
    int peso [];
    int camino [];
    boolean visitado [];
    int [][] matrizGrafo;
    public  metodosDijkstra(int numeroVertices) { //metodo constructor
        this.peso = new int[numeroVertices];
        this.camino = new int[numeroVertices];
        this.visitado = new boolean[numeroVertices];
        this.matrizGrafo = new int[numeroVertices][numeroVertices];
        peso [0] = 0;
        camino [0] = 1;
        visitado [0] = true;  // esta visitado
    }//fin meotodo constructor
    public void ingresarDatos(int numeroVertices){
        int numeroVerticesAdyacentes; //numero de vertices adyacentes
        int verticesAdyacente;
        int pesoArista;
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < numeroVertices; i++) {
                System.out.print( "Ingrese el numero de vertices adyacentes " +(i+1)+ ": " );
                numeroVerticesAdyacentes = sc.nextInt();
                while (numeroVerticesAdyacentes != 0) { //no existe vertice adyacente                    
                    System.out.println( "Ingrese los vertices adyacentes de " +(i+1)+ ": " );
                    verticesAdyacente = sc.nextInt()-1;
                    System.out.print( "Ingrese el peso de esta arista: " );
                    pesoArista = sc.nextInt();
                    matrizGrafo[i][verticesAdyacente] = pesoArista; //asignamos la matriz grafo el peso
                    numeroVerticesAdyacentes--;
                }//fin while
        }//fin for i
    }//fin metodo ingresarDatos
    public void ingresoInfinitos(int numeroVertices) {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                if (matrizGrafo[i][j] == 0) {
                    matrizGrafo[i][j] = 999;  //asignar infinito MAXInt
                }
            }
        }
    }//fin metodo ingresarInfinitos
    public void imprimirEntradaInfinita(int numeroVertices) {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matrizGrafo[i][j]+" ");
            }//fin for j
            System.out.println("");
        }//fin fon i
    }//fin imprimirEntradaInfinita
    public int verificarVisitados(int numeroVertices) {
        System.out.println("Vert");
        int aux = 1000;
        int verticeVisitado = 0;
        for (int i = 0; i < numeroVertices; i++) {
            if (visitado[i] == false) {
                if (peso[i] < aux) {
                    aux = peso[i];
                    verticeVisitado = i;
                }
            }
        }
        return verticeVisitado;
    }//fin metodo verificarVisitados
    public void imprimirVisitados(int numeroVertices) {
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print(visitado[i]);
            System.out.println("");
        }//fin fon i
    }//fin imprimirEntradaInfinita
    public void Dijkstra(int numeroVertices) {
        int j=0;
        int indice = 0;
        for (int i = 1; i < numeroVertices; i++) {
            visitado[i] = false;
            peso[i] = matrizGrafo[0][i];
            camino[i] = 0;
        }
        for (int i = 1; i < numeroVertices; i++) {
            indice = verificarVisitados(numeroVertices);
            if (indice != 0) {
                visitado[indice] = true;
                for ( j = 0; j < numeroVertices; j++) {
                    if (matrizGrafo[indice][j] != 999) {
                        if (visitado[j] == false) {
                            if (peso[indice] + matrizGrafo[indice][j] < peso[j]) {
                                peso[j] = peso[indice] + matrizGrafo[indice][j];
                                camino[j] =indice;
                            }
                        }//fin if visitado
                    }//fin if matrizGrafo[indice][j] != 999
                }//fin for j
            }//fin if indice !=0
        }//fin for i
    }
    public void caminoDj(int vertice) {
        if (vertice != 0) {
            caminoDj(camino[vertice]);
        }
        System.out.print( (vertice+1)+"," );
    }
    public void verCaminoDij(int numeroVertices) {
        System.out.println( "Camino y pesos minimos\n" );
        for (int i = 0; i < numeroVertices; i++) {
            System.out.println( "De 1 a " +(i+1)+ " = " );
            caminoDj(i);
            System.out.println( peso[i] );
        }
    }
}//fin clase principal metodosDijkstra
