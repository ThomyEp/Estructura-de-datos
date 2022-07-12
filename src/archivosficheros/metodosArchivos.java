/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivosficheros;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class metodosArchivos {
    public Scanner sc = new Scanner(System.in);
    public void menu() { //Metodo menu
        int opcion;
        do { 
            System.out.println( "1.Crear archivo\n2.Visualizar contenido archivo\n3.Borrar contenido archivo\n4.Salir" );
            System.out.print( "Ingrese una opcion: " );
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println( "-----Crear Archivo-----" );
                    crearArchivo();
                    break;
                case 2:
                    System.out.println( "-----Mostrar Contenido Archivo-----" );
                    mostrarContenidoArchivo();
                    break;
                case 3:
                    System.out.println( "-----Borrar Contenido Archivo-----" );
                    borrarContenidoArchivo();
                    break;
                case 4:
                    System.out.println( "Gracias por usar el programa" );
                    break;    
                default:
                    System.out.println( "Opcion" +opcion+" no valida" );
                    throw new AssertionError();
            }
        } while (opcion != 4 );
    }//TODO -- menu
    public static void crearArchivo() { //Metodo para crear un archivo
        //String path = "C:\\Users\\alumnos\\Downloads\\Practica Nº 3- Estructura de Datos"; //donde se va a guardar el archivo
        FileWriter fw = null;
        try {
            //fw = new FileWriter( path+ " datos.txt" ); //creamos archivo
            fw = new FileWriter(  "datos.txt" ); 
            PrintWriter pw = new PrintWriter( fw ); //escribir 
            escribirArchivo( pw); // pedir datos para ingresar en el archivo  
            fw.close(); // cierra lectura , guarda los datos ingresados
        } catch (Exception ex) {
            System.out.println( "Ocurrio un error " +ex.getMessage() );
        }//TODO -- try/catch
    }//TODO -- crear archivo
    public static void escribirArchivo(PrintWriter pw)throws Exception { //metodo para escribir datos en el archivo
        Scanner sc = new Scanner(System.in);
        String valor;
        System.out.println( "Ingrese su cedula" );
        valor = sc.next();
        pw.println(valor);
        System.out.println( "Ingrese su nombre" );
        valor = sc.next();
        pw.println(valor);
        System.out.println( "Ingrese su apellido" );
        valor = sc.next();
        pw.println(valor);
        System.out.println( "Ingrese la ciudad donde vive" );
        valor = sc.next();
        pw.println(valor);
    }//TODO -- escribirArchivo
    public static void mostrarContenidoArchivo() { //Metodo para mostrar contenido del archivo
        FileReader fr = null;
        try {
            File archivo = new File( "datos.txt" );
            fr = new FileReader(archivo); // De que forma estoy abriendo el archivo el tipo para poder leer
            BufferedReader br = new BufferedReader(fr); // carga a la memoria
            leerArchivo(br); //lee el buffered
        } catch (Exception ex) {
            System.out.println( "Error al leer el archibo" +ex.getMessage() );
        }//TODO -- try/cath
    }//TODO -- mostrarContenidoArchivo
    public static void leerArchivo(BufferedReader br)throws Exception { //Metodo leer archivo en memoria
        //Linea por linea
        String linea;
        linea = br.readLine();  //leer linea por linea el buffered
        while (linea != null) { // EOF en otros entornos , la ultima linea no tenga datos            
            System.out.println( "" +linea );
            linea = br.readLine(); //leer linea por linea el buffered
        }//TODO -- while
    }//TODO -- leerArchivo
    public static void borrarContenidoArchivo() { //Metodo para borrar contenido del archivo
        try {
            PrintWriter pw = new PrintWriter( "datos.txt" );
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace(); // limpia el archivo
            System.out.println( "Error al borrar el archibo" +ex.getMessage() );
        }//TODO -- try/cath
    }//TODO -- borrarContenidoArchivo
}//TODO -- metodosArchivos
