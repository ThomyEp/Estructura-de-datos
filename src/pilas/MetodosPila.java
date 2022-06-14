/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author Usuario
 */
public class MetodosPila {
    class Nodo{
        int info;
        Nodo sig;
    }
    private Nodo raiz;
    
    public MetodosPila(){
        raiz=null;
    }
    public void apilarLifo(int x){
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (raiz==null) {
            nuevo.sig=null;
            raiz=nuevo;
        }else{
            nuevo.sig=raiz;
            raiz=nuevo;
        }
    }
    public void imprimiPila(){
        Nodo recorrido=raiz;
        System.out.println("Los datos de la pila son");
        while (recorrido!=null) {            
            System.out.println(recorrido.info);
            recorrido=recorrido.sig;
        }
    }
    public int desapilarPila(){
        if (raiz!=null) {
            int dato=raiz.info;
            raiz=raiz.sig;
            return dato;
        }else{
            return 0;
        }
    }
    public boolean  vaciaPila(){
        if (raiz==null) {
            return true;
        }else{
            return false;
        }
    }
    public void cantidadElementos(){
        Nodo recorrido=raiz;
        int cont=0;
        while (recorrido!=null) {            
            cont+=1;
            recorrido=recorrido.sig;
        }
        System.out.println("La pila tiene "+cont+" elementos");
    }
    //Nodo mayor y la posicion
    public void elementoMayor(){
        int mayor=0;
        int posicion=0;
        Nodo recorrido=raiz;
        while (recorrido!=null) {
            if (recorrido.info>mayor) {
                mayor=recorrido.info;
                posicion+=1;
            }
            recorrido=recorrido.sig;
        }
        System.out.println("El elemento mayor es "+mayor+" y se encuentra en la posicion "+posicion);
    } 
    public void buscarElemento(int x){
        Nodo recorrido=raiz;
        int band=0;
        while (recorrido!=null) {            
            if (recorrido.info==x) {
                band=1;
            }
            recorrido=recorrido.sig;
        }
        if (band==1) {
            System.out.println("El elemento "+x+" existe en la pila");
        }else{
            System.out.println("El elemento "+x+" no existe en la pila");
        }
    }
    public void imprimirImpares(){
        Nodo recorrido=raiz;
        Nodo nuevo=new Nodo();
        nuevo=raiz;
        while (recorrido!=null) {
             if((recorrido .info % 2)!=0) {
                nuevo.info=recorrido.info;
                 System.out.println(nuevo);
                
            }
            recorrido=recorrido.sig; 
        }
    }
        
}

