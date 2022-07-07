/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmosgrafos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlgoritmosGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Algoritmos-----\n1.Algoritmo de Froy Warshall\n2.Algoritmo de Dijkstra");
        System.out.print( "Seleccione el algoritmo que desea usar:" );
        int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    FroydWarshall fw = new FroydWarshall();
                    int matrizA[][] = {{0, 3, 4, 999, 8,999},
                                        {999, 0, 999, 999, 5, 999},
                                        {999, 999, 0, 999, 3, 999},
                                        {999, 999, 999, 0, 999, 999},
                                        {999, 999, 999, 7, 0, 3},
                                        {999, 999, 999, 2, 999, 0}};
                    
                    fw.imprimirMatriz(matrizA);
                    System.out.println(fw.algoritmoFroyd(matrizA));
                    
                    System.out.print( "Ingrese numero de nodos: ");
                    int numeroNodosF = sc.nextInt();
                    int matrizB[][] = new int[numeroNodosF][numeroNodosF];
                    fw.ingresarMatrizPesos(matrizB);
                    fw.imprimirMatriz(matrizB);
                    System.out.println(fw.algoritmoFroyd(matrizB));
                    
                    break;
                case 2:
                   
                    System.out.print( "Ingrese numero de nodos: ");
                    int numeroNodosD = sc.nextInt();
                    Dijkstra d = new Dijkstra();
                    System.out.println( "Ingrese el costo de la matriz de peso: " );
                          for(int i=1; i <= numeroNodosD; i++){
                              for(int j=1; j <= numeroNodosD; j++){
                                  System.out.print( "["+i+ "] [" +j+ "]:");
                                  d.costo[i][j] = sc.nextInt();
                                  if(d.costo[i][j] == 0){
                                     d.costo[i][j] = 999;                   
                                  }
                              }
                            }
                    System.out.println( "Ingrese vertice origen :" );
                    int origen=sc.nextInt();

                    d.algoritmoDijkstra(numeroNodosD,origen);
                    System.out.println("El camino mas corto desde el origen: \t"+origen+"\t a todos los demas vertices : \n");
                          for(int i=1; i <= numeroNodosD; i++)
                            if(i != origen)
                    System.out.println("origen: "+origen+"\t destino :"+i+"\t costo minimo: "+d.distancia[i]+"\t");
                    break;
                 case 3:
                    
                    break;    
                default:
                    throw new AssertionError();
            }
        
        
    }//fin metodo main
     
}//fin clase principal Algoritmos grafos
