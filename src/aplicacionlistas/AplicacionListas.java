/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionlistas;

/**
 *
 * @author alumnos
 */
public class AplicacionListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Lista enlazada simple 
        System.out.println("Lista enlazada simple");
        Lista lea=new Lista();
        lea.insertar(1, 10);
        lea.insertar(2, 20);
        lea.insertar(3, 30);
        lea.insertar(4, 40);
        lea.mostrarLista();
       
    }
    
}
