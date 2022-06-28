/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesavl;

import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class metodosAVL {
    Integer raiz;
    metodosAVL subizq;
    metodosAVL subder;
    public void metodosAVL(){ //Constructor arbol vacio
        raiz=null;
        subizq=null;
        subder=null;           
    }//fin metodoAVL
    public void metodosAVL(Integer raiz){//Constructor nodo hoja o padre
        this.raiz=raiz;
        subizq=null;
        subder=null;
    }//fin metodoAVL con  parametro
    private boolean arbolVacio(){ //Metodo ver si el arbol esta vacio
        if (raiz!=null) {
            return false;
        }
        return true;
    }//fin metodo arbolVacio
    public void insertar(Integer nuevo){
        if (arbolVacio()) {
            raiz = nuevo; //inicializar nodo nuevo
            subizq = new metodosAVL(); 
            subder = new metodosAVL();
        }else{
            if (nuevo < raiz) {
                subizq.insertar(nuevo);// insertamos a la izquierda si es menor
            }else{
                subder.insertar(nuevo);// insertamos a la derecha si es mayor
            }//fin secundario
        }//fin if pricipal
    }//fin metodo insertar
    public void preOrden(){//Metodo imprimir en preorden
        if (!arbolVacio()) {
            System.out.print( raiz+" " );//raiz
            subizq.preOrden();//recorre izquierda
            subder.preOrden();//recorre derecha
        }//fin if 
    }//fin metodo preOrden
    public void posOrden(){//Metodo imprimir en posorden
        if (!arbolVacio()) {
            subizq.posOrden();//recorre izquierda
            subder.posOrden();//recorre derecha
            System.out.print( raiz+" " );//raiz
        }//fin if 
    }//fin metodo posOrden
     public void inOrden(){//Metodo imprimir en inorden
        if (!arbolVacio()) {
            subizq.inOrden();//recorre izquierda
            System.out.print( raiz+" " );//raiz
            subder.inOrden();//recorre derecha
        }//fin if 
    }//fin metodo inOrden
    public void imprimirNiveles(){ //Metodo imprimir por niveles el arbol
       Vector <metodosAVL> nivel = new Vector <>(); //Crear vector con la clase Vector de java
        metodosAVL arbol; //creamos arbol
        nivel.add(this);  //agrege el arbol
        System.out.println("----Arbol por niveles----");
        while (!nivel.isEmpty()) { //Vector diferente de vacio
            arbol = nivel.elementAt(0);
           
            nivel.remove(0); //remueve el nivel
           
            System.out.print(arbol.raiz+ " "); //imprime la raiz
            if (!arbol.subizq.arbolVacio()) { //elementos izquierda
                nivel.add(arbol.subizq);
            }//fin if isquierdo
            if (!arbol.subder.arbolVacio()) { //elementos derecha
                nivel.add(arbol.subder);  
            }//fin if isquierdo
        }
    }//fin metodo imprimiNiveles
    public int buscar(int x){ //Metodo para buscar un elemento del arbol  
            if (!arbolVacio()) { //llamar al metodo arbol vacio con la condicion !arbolVacio
                if (raiz == x) { //evalua si x es igual al elemtno raiz del arbol
                    return x;  // devuelve x si es el caso
                } //fin if raiz==x  
                if (raiz < x) {  //evalua si la raiz del arbol es menor a x
                    return subder.buscar(x);  //busca el elemento el sub arbol derecho
                } //fin if raiz<x
                if (raiz > x) { //evalua si la raiz del arbol es mayor a x
                    return subizq.buscar(x); //busca el elemento el sub arbol izq
                } //fin if raiz>x         
            }// fin if !arbolVacio()
            return Integer.MAX_VALUE; //devulve MAX.VALUE si no se encontro el elemento
    }//fin metodo buscar
    private double sumaArbol(){ //Metodo promedio arbol
        int suma1 = 0;
        int suma2 = 0;  
        if (raiz != null) {
            suma1+= raiz; //suma valor de la raiz
            suma2+= subder.sumaArbol(); //suma valores del subarbol derecho
            suma2+= subizq.sumaArbol(); //suma valores del subarbol izquierdo  
        }
        return (suma1 + suma2);
    }//fin if promedioArbol
    public void promedio(){//Metodo imprime eñ promedio
        double promedio;
        promedio = sumaArbol() / cantidadNodos();
        System.out.printf( "El promedio del arbol es: %f\n", promedio );
    }//fin metodo 
    public int cantidadNodos(){ //Metodo cantidad nodos del arbol
        if (raiz == null) return  0; { //conparamos raiz==null y devolvemos 0
           int cant1 = subder.cantidadNodos(); //cuenta datos del sub arbol derecho
           int cant2 = subder.cantidadNodos(); //cuenta datos del sub arbol izquierdo
           return (cant1+cant2+1); //con le contador guardamos numero de nodos de subizq subder 
        }//fin if raiz==null
    }//fin del metodo cantidad nodos
    public void nodosPadre(){ //metodo imprime nodos padre del arbol
        if (raiz!=null) { //compara si hay elementos en el arbol
            if ( (subizq.raiz != null) && (subder.raiz != null) ) {  //evalua los subarboles
                System.out.print(" " +raiz ); //imprime los datos que son padres del arbol
                subizq.nodosPadre();
                subder.nodosPadre();  
            }//fin if subarboles
        }//fin if raiz!= null
    }//fin metodo nodosPadre
    public void nodosHoja(){ //metodo imprimir nodos hoja
        if (raiz!=null) { //compara si hay elementos en el arbol
            if (( subizq.subizq.raiz!= null) && (subder.subder.raiz != null) /*&& (subizq.raiz != null) && (subder.raiz != null)*/) {
                  System.out.print( subizq.subizq.raiz+" "+subizq.subder.raiz+" "+subder.subizq.raiz+" "+subder.subder.raiz+" \n");
                    subizq.nodosHoja();
                    subder.nodosHoja(); 
            }//fin inf evaluar subarboles de los subarboles
        }//fin if raiz!=null     
    }//fin metodo nodosHoja   
   
}//fin class metodosAVL
