/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresmatricesparalelas;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class metodos {
    private Scanner entrada;
        private String[] estudiantes;
        private int [][] notas;
        
        public void ingresar(){
            entrada=new Scanner(System.in);
            estudiantes=new String[4];
            notas=new int[4][3];
            for (int i = 0; i < estudiantes.length; i++) {
                System.out.print("Ingrese el nombre del estudiante"+(i+1)+":");
                estudiantes[i]=entrada.next();
                for (int j = 0; j <notas[j].length; j++) {
                    System.out.print("Ingrese la nota de la asignatura:");
                    notas[i][j]=entrada.nextInt();
                    
                }
            }
        }
        public void imprimir(){
            System.out.println("Notas de los estudiantes");
            System.out.println("Estudiantes \tED\t\tPOO\t\tISC");
            for (int i = 0; i < estudiantes.length; i++) {
                    System.out.print("\n"+estudiantes[i]);
                for (int j = 0; j < notas[i].length; j++) {  
                    System.out.print("\t\t"+notas[i][j]);
                }                
            }
        }
    }
    

