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
    public void promedioGeneral(){
            promedionotas=new double[4];
            for (int i = 0; i < notas.length; i++) {
                int suma=0;
                for (int j = 0; j < notas[j].length; j++) {
                    suma=+notas[i][j];
                }
                promedionotas[i]=suma/notas[i].length;
            }
        }
        public void imprimirPromedio(){
            System.out.println("El promedio de los estudiantes es:");
            for (int i = 0; i < promedionotas.length; i++) {
                System.out.println(estudiantes[i]+"\t"+promedionotas[i]);
            }
        }
        public void promedioMateria(){     
            for (int j = 0; j < 3; j++) {
                double suma=0;
                for (int i = 0; i < 4; i++) {
                    suma=+notas[i][j];       
                }
                System.out.println(suma/notas.length);
            }
            System.out.println("");
        } 
        public void notaMayor()
    }
    

