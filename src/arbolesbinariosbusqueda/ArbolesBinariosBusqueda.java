/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesbinariosbusqueda;

/**
 *
 * @author Usuario
 */
public class ArbolesBinariosBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosArboles ma = new MetodosArboles();
        ma.inserta(10);
        ma.inserta(5);
        ma.inserta(2);
        ma.inserta(7); 
        ma.inserta(15);
        ma.imprimePreorden();
        ma.imprimeInorden();
        ma.imprimePosorden();
        System.out.println("La altura del arbol es: "+ma.retornarAltura());
        ma.imprimirNivel();
    }
    
}
