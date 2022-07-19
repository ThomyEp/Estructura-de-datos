/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesHospital;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnos
 */
public class Medicamentos {
    private String codigoMedicamento;
    private String nombreMedicamento;
    private String fechaElaboracion;
    private String fechaCaducidad;
    private String stockMedicamento;

    public String getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getStockMedicamento() {
        return stockMedicamento;
    }

    public void setCodigoMedicamento(String codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setStockMedicamento(String stockMedicamento) {
        this.stockMedicamento = stockMedicamento;
    }
    public void crearArchivoMedicamentos() { //metodo para crear un archivo para medicamentos
        try {
        File objetoArchivo = new File( "Medicamentos.txt" ); //instancia de la clase File
            if (objetoArchivo.createNewFile()) {
                //JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " creado" ); //crea el archivo
            }else{
                //JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " ya existe" ); //el archivo ya existe
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, " Error al crear el archivo " );//error al crear archivo
        }
    
    }//TODO --crearArchivoMEdicamentos
    public void guardarMedicamento() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Medicamentos.txt",true); //add , añadir , no sea solo de escritura /true
            fw.write(getCodigoMedicamento());
            fw.write( ", " );
            fw.write(getNombreMedicamento());
            fw.write( ", " );
            fw.write(getFechaElaboracion());
            fw.write( ", " );
            fw.write(getFechaCaducidad());
            fw.write( ", " );
            fw.write(getStockMedicamento());
            fw.write( "\n" );
            fw.close();
            JOptionPane.showMessageDialog( null, "Se guardo correctamente el medicamentento" +getNombreMedicamento() );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, "Error al guardar correctamente el medicamentento" +getNombreMedicamento()  +ex.getMessage()); //crea el archivo
        }
        
    }
   public void mostrarMedicamentos(JTable tblMedicamentos) {
       String archivoPath = "Medicamentos.txt";
       File archivo = new File(archivoPath);
       try {
           BufferedReader br = new BufferedReader(new FileReader(archivo));
           String linea = br.readLine().trim(); //trim elimina las comas
           DefaultTableModel mt = new DefaultTableModel();//modelo de la tabla como un objeto
           mt.addColumn( "Codigo" );
           mt.addColumn( "Nombre medicamento" );
           mt.addColumn( "Fecha Elaboracion" );
           mt.addColumn( "Fecha Caducidad" );
           mt.addColumn( "Stock" );
           tblMedicamentos.setModel(mt); // agregamos el modelo
           Object [] camposTabla = br.lines().toArray(); //todo lo de la linea en un objeto tipo vector
           for (int i = 0; i < camposTabla.length; i++) {
               String fila = camposTabla[i].toString().trim();
               String [] datoFila = fila.split(", ");
               mt.addRow(datoFila);
               tblMedicamentos.setModel(mt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al mostrar los medicamentos del archivo" +ex.getMessage()); 
       }
   }
}
