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
    public boolean buscarElemento(int elemento){
        Nodo recorrido=raiz;
        while(recorrido!=null){
            if (recorrido.info==elemento) {
                     return true;
        }
            recorrido=recorrido.sig;
    }
       return false;
    }
    //mayor elemento y su posicion
    public void mayorElemento(){
        int mayor=0;
        int posicion=1;
        Nodo recorrido=raiz;
        if (!vaciaLista()) {
            while (recorrido!=null) {  
                if (recorrido.info>mayor) {
                     mayor=recorrido.info;//elemento mayor
                   posicion=posicion+1; //Posicion del elemento
                }
               recorrido=recorrido.sig;
            }
             System.out.println("el mayor elemento es:"+mayor+" y su posicion es: "+(posicion-1));
         } 
        else{
            System.out.println("No existe elementos en la lista");
        }
    }
    public void ordenarLista(){
        Nodo recorrido=raiz;
        Nodo recorrido1=raiz;
        if (!vaciaLista()) {
            for (int i=1;i<recorrido.info;i++){
                if(recorrido.info>0){ //forma ascendente >0
                    int tmp;
                    tmp=recorrido.info;
                    recorrido.info=recorrido.info-1;
                    recorrido.info=tmp;  
                }
            }
        }
        else{
            System.out.println("No existe elementos en la lista");
            }
    }
    //Borrar elemento de la lista
    public void borrarElemento(int posicion){
        if (posicion<=cantidadNodos()) {
            if (posicion==1) {
                raiz=raiz.sig;
            }
            else{
                Nodo recorrido=raiz;
                for (int i = 1; i <=posicion-2 ; i++) {
                    recorrido=recorrido.sig;
                }
                Nodo proximo=recorrido.sig;
                recorrido.sig=proximo.sig;
            }
        }
        else{
            System.out.println("La posicion"+posicion+"no existe");
        }
    }
    public void intercambioElemento(int pos1,int pos2){
        if (pos1<=cantidadNodos()&& pos2<=cantidadNodos()) {
            Nodo recorrido1=raiz;
            for (int i = 1; i < pos1; i++) {
                recorrido1=recorrido1.sig;
            }
            Nodo recorrido2=raiz;
             for (int i = 1; i < pos2; i++) {
                recorrido2=recorrido2.sig;
            }
             int temp=recorrido1.info;
             recorrido1.info=recorrido2.info;
             recorrido2.info=temp;
        }
      public void ordenarLista(){
      Nodo recorrido=raiz;
      Nodo actualI;
      Nodo actualJ;
        if (recorrido==null) {
            System.out.println("Lista vacia");  
        }
        else{
            actualI=recorrido;
            while (actualI.sig!=null) {                
                actualJ=actualI;
                while (actualJ!=null) {                    
                    if (actualI.info>actualJ.info) {
                        //Guardar actualI en aux
                        int aux1=actualI.info;
                        actualI.info=aux1;
                        //Pasar acutalJ a acutalI
                        actualI.info=actualJ.info;
                        //Pasar auxiliar a actualJ
                        actualJ.info=aux1;
                        }
                    actualJ=actualJ.sig;
                    }
                actualI=actualI.sig;
                }
            }
    
    }  
     
    
}
