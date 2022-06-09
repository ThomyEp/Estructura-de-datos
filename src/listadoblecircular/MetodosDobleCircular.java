/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoblecircular;

import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.event.CaretListener;

/**
 *
 * @author alumnos
 */
public class MetodosDobleCircular {
    class Nodo{
        int info;
        Nodo ant,sig;
    }
    private Nodo raiz;
    
    public  MetodosDobleCircular(){
        Nodo raiz=null;
    }
    public boolean vacia(){
        if (raiz==null) {
            return true;
        }
        else{
           return false;  
         }
    }
    public int cantidadNodos(){
        int cant=0;
        if (!vacia()) {
            Nodo recorrido=raiz;
            do {
                cant++;
                recorrido=recorrido.sig;
            } while (recorrido!=raiz);
        }
        return cant;
    }
    public void imprimir(){
        if (!vacia()) {
            Nodo recorrido=raiz;
            do {
                System.out.print(recorrido.info+" ->");
                recorrido=recorrido.sig;
            } while (recorrido!=raiz);
        }
        System.out.println();
    }
    public void insertarInicio(int elemento){
        Nodo nuevo=new Nodo();
        nuevo.info=elemento;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;
            raiz=nuevo;
        }
        else{
        Nodo primero=raiz.sig;
        nuevo.sig=raiz;
        nuevo.ant=primero;
        raiz.ant=nuevo;
        primero.sig=nuevo;
        raiz=nuevo;
        }
    }
    public void insertarUltimoo(int elemento){
        Nodo nuevo=new Nodo();
        nuevo.info=elemento;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;
            raiz=nuevo;
        }
        else{
        Nodo ultimo=raiz.ant;
        nuevo.sig=raiz;
        nuevo.ant=ultimo;
        raiz.ant=nuevo;
        ultimo.sig=nuevo;
        //raiz=nuevo;
        }
    }
    public void borrarNodo(int posicion){
        if (posicion<=cantidadNodos()) {
            //Eliminar al principio
            if (posicion==1){
                if (cantidadNodos()==1){
                raiz=null;
            }
            else{
                Nodo primero=raiz.ant;
                raiz=raiz.sig;
                primero.sig=raiz;
                raiz.ant=primero;
            }
        }
        else{
            Nodo recorrido=raiz;
            for (int i = 0; i < posicion-1; i++) {
                recorrido=recorrido.sig;
            }
            Nodo anterior=recorrido.ant;
            recorrido=recorrido.sig;
            anterior.sig=recorrido;
            recorrido.ant=anterior; 
             }
        }
    }
    public boolean  buscarElemento(int elemento){
        Nodo recorrido=raiz;
        do {            
            if (elemento==recorrido.info) {
                return true;
            }
            recorrido=recorrido.sig;
        } while (recorrido!=raiz);
        return false;
    }
    public void promedio(){
        Nodo recorrido=raiz;
        int suma=0;
        double prom=0;
        do {
            suma+=recorrido.info;
            
            prom=suma/cantidadNodos();
            recorrido=recorrido.sig;
        } while (recorrido!=raiz);
        System.out.println("El promedio de los datos es:"+prom);
    }
    //Buscar sin boolean
    public void Buscar(int elemento){
          Nodo recorrido=raiz;
          int band=0;
        do {            
            if (elemento==recorrido.info) {
               band=1;
            }
            recorrido=recorrido.sig;
        } while (recorrido!=raiz);
       
        if (band==1) {
            System.out.println("Elemento existe");
        }else{
            System.out.println("Elemento no existe");
        }
    }
}
