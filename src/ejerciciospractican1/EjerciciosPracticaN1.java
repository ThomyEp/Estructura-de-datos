/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospractican1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosPracticaN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        int num=0;
        Scanner entrada=new Scanner(System.in);
        do {            
            System.out.println("Menu de opciones \n1.Ejercicio 1\n2.Ejercicio 2");
            System.out.print("Ingrese un numero del ejercicio:");
            op= entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ejercicio 1");
                    regiones(num);
                    break;
                case 2:
                    System.out.println("Ejercicio 2");
                    tablasMultiplicar();
                    break;
                default:
                    System.out.println("Fin del programa");
            }
        } while (op<3);
    }
    public static void regiones(int x){
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println("Regiones disponibles\n1.Sierra\n2.Costa\n3.Otiente\n4.Insular");
            System.out.println("Ingrese un numero");
            x=entrada.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Region Sierra");
                    break;
                case 2:
                    System.out.println("Region Costa");
                    break;
                case 3:
                    System.out.println("Region Oriente");
                    break;
                case 4:
                    System.out.println("Region Insular");
                    break;    
                default:
                    System.out.println("No pertenece a ninguna region");
            }
        } while (x<5);
    }
     public static void tablasMultiplicar(){
            System.out.println("Tabla de multiplicar del 1 al 10");
        for (int i=1;i<10+1;i++) {
            System.out.println("Tabla del " +i);
            for (int j=1;j<10+1;j++) {
                System.out.println(i+"*"+j+"="+i*j);
                 }  
            }
        }
    
}
