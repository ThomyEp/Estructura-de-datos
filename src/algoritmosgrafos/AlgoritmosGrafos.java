/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmosgrafos;

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
        FroydWarshall fw = new FroydWarshall();
        long matrizA[][] = {{0, 3, 4, 999999999, 8,999999999},
                            {999999999, 0, 999999999, 999999999, 5, 999999999},
                            {999999999, 999999999 , 0, 999999999, 3, 999999999},
                            {999999999, 999999999, 999999999, 0, 999999999, 999999999},
                            {999999999, 999999999, 999999999, 7, 0, 3},
                            {999999999, 999999999, 999999999, 2, 999999999, 0}};
        System.out.println(fw.algoritmoFroyd(matrizA));
        
    }
    
    
}
