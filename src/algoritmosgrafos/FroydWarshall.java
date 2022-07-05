/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosgrafos;

/**
 *
 * @author Usuario
 */
public class FroydWarshall {
    //Metodos para determinar todos los camios Algoritmo de Floyd
    public String algoritmoFroyd( long matrizPeso[][]){ // metodo para ver los caminos posibles para llegar de un punto a otro
        int vertices = matrizPeso.length; //cantidad de vertices en la matriz de peso
        long matrizAdyacencia[][] = matrizPeso;
        String caminos[][] = new String[vertices][vertices]; // guarda todos los caminos 
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminosRecorrido = "", cadena = "", caminitos = "";
        float temporal1;
        float temporal2;
        float temporal3;
        float temporal4;
        float minimo; //camino minimo
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                caminos[i][j] = "";  //iniciamos en blanco
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
                minimo = Math.min(temporal1, temporal4);
                if (temporal1 != temporal4) {
                    if (minimo == temporal4) {
                        caminosRecorrido = "";
                        caminosAuxiliares[i][j] = k + "";
                        caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminosRecorrido) + (k + 1);
                    }//fin if minimo == temporal4
                }//fin if temporal1 != temporal4
                matrizAdyacencia[i][j] = (long) minimo; //cast
                }//fin for 
            }//fin for i
        }//fin for k
        //Agregamos el camino minimo a la cadena
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                //matriz de esos minimos
                cadena = cadena + "[" +matrizAdyacencia[i][j]+ "]" ;
            }// fin for j
            cadena += "\n";
        }//fin for i
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 1000000000) { //si el valor no es infinitp
                    if (i != j) {  //si no es 0
                        if (caminos[i][j].equals("")) {
                            caminitos +=  "De (" +(i+1)+ "--->" +(j+1)+") irse por..(" +(i+1)+ ", " +(j+1)+ ")\n";
                        }else {
                            caminitos +=  "De (" +(i+1)+ "--->" +(j+1)+") irse por..(" +(i+1)+ ", " +caminos[i][j]+ ", " +(j+1)+ ")\n";
                        }// fin if/else
                    }//fin if i != j
                } //fin if matrizAdyacencia[i][j] != 1000000000
            } //fin for j
        }//fin for i
    return "La matriz de caminos mas costos entre lso diferentes vertices es:\n" +cadena+ "\n los diferentes caminos mas cortos entre vertices son:\n" +caminitos; 
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
    
}//fin clase FroyWarshall
