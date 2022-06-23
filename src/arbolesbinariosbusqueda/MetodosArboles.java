/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinariosbusqueda;

/**
 *
 * @author Usuario
 */
public class MetodosArboles {
   
   
    class Nodo{
        int info;
        Nodo izq,der;
    }
    Nodo raiz;
    int altura;
    int cantidad;
    public MetodosArboles(){
        raiz=null;
    }
    
    public void inserta (int x){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.info=x;
        nuevo.izq=null;
        nuevo.der=null;
        if (raiz==null) {
            raiz=nuevo;
        }else{
            Nodo anterior=null,recorrido;
            recorrido=raiz;
            while (recorrido!=null) {                
                anterior=recorrido;
                if (x<recorrido.info) {
                    recorrido=recorrido.izq;
                }else{
                    recorrido=recorrido.der;
                }
            }
            if (x<anterior.info) {
                anterior.izq=nuevo;
            }else{
                anterior.der=nuevo;
            }
        }
    }
    private void imprimirPreorden(Nodo recorrido){ //recursivo
        if (recorrido!=null) {
            System.out.print(recorrido.info+ " ");
            imprimirPreorden(recorrido.izq);
            imprimirPreorden(recorrido.der);
        } 
    }
    private void imprimirInorden(Nodo recorrido){ //recursivo
        if (recorrido!=null) {
            imprimirInorden(recorrido.izq);
            System.out.print(recorrido.info+ " ");
            imprimirInorden(recorrido.der);
        } 
    }
    private void imprimirPosorden(Nodo recorrido){ //recursivo
        if (recorrido!=null) {
            imprimirPosorden(recorrido.izq);
            imprimirPosorden(recorrido.der);
            System.out.print(recorrido.info+ " ");
        } 
    }
    //Imprimir por niveles
     String  niveles [];
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.izq, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.der, nivel + 1);
        }
    }
    private void imprimirNivel(Nodo tmp, int nivel){
        if(tmp !=null){
            imprimirNivel(tmp.izq,nivel+1);
            imprimirNivel(tmp.der,nivel+1);
            System.out.println(tmp.info + "("+nivel+") - ");       
        }
    }
 
    public void imprimirNivel(){
    imprimirNivel(raiz,1);
    System.out.println();
    }
    public void imprimePreorden(){
        System.out.println("-----Recorrido Preorden-----");
        imprimirPreorden(raiz);
        System.out.println();
    }
    public void imprimeInorden(){
        System.out.println("-----Recorrido Inorden-----");
        imprimirInorden(raiz);
        System.out.println();
    }
     public void imprimePosorden(){
        System.out.println("-----Recorrido Posorden-----");
        imprimirPosorden(raiz);
        System.out.println();
    }
    //Cantidad de nodos del arbol
     private void cantidadNodos(Nodo reco){
         if (reco!=null) {
             cantidad++;
             cantidadNodos(reco.der);
             cantidadNodos(reco.izq);
         }
     }
     public int cantidcaNodos(){
         cantidad=0;
         cantidadNodos(raiz);
         return cantidad;
     }
     private void cantidadHojas(Nodo reco){
         if (reco!=null) {
             if ((reco.izq==null) && (reco.der==null)) {
                 cantidad++;
             }
             cantidadHojas(reco.izq);
             cantidadHojas(reco.der);
         }
     }
     public int cantidadHojas(){
         cantidad=0;
         cantidadHojas(raiz);
         return cantidad;
     }
     public void mayorDato() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.der != null) {
                reco = reco.der;
            }
            System.out.println("Mayor valor del árbol es :" + reco.info);
        }
    }
    public void menorDato() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.izq != null) {
                reco = reco.izq;
            }
            System.out.println("Menor valor del árbol es :" + reco.info);
        }
    } 
    public void borrarMenor(){
        System.out.println("-----Borrar elemento menor-----");
        if (raiz!=null) {
            if (raiz.izq==null) {
                raiz=raiz.der;
            }else{
                Nodo anterior=raiz;
                Nodo recorrido=raiz.izq;
                while (recorrido.izq!= null) {                    
                    anterior=recorrido;
                    recorrido=recorrido.izq;
                }
                anterior.izq=recorrido.der;
            }
        }
    }
    public void borrarMayor(){
        System.out.println("-----Borar Mayor elemento-----");
        if (raiz!=null) {
            if (raiz.der==null) {
                raiz=raiz.izq;
            }else{
                Nodo anterior=raiz;
                Nodo recorrido=raiz.der;
                while (recorrido.der!= null) {                    
                    anterior=recorrido;
                    recorrido=recorrido.der;
                }
                anterior.der=recorrido.izq;
            }
        }
    }
}
