/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

import java.util.Scanner;



/**
 *
 * @author alumnos
 */
public class MetodosListas {
   private Scanner sc=new Scanner(System.in);
   class Nodo{
       double nota;
       String nombre;
       Nodo sig;     
   }
   private Nodo raiz;
   
    public MetodosListas(){
        raiz=null;
    }
    public boolean vaciaLista(){
        if(raiz==null){
            return true;           
        }else{
            return false;
        }
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
    public double menorElemento(){
        double menor=10;
        int posicion=1;
        Nodo recorrido=raiz;
        if (!vaciaLista()) {
            while (recorrido!=null) {  
                if (recorrido.nota<menor) {
                     menor=recorrido.nota; //elemento menor
                   posicion=posicion+1; //Posicion del elemento
                }
               recorrido=recorrido.sig;
            }
         } 
        return  menor;
    }
     public void borrarNodoMenor(){
         System.out.println("Borrar nodo con menor nota");
         Nodo recorrido=raiz;
         if (!vaciaLista()) {
             if((recorrido==recorrido)&& (menorElemento()==recorrido.nota)){
                 recorrido=null;
             }
             else{
                 if (menorElemento()==recorrido.nota) {
                     recorrido=recorrido.sig;
                 }
                 else{
                     Nodo anterior;
                     Nodo temp;
                     anterior=recorrido;
                     temp=recorrido.sig;
                     while (temp!=null && temp.nota!=menorElemento()) {                         
                         anterior=anterior.sig;
                         temp=temp.sig;
                     }
                     if (temp!=null) {
                         anterior.sig=temp.sig;
                         if (temp==recorrido) {
                             recorrido=anterior;
                         }
                     }
                 }
             }
         }
    }
     public void posicionEstudiante(String nombre){
         int posicion=1;
         double temp2=0;
        Nodo recorrido=raiz;
        if (!vaciaLista()) {
            Nodo temp=recorrido;
            while (recorrido!=null && temp.nombre!=nombre) {
                temp=temp.sig;
                temp2=temp.nota;
                posicion=posicion+1;
            }
            recorrido=recorrido.sig;
        }
         System.out.println(nombre+" esta en la posicion:"+posicion+" con nota:"+temp2);
         } 
    public void ordenrAlfabeticamente(){
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
                    if (actualI.nombre.compareTo(actualJ.nombre)>0) {
                        //Guardar actualI en aux
                        String aux1=actualI.nombre;
                        double aux2=actualI.nota;
                        actualI.nombre=aux1;
                        actualI.nota=aux2;
                        //Pasar acutalJ a acutalI
                        actualI.nombre=actualJ.nombre;
                        actualI.nota=actualJ.nota;
                        //Pasar auxiliar a actualJ
                        actualJ.nombre=aux1;
                        actualJ.nota=aux2;
                        }
                    actualJ=actualJ.sig;
                    }
                actualI=actualI.sig;
                }
            }
    } 
    public boolean buscarNota(double nota){
        Nodo recorrido=raiz;
        while(recorrido!=null){
            if (recorrido.nota==nota) {
                     return true;
        }
            recorrido=recorrido.sig;
    }
       return false;
    }
   public void modificarNota(double nota){
       Nodo recorrido1=new Nodo();
       recorrido1=raiz;
       if (buscarNota(nota)==false) {
           System.out.println("Nota:"+nota+" no existe");
       }
       else{
       while (recorrido1!=null) {           
           if (buscarNota(nota)==true && recorrido1.nota==nota) {
               System.out.print("Ingrese la nueva nota:");
               recorrido1.nota=sc.nextDouble();
           }
           recorrido1=recorrido1.sig;
           } 
       }
   }
   public void promedioNotas(){
       Nodo recorrido=raiz;
       double prom=0;
       double sumNotas=0;
       int cont=0;
       while (recorrido!=null) {           
           sumNotas=sumNotas+recorrido.nota;
           cont=cont+1;
           recorrido=recorrido.sig;
           prom=sumNotas/cont;      
       }
       System.out.println("El promedio de las"+cont+" notas es:"+prom);  
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