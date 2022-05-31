/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionlistas;

/**
 *
 * @author alumnos
 */
public class Lista {
    class Nodo {
        int info;
        Nodo sig;
    }
    private Nodo raiz;
    
    public Lista (){ //Constructor
        raiz=null;
        
    }
    public int cantidadNodos(){
        int cantidad=0;
        Nodo recorrido=raiz;
        while (recorrido != null){
            recorrido=recorrido.sig;
            cantidad++;
            
        }
        return cantidad;
    }
    public void insertar (int pos, int informacion){
        if (pos<=cantidadNodos()+1){
            Nodo nuevo=new Nodo();
            nuevo.info=informacion;
            if (pos==1){
                nuevo.sig=raiz;
                raiz=nuevo;
            }else {
                if(pos==cantidadNodos()+1){
                    Nodo recorrido=raiz;
                    while(recorrido.sig!=null){
                        recorrido=recorrido.sig;
                    }
                    recorrido.sig=nuevo;
                    nuevo.sig=null;
                    
                }else{
                   
                 Nodo recorrido= raiz;
                    for (int i = 0; i < pos-1; i++) {
                        recorrido=recorrido.sig;     
                    }
                    Nodo siguiente=recorrido.sig;
                    recorrido.sig=nuevo;
                    nuevo.sig=siguiente;
                }
            }  
         }      
     }
    public void mostrarLista(){
        Nodo recorrido=raiz;
        while (recorrido!=null) {            
            System.out.print(recorrido.info+"->");
            recorrido=recorrido.sig;
        }
        System.out.println("");
    }
    public boolean vaciaLista(){
        if(raiz==null){
            return true;           
        }else{
            return false;
        }
    }
}
