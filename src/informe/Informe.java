/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informe;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Informe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso=new Scanner(System.in);
        int op;
        int numeroNotas=0;
        float notas=0;
        do {
            System.out.println("Ejercicio 2\n1.Con Estructura For\n2.Con Estructura Do-While\n3.Con Estructura While");
            System.out.print("Ingrese numero de caso:");
            op=ingreso.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ejercicios estructura repetitiva For");
                    fFor(numeroNotas, notas);
                    break;
                case 2:
                    System.out.println("Ejercicios estructura repetitiva Do-While");
                    dDoWhile(numeroNotas, notas);
                    break;
                case 3:
                    System.out.println("Ejercicios estructura repetitiva While");
                    wWhile(numeroNotas, notas);
                    break;    
                default:
                     System.out.println("Fin del programa");
            }
        } while (op<4);      
    }
    public static void fFor(int x,float y){
        int apro=0;
        int repro=0;
        float promA=0;
        float promR=0;
        float acuA=0;
        float acuR=0;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Cuantas notas desea ingresar: ");
        x=ingreso.nextInt();
                  for (int i = 0; i < x; i++) {
                      System.out.print("Ingrese la "+(i+1)+" nota:");
                      y=ingreso.nextFloat(); 
                       if (y>=8 ) {
                          apro+=1;
                          acuA+=y;
                          promA=(acuA/apro);
                      }
                      else{
                          repro+=1;
                          acuR+=y;
                          promR=(acuR/repro);
                      }
                }
                System.out.println("Los estudiantes aprovados son:"+apro+" y su promedio es: "+promA);
                System.out.println("Los estudiantes reprobados son: "+repro+" y su promedio es: "+promR);
          }
    public static void dDoWhile(int x, float y){
        int i=0;
        int apro=0;
        int repro=0;
        float promA=0;
        float promR=0;
        float acuA=0;
        float acuR=0;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Cuantas notas desea ingresar: ");
        x=ingreso.nextInt();
        do {
             System.out.print("Ingrese la "+(i+1)+" nota:");
             y=ingreso.nextFloat();
             if (y>=8 ) {
                          apro+=1;
                          acuA+=y;
                          promA=(acuA/apro);
                      }
                      else{
                          repro+=1;
                          acuR+=y;
                          promR=(acuR/repro);
                      }
             i++; 
         } while (i<x);
        System.out.println("Los estudiantes aprovados son:"+apro+" y su promedio es: "+promA);
        System.out.println("Los estudiantes reprobados son: "+repro+" y su promedio es: "+promR);
     }
    public static void  wWhile(int x, float y){
        int i=0;
        int apro=0;
        int repro=0;
        float promA=0;
        float promR=0;
        float acuA=0;
        float acuR=0;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Cuantas notas desea ingresar: ");
        x=ingreso.nextInt();
        while (x>i) {
            System.out.print("Ingrese la "+(i+1)+" nota:");
            y=ingreso.nextFloat();
              if (y>=8 ) {
                          apro+=1;
                          acuA+=y;
                          promA=(acuA/apro);
                      }
                      else{
                          repro+=1;
                          acuR+=y;
                          promR=(acuR/repro);
                      }            
            i++;
        }
        System.out.println("Los estudiantes aprovados son:"+apro+" y su promedio es: "+promA);
        System.out.println("Los estudiantes reprobados son: "+repro+" y su promedio es: "+promR);
    }
}
