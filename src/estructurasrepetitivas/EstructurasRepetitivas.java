/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class EstructurasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso=new Scanner(System.in);
        Estructuras er=new Estructuras();
        int num;
        do {  
            
        System.out.println("1.Estrutura Do while");
        System.out.println("2.Estructura While ");
        System.out.println("3.Estructura For");
        System.out.println("4.Estructura de repeticion anidadas");
        System.out.println("5.Salir");
        System.out.print("Ingrese numero de caso:");
        num=ingreso.nextInt();
        switch (num) {
            case 1:
                System.out.println("Suma de los n primero numeros naturales");
                er.doWhile();
                break;
            case 2:
                System.out.println("Sumar sueldos de 10 trabajadores y sacar promedio");
                 er.wWhile();
                break;
            case 3:
                System.out.println("Serie de numeros");
                 er.fFor();
                break;
            case 4:
                System.out.println("Tablas de multiplicar");
                 er.repeAnidadas();
                break;    
            default:
                System.out.println("Gracias por usar el programa");
        }
          } while (num<4);
    }  
}
