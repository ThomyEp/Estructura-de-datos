/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesHospital;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringJoiner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnos
 */

public class Ventas {
    private String medicamento;
    private String cantidad;
    private String subtotal;
    private String remitente;
    private String codigo;
    private String tipo;
    private String fechaVenta;
    private String total;
  

    public String getMedicamento() {
        return medicamento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public String getTotal() {
        return total;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
    public void crearArchivoVentas() { //metodo para crear un archivo para medicamentos
        try {
        File objetoArchivo = new File( "Ventas.txt" ); //instancia de la clase File
            if (objetoArchivo.createNewFile()) {
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " creado" ); //crea el archivo
            }else{
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " ya existe" ); //el archivo ya existe
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, " Error al crear el archivo Ventas " );//error al crear archivo
        }
    
    }//TODO --crearArchivoMEdicamentos
    public void guardarVentas() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Ventas.txt",true); //add , añadir , no sea solo de escritura /true
            fw.write(getMedicamento());
            fw.write( ", " );
            fw.write(getCantidad());
            fw.write( ", " );
            fw.write(getRemitente());
            fw.write( ", " );
            fw.write(getCodigo());
            fw.write( ", " );
            fw.write(getTipo());
            fw.write( ", " );
            fw.write(getFechaVenta());
            fw.write( ", " );
            fw.write(getTotal());
            fw.write( ", " );
            fw.write(getSubtotal());
            fw.write( "\n" );
            fw.close();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente la venta" +getCantidad() );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar correctamente la venta" +getCantidad()  +ex.getMessage()); //crea el archivo
        }
        
    }
    public void mostrarVentas(JTable tblVentas){
       String archivoPath = "Ventas.txt";
       File archivo = new File(archivoPath);
       try {
           BufferedReader br = new BufferedReader(new FileReader(archivo));
           String linea = br.readLine().trim(); //trim elimina las comas
           DefaultTableModel mt = new DefaultTableModel();//modelo de la tabla como un objeto
           mt.addColumn( "Medicamento" );
           mt.addColumn( "Cantidad" );
           mt.addColumn( "Subtotal" );
           mt.addColumn( "Remitente" );
           mt.addColumn( "Codigo medicamento" );
           mt.addColumn( "Tipo medicamento" );
           mt.addColumn( "Fecha venta" );
           mt.addColumn( "Total" );
           tblVentas.setModel(mt); // agregamos el modelo
           Object [] camposTabla = br.lines().toArray(); //todo lo de la linea en un objeto tipo vector
           for (int i = 0; i < camposTabla.length; i++) {
               String fila = camposTabla[i].toString().trim();
               String [] datoFila = fila.split(", ");
               mt.addRow(datoFila);
               tblVentas.setModel(mt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al mostrar las ventas del archivo" +ex.getMessage()); 
       }
    }
    
   public void seleccionarVentas(JTable tblVentas) {
       try {
           int numeroFila = tblVentas.getSelectedRow(); //traer los datos de la tabla
           if (numeroFila >= 0) {
               setMedicamento(tblVentas.getValueAt(numeroFila, 0).toString());
               setCantidad(tblVentas.getValueAt(numeroFila, 1).toString());
               setSubtotal(tblVentas.getValueAt(numeroFila, 2).toString());
               setRemitente(tblVentas.getValueAt(numeroFila, 3).toString());
               setCodigo(tblVentas.getValueAt(numeroFila, 4).toString());
               setTipo(tblVentas.getValueAt(numeroFila, 5).toString());
               setFechaVenta(tblVentas.getValueAt(numeroFila, 6).toString());
               setTotal(tblVentas.getValueAt(numeroFila, 7).toString());
              
           }
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al selecionar venta" +ex.getMessage());
       }
   }//TODO -- seleccionarVentas 
   public void eliminarVentas(JTable tblVentas, JTextField medicamento) {
       //Eliminar la fila de la tabla
       DefaultTableModel mt = (DefaultTableModel)tblVentas.getModel();//defino tabla a trabajar con su modelo
       for (int i = 0; i < mt.getRowCount(); i++) {
           if (((String)mt.getValueAt(i, 0)).equals(medicamento.getText()) ) {
               mt.removeRow(i); //removemos
               break;
           }
       }
       //limpiar el archivo
       try {
           PrintWriter pw = new PrintWriter( "Ventas.txt" );
           pw.print( "" ); //limpia todo el archivo
           pw.close();
       } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, "Error al limpar el archivo Ventas" +ex.getMessage());
       }
       //Insertar nuevos registros en el archivo
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File( "Ventas.txt" )))){
           StringJoiner joiner = new StringJoiner( ", " ); //Definir caracter con el cual voy a concatenar
           for (int col = 0; col < tblVentas.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                joiner.add(tblVentas.getColumnName(col));
           }//TODO -- for
           for (int filas = 0; filas < tblVentas.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
               joiner = new StringJoiner( ", " );
               for (int columnas = 0; columnas < tblVentas.getColumnCount(); columnas++) {
                   Object obj = tblVentas.getValueAt(filas, columnas);
                   String valor = obj == null ? "null" : obj.toString();
                   joiner.add(valor);
               }//TODO -- for columnas
               bw.write(joiner.toString());
               bw.newLine();
           }//TODO -- for filas
           JOptionPane.showMessageDialog( null, "Se elimino el registro correctamente");
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error en el archivo Ventas" +ex.getMessage());
       }
   }//TODO -- eliminarVentas
   public void editarVenta(JTable tblVentas) {
        //limpiar el archivo
        if (celdaEditable(tblVentas) != false ) {
            try {
                PrintWriter pw = new PrintWriter("Ventas.txt");
                pw.print(""); //limpia todo el archivo
                pw.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al limpar el archivo Ventas" + ex.getMessage());
            }
            //Insertar nuevos registros en el archivo
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Ventas.txt")))) {
                StringJoiner joiner = new StringJoiner(", "); //Definir caracter con el cual voy a concatenar
                for (int col = 0; col < tblVentas.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                    joiner.add(tblVentas.getColumnName(col));
                }//TODO -- for
                bw.write(joiner.toString());
                bw.newLine();
                for (int filas = 0; filas < tblVentas.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
                    joiner = new StringJoiner(", ");
                    for (int columnas = 0; columnas < tblVentas.getColumnCount(); columnas++) {
                        Object obj = tblVentas.getValueAt(filas, columnas);
                        String valor = obj == null ? "null" : obj.toString();
                        joiner.add(valor);
                    }//TODO -- for columnas
                    bw.write(joiner.toString());
                    bw.newLine();
                }//TODO -- for filas
                JOptionPane.showMessageDialog(null, "Se edito el registro correctamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al editar el archivo Ventas" + ex.getMessage());
            }
       }
      
   }
   public boolean celdaEditable(JTable tblVentas) {
       if (tblVentas.getColumnCount() == 0 && tblVentas.getColumnCount() == 1) {
           return false;
       }else {
           return true;
       }
   }

}
