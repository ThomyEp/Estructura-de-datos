/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobleenlazadas;



/**
 *
 * @author alumnos
 */
public class MetodosListaDoble {
    class Nodo{
        int info;
        Nodo sig,ant;
    }
    private Nodo raiz;
    public MetodosListaDoble(){
        raiz=null;
    }             
    public boolean vaciaListaDoble(){
    if (raiz==null) {
        return true;
        }
        else{
        return false;
        }
    }
    public int cantidadNodos(){
        int cantidad=0;
        Nodo recorrido=raiz;
        while (recorrido!=null) {            
            recorrido=recorrido.sig;
            cantidad++;
        }
        return cantidad;
    }
    public void imprimirLista(){
        Nodo recorrido=raiz;
        while (recorrido!=null) {            
            System.out.print(recorrido.info+" ->");
            recorrido=recorrido.sig;
        }
        System.out.println();
    }
    public void insertarDatos(int posicion,int x){
        if (posicion<=cantidadNodos()+1) {
            Nodo nuevo=new Nodo();
            nuevo.info=x;
            if (posicion==1) {
                nuevo.sig=raiz;
                if (raiz!=null) {
                    raiz.ant=nuevo;
                }
                raiz=nuevo;
            }
            else{
                if(posicion==cantidadNodos()+1){
                    Nodo recorrido=raiz;
                    while (recorrido.sig!=null) {                        
                        recorrido=recorrido.sig;
                    }
                    recorrido.sig=nuevo;
                    nuevo.ant=recorrido;
                    nuevo.sig=null;
                }
                else{
                    Nodo recorrido=raiz;
                    for (int i = 0; i < posicion-1; i++) {
                        recorrido=recorrido.sig;
                    }
                    Nodo siguiente=recorrido.sig;
                    recorrido.sig=nuevo;
                    nuevo.ant=recorrido;
                    nuevo.sig=siguiente;
                    siguiente.ant=nuevo;
                }
            }
        }
    }
    public boolean  listaOrdenada(){
        if (cantidadNodos()>1) {
            Nodo recorrido1=raiz;
            Nodo recorrido2=raiz.sig;
             while (recorrido2!=null) {
                 if(recorrido2.info<recorrido1.info){ //si es mayor return true 
                     return false;
                 }
             recorrido1=recorrido1.sig;
             recorrido2=recorrido2.sig;
             } 
        }       
    return false;
    }
    public boolean buscarDato(int dato){
        if (cantidadNodos()>1) {
            Nodo recorrido1=raiz;
             while (recorrido1!=null) {
                 if(recorrido1.info==dato){ 
                     return true;
                 }
             recorrido1=recorrido1.sig;
             } 
        }     
        return false;
    }
}
        
