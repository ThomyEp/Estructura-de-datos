/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author alumnos
 */
public class MetodosCola {
    class Nodo{
        int dato;
        String info;
        Nodo sig;
    }
    private Nodo raiz, ultimo;
    
    public MetodosCola(){
        raiz=null;
        ultimo=null;
    }
    public boolean vacia(){
        if (raiz==null) {
            return true;
        }else{
           return false; 
        }   
    }
    
    public void encolarFifo(String pais,int x){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.dato=x;
        nuevo.info=pais;
        nuevo.sig=null;
        if (vacia()) {
            raiz=nuevo;
           ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            ultimo=nuevo;
        }
    }
    public void desencolar(){
        if(!vacia()){
            if(raiz==ultimo){
                raiz=null;
                ultimo=raiz;
            }else{
                raiz=raiz.sig;
            }
        }
    }
    public void imprimir(){
        if (!vacia()) {
            Nodo recorrido=raiz;
            while (recorrido!=null) {                
                System.out.print(recorrido.info+","+recorrido.dato+"->");
                recorrido=recorrido.sig;
            }
            System.out.println();
        }else{
            System.out.println("La cola esta vacia");
        }
    }
    public void mayorPoblacion(){
        int mayor=0;
        int posicion=1; 
        String a="sa";
         Nodo recorrido=raiz;
        if (!vacia()) {
            
            while (recorrido!=null ) {  
                if (recorrido.dato>mayor) {
                    mayor=recorrido.dato; //elemento mayor
                   posicion+=1;
                   a=recorrido.info;
                }
               recorrido=recorrido.sig;
            }
            System.out.println("");
         }
        
        System.out.println(a+" con su plbacion:"+mayor);
        }
}
