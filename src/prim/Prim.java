/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prim;

/**
 *
 * @author alumnos
 */
public class Prim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] dato = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int vertices = dato.length;
        // La relación de la matriz de adyacencia está representada por una matriz bidimensional. El gran número de 10000 indica que los dos puntos no están conectados
        int[][] peso = new int[][]{{10000, 5, 7, 10000, 10000, 10000, 2}, 
                                    {5, 10000, 10000, 9, 10000, 10000, 3}, 
                                    {7, 10000, 10000, 10000, 8, 10000, 10000}, 
                                    {10000, 9, 10000, 10000, 10000, 4, 10000}, 
                                    {10000, 10000, 8, 10000, 10000, 5, 4}, 
                                    {10000, 10000, 10000, 4, 5, 10000, 6}, 
                                    {2, 3, 10000, 10000, 4, 6, 10000},};
        // Crear objeto MGraph
        MGrafo grafo = new MGrafo(vertices); // Crea un objeto MinTree
       minArbol ma = new minArbol();
        ma.crearGrafo(grafo, vertices, dato, peso); //Salida
        ma.mostrarGrafo(grafo);
        // Prueba el algoritmo de Plim
        ma.prim(grafo, 0);//
    }

    
}
