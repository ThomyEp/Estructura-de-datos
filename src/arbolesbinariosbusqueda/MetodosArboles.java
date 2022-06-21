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
    public void imprimirNivel() {
        System.out.println("-------Datos por niveles-------");
        niveles = new String[altura + 1];

        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length-1; i++) {
            System.out.println(niveles[i] + "\tEn nivel: " + i);
        }
    }

    private void imprimirNivel(Nodo pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.info + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.der, nivel2 + 1);
            imprimirNivel(pivote.izq, nivel2 + 1);
        }
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
 
}
