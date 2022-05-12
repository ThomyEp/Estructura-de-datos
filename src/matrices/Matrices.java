/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;



/**
 *
 * @author alumnos
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosMatrices mm=new metodosMatrices();
        mm.ingresarMatrriz();
        mm.mostrarMatriz();
        //System.out.println(mm.sumaMatriz());
        System.out.println(mm.sumaDiagonal()); // cuando es int imprimir debe ser dentro de un sout
        mm.buscarElmento();
       
    }
    
}
