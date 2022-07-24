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

public class Pacientes {
    private String cedula;
    private String nombres;
    private String direccion;
    private String telefono;
    private String sexo;

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void crearArchivoPacientes() { //metodo para crear un archivo para medicamentos
        try {
        File objetoArchivo = new File( "Pacientes.txt" ); //instancia de la clase File
            if (objetoArchivo.createNewFile()) {
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " creado" ); //crea el archivo
            }else{
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " ya existe" ); //el archivo ya existe
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, " Error al crear el archivo " );//error al crear archivo
        }
    
    }//TODO --crearArchivoMEdicamentos
    public void guardarPacientes() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Pacientes.txt",true); //add , añadir , no sea solo de escritura /true
            fw.write(getCedula());
            fw.write( ", " );
            fw.write(getNombres());
            fw.write( ", " );
            fw.write(getDireccion());
            fw.write( ", " );
            fw.write(getTelefono());
            fw.write( ", " );
            fw.write(getSexo());
            fw.write( "\n" );
            fw.close();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente el Paciente" +getNombres() );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar correctamente el Paciente" +getNombres()  +ex.getMessage()); //crea el archivo
        }
        
    }
    public void mostrarPacientes(JTable tblPacientes){
       String archivoPath = "Pacientes.txt";
       File archivo = new File(archivoPath);
       try {
           BufferedReader br = new BufferedReader(new FileReader(archivo));
           String linea = br.readLine().trim(); //trim elimina las comas
           DefaultTableModel mt = new DefaultTableModel();//modelo de la tabla como un objeto
           mt.addColumn( "Cedula" );
           mt.addColumn( "Nombres" );
           mt.addColumn( "Dirección" );
           mt.addColumn( "Teléfono" );
           mt.addColumn( "Sexo" );
           tblPacientes.setModel(mt); // agregamos el modelo
           Object [] camposTabla = br.lines().toArray(); //todo lo de la linea en un objeto tipo vector
           for (int i = 0; i < camposTabla.length; i++) {
               String fila = camposTabla[i].toString().trim();
               String [] datoFila = fila.split(", ");
               mt.addRow(datoFila);
               tblPacientes.setModel(mt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al mostrar los Pacientes del archivo" +ex.getMessage()); 
       }
    }
    
   public void seleccionarPacientes(JTable tblPacientes) {
       try {
           int numeroFila = tblPacientes.getSelectedRow(); //traer los datos de la tabla
           if (numeroFila >= 0) {
               setCedula(tblPacientes.getValueAt(numeroFila, 0).toString());
               setNombres(tblPacientes.getValueAt(numeroFila, 1).toString());
               setDireccion(tblPacientes.getValueAt(numeroFila, 2).toString());
               setTelefono(tblPacientes.getValueAt(numeroFila, 3).toString());
               setSexo(tblPacientes.getValueAt(numeroFila, 4).toString());
           }
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al selecionar el Paciente" +ex.getMessage());
       }
   }//TODO -- seleccionarPacientes 
   public void eliminarPaciente(JTable tblPacientes, JTextField cedula) {
       //Eliminar la fila de la tabla
       DefaultTableModel mt = (DefaultTableModel)tblPacientes.getModel();//defino tabla a trabajar con su modelo
       for (int i = 0; i < mt.getRowCount(); i++) {
           if (((String)mt.getValueAt(i, 0)).equals(cedula.getText()) ) {
               mt.removeRow(i); //removemos
               break;
           }
       }
       //limpiar el archivo
       try {
           PrintWriter pw = new PrintWriter( "Pacientes.txt" );
           pw.print( "" ); //limpia todo el archivo
           pw.close();
       } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, "Error al limpar el archivo Pacientes" +ex.getMessage());
       }
       //Insertar nuevos registros en el archivo
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File( "Pacientes.txt" )))){
           StringJoiner joiner = new StringJoiner( ", " ); //Definir caracter con el cual voy a concatenar
           for (int col = 0; col < tblPacientes.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                joiner.add(tblPacientes.getColumnName(col));
           }//TODO -- for
           for (int filas = 0; filas < tblPacientes.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
               joiner = new StringJoiner( ", " );
               for (int columnas = 0; columnas < tblPacientes.getColumnCount(); columnas++) {
                   Object obj = tblPacientes.getValueAt(filas, columnas);
                   String valor = obj == null ? "null" : obj.toString();
                   joiner.add(valor);
               }//TODO -- for columnas
               bw.write(joiner.toString());
               bw.newLine();
           }//TODO -- for filas
           JOptionPane.showMessageDialog( null, "Se elimino el registro correctamente");
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error en el archivo Pacientes" +ex.getMessage());
       }
   }//TODO -- eliminarPaciente
   public void editarPaciente(JTable tblPacientes) {
        //limpiar el archivo
        if (celdaEditable(tblPacientes) != false ) {
            try {
                PrintWriter pw = new PrintWriter("Pacientes.txt");
                pw.print(""); //limpia todo el archivo
                pw.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al limpar el archivo Pacientes" + ex.getMessage());
            }
            //Insertar nuevos registros en el archivo
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Pacientes.txt")))) {
                StringJoiner joiner = new StringJoiner(", "); //Definir caracter con el cual voy a concatenar
                for (int col = 0; col < tblPacientes.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                    joiner.add(tblPacientes.getColumnName(col));
                }//TODO -- for
                bw.write(joiner.toString());
                bw.newLine();
                for (int filas = 0; filas < tblPacientes.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
                    joiner = new StringJoiner(", ");
                    for (int columnas = 0; columnas < tblPacientes.getColumnCount(); columnas++) {
                        Object obj = tblPacientes.getValueAt(filas, columnas);
                        String valor = obj == null ? "null" : obj.toString();
                        joiner.add(valor);
                    }//TODO -- for columnas
                    bw.write(joiner.toString());
                    bw.newLine();
                }//TODO -- for filas
                JOptionPane.showMessageDialog(null, "Se edito el registro correctamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al editar el archivo Pacientes" + ex.getMessage());
            }
       }
      
   }
   public boolean celdaEditable(JTable tblPacientes) {
       if (tblPacientes.getColumnCount() == 0 && tblPacientes.getColumnCount() == 1) {
           return false;
       }else {
           return true;
       }
   }

}
