/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prim;

import java.util.Arrays;

/**
 *
 * @author alumnos
 */
public class minArbol {
    public void crearGrafo(MGrafo grafo, int vertices, char dato[], int[][] peso) {
        int i, j;
        for (i = 0; i < vertices; i++) {// Vertex graph.data [i] = data [i];
            for (j = 0; j < vertices; j++) {
                grafo.peso[i][j] = peso[i][j];
            }
        }
    }

    // Mostrar la matriz de adyacencia del gráfico
    public void mostrarGrafo(MGrafo grafo) {
        for (int[] link : grafo.peso) {
            System.out.println(Arrays.toString(link));
        }
    }

    // Escribe el algoritmo prim para obtener el árbol de expansión mínimo

    /**
           * gráfico gráfico @param
           * @param v significa generar'A '-> 0'B' -> 1 ...
     */
    public void prim(MGrafo grafo, int v) {
        // visitado [] marca si el nodo (vértice) ha sido visitado
        int visita[] = new int[grafo.vertices];
        // visitado [] El valor del elemento predeterminado es 0, lo que significa que no ha sido visitado
        /*for (int i = 0; i < graph.verxs; i++) {
            visited[i] = 0;
        }*/

        // Marcar el nodo actual como visitado
        visita[v] = 1;
        // h1 y h2 registran los subíndices de los dos vértices
        int h1 = -1;
        int h2 = -1;
        int minPeso = 10000; // Inicializar minWeight a un número grande, que será reemplazado más adelante en el proceso transversal
        for (int k = 1; k < grafo.vertices; k++) {// Debido a que hay vértices graph.verxs, después de que finaliza el algoritmo de Plim, hay bordes graph.verxs-1
            // Esto es para determinar cada subgrafo generado, qué nodo es el más cercano
            for (int i = 0; i < grafo.vertices; i++) {// i nodo representa el nodo que se ha visitado
                for (int j = 0; j < grafo.vertices; j++) {// j nodo significa un nodo que no ha sido visitado
                    if (visita[i] == 1 && visita[j] == 0 && grafo.peso[i][j] < minPeso) {
                        // Reemplazar minWeight (encuentra el borde con el menor peso entre el nodo que se ha visitado y el nodo que no se ha visitado)
                        minPeso = grafo.peso[i][j];
                        h1 = i;
                        h2 = j;
                    }
                }
            }
            // Encuentra una arista que sea la más pequeña
            System.out.println("Lado <" + grafo.dato[h1] + "," + grafo.dato[h2] + "> Peso:" + minPeso); // Marcar el nodo actual como visitado
            visita[h2] = 1;
            // minWeight se restablece al valor máximo de 10000
            minPeso = 10000;
        }
    }
}

class MGrafo {
    int vertices; // Indica el número de nodos en el gráfico
    char[] dato;// Almacenar datos del nodo
    int[][] peso; // Almacenar bordes, que es nuestra matriz de adyacencia

    public MGrafo(int vertices) {
        this.vertices = vertices;
        dato = new char[vertices];
        peso = new int[vertices][vertices];
    }
}
