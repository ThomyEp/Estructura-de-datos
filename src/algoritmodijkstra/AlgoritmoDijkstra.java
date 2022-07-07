/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmodijkstra;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class AlgoritmoDijkstra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int numeroVertices;
        System.out.print( "Ingrese numero de vertices del grafo: " );
        numeroVertices = sc.nextInt();
        metodosDijkstra md = new  metodosDijkstra(numeroVertices);
        md.ingresarDatos(numeroVertices);
        md.ingresoInfinitos(numeroVertices);
        md.imprimirEntradaInfinita(numeroVertices);
        md.verificarVisitados(numeroVertices);
        md.imprimirVisitados(numeroVertices);
        md.Dijkstra(numeroVertices);
        md.verCaminoDij(numeroVertices);
    }
    
}
