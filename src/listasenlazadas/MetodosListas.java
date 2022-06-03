/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

/**
 *
 * @author alumnos
 */
public class MetodosListas {
   class Nodo{
       double nota;
       String nombre;
       Nodo sig;     
   }
   private Nodo raiz;
   
    public MetodosListas(){
        raiz=null;
    }
    public void insertarInicio(double nota,String nom){
        Nodo nuevo=new Nodo();
        nuevo.nota=nota;
        nuevo.nombre=nom;
        nuevo.sig=raiz; 
        raiz=nuevo;
    }
    public void insertarFin(double nota,String nombre){
        Nodo nuevo=new Nodo();
        nuevo.nota=nota;
        nuevo.nombre=nombre;
        if (raiz==null) {
            raiz=nuevo;
        }
        else{
          Nodo recorrido=raiz;
            while (recorrido.sig!=null) { 
            recorrido=recorrido.sig;    
            }
            recorrido.sig=nuevo;
            nuevo.sig=null;
        }
    }
    public void insertarPosicion(int posicion,double nota,String nombre){
         Nodo nuevo=new Nodo();
        nuevo.nota=nota;
        nuevo.nombre=nombre;
        if(posicion==1){
            nuevo.sig=raiz; 
            raiz=nuevo;
        }
        else{
            if(posicion==cantidadNodos()+1) {
                 if (raiz==null) {
                    raiz=nuevo;
                    }
                else{
                    Nodo recorrido=raiz;
                        while (recorrido.sig!=null) { 
                        recorrido=recorrido.sig;    
                    }
                    recorrido.sig=nuevo;
                    nuevo.sig=null;
                }
            }
            else{
                Nodo recorrido= raiz;
                for (int i = 0; i < posicion-1; i++) {
                        recorrido=recorrido.sig;     
                    }
                        Nodo siguiente=recorrido.sig;
                        recorrido.sig=nuevo;
                        nuevo.sig=siguiente;  
            }
        }
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
    public void mostrarLista(){
        Nodo recorrido=raiz;
        System.out.println("Nombre\t Nota");
        while (recorrido!=null) {            
            System.out.print(recorrido.nombre+"   "+recorrido.nota+" ->");
            recorrido=recorrido.sig;
        }
        System.out.println("");
    }
}
