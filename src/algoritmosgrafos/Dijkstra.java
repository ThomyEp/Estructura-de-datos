/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosgrafos;

/**
 *
 * @author Usuario
 */
public class Dijkstra {
    
    public  int distancia[] = new int[10];
    public  int costo[][] = new int[10][10];

    public void algoritmoDijkstra(int n,int s){
        
        int bandera[] = new int[n+1];
         int minpos = 1;
         int i;
         int c;
         int minimo;
         for(i=1; i<= n; i++){  
             bandera[i]=0; 
             this.distancia[i]=this.costo[s][i]; 
        }
        c=2;
        while(c <= n){
            minimo=99;
            for(int k=1; k <= n; k++){  
                if( (this.distancia[k] < minimo) && (bandera[k]!=1) ){
                minimo=this.distancia[i];
                minpos=k;
                }
             } 
             bandera[minpos]=1;
             c++;
            for(int k=1; k <= n; k++){ 
                if( (this.distancia[minpos]+this.costo[minpos][k] <  this.distancia[k]) && (bandera[k]!=1) ){
                   this.distancia[k]=this.distancia[minpos]+this.costo[minpos][k]; 
                }//fin if
            }//fin for k   
        }//fin while 
    }//fin algoritmoDijkstra
    public  void imprimirMatrizCosto(){
        System.out.println("-----Matriz de Pesos-----");
        System.out.println("    1  2  3  4   5  6");
        for (int i = 0; i < costo.length; i++) {
             System.out.print( (i+1)+"  " );
            for (int j = 0; j < costo[i].length; j++) {
                System.out.print( "[" +costo[i][j]+ "]" );
            }
            System.out.println("");
        }
    }//fin metodo imprimir matrizcosto
}//fin clase dijkstra
