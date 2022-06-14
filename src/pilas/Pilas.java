/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MetodosPila mp=new MetodosPila();
        if (mp.vaciaPila()) {
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("La pita posee elementos");
        }
        mp.apilarLifo(100);
        mp.apilarLifo(40);
        mp.apilarLifo(1);
        mp.apilarLifo(3);
        mp.apilarLifo(7);
        mp.apilarLifo(200);
        mp.imprimiPila();
        System.out.println("------Cantidad elementos de la pila------");
        mp.cantidadElementos();
        System.out.println("------Elemento mayor pila------");
        mp.elementoMayor();
        System.out.println("------Buscar elemento de la pila------");
        System.out.print("Ingrese el elemento que desea buscar:");
        int elementoB=sc.nextInt();
        mp.buscarElemento(elementoB);
        System.out.println("------Imprimir elementos impares de la pila------");
        mp.imprimirImpares();
        mp.imprimiPila();
        System.out.println("------Desapilar------");
        System.out.println("Se borra el elemento:"+mp.desapilarPila());
        mp.imprimiPila();
        System.out.println("Se borra el elemento:"+mp.desapilarPila());
        mp.imprimiPila();
    }
    
}
