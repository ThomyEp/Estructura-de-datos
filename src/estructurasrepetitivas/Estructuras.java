/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Estructuras {
    //Do while
      Scanner ingreso=new Scanner(System.in);
    public  void  doWhile(){
           int contador=0;
        int acumulador=0;
        int n;
      
        System.out.print("Ingrese la cnatidad de numeros naturales a sumar:");
        n=ingreso.nextInt();
        do {            
            ++contador;
            acumulador+=contador;
        } while (contador<n);
        System.out.println("El numero de numero sumados es:"+contador);
        System.out.println("La suma de los primeros "+contador+" numeros es:"+acumulador);
      
    }
    //While
     public  void wWhile(){
        int cont=1;
        float totals=0;
        float sueldo;
        float prom;
        while (cont<=10) {            
            System.out.print("Ingrese el sueldo del trabajador "+cont+":");
            sueldo=ingreso.nextFloat();
            totals+=sueldo;
            ++cont;
        }
        System.out.println("El total de sueldos es: "+totals);
        prom=totals/10;
        System.out.println("El promedio de sueldos es: "+prom);
       }
     //For
    public   void fFor(){
        int n;
        int series=3;
        System.out.print("¿Cuantos numeros de la serie desea?:");
        n=ingreso.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(series+",");
            series+=3;
        }
        System.out.println("");
    }
    //Repeticion anidadas
    public void repeAnidadas(){
        System.out.println("Tabla de multiplicar del 1 al 10");
        for (int i=1;i<10+1;i++) {
            System.out.println("Tabla del " +i);
            for (int j=1;j<10+1;j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            
        }
    }
}
