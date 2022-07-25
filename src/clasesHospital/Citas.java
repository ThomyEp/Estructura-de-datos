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

public class Citas {
    private String cedula;
    private String nombres;
    private String direccion;
    private String telefono;
    private String sexo;
    private String edad;
    private String descripcion;
    private String especialidad;
    private String hora;
    private String fechaCita;
    private String departamento;

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

    public String getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getHora() {
        return hora;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getDepartamento() {
        return departamento;
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

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    public void guardarCitas() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Citas.txt",true); //add , añadir , no sea solo de escritura /true
            fw.write(getCedula());
            fw.write( ", " );
            fw.write(getNombres());
            fw.write( ", " );
            fw.write(getEdad());
            fw.write( ", " );
            fw.write(getDireccion());
            fw.write( ", " );
            fw.write(getTelefono());
            fw.write( ", " );
            fw.write(getSexo());
            fw.write( ", " );
            fw.write(getEspecialidad());
            fw.write( ", " );
            fw.write(getFechaCita());
            fw.write( ", " );
            fw.write(getDepartamento());
            fw.write( ", " );
            fw.write(getDescripcion());
            fw.write( ", " );
            fw.write(getHora());
            fw.write( "\n" );
            
            fw.close();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente la cita" +getNombres() );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar correctamente la cita" +getNombres()  +ex.getMessage()); //crea el archivo
        }
        
    }
    public void mostrarCitas(JTable tblCitas){
       String archivoPath = "Citas.txt";
       File archivo = new File(archivoPath);
       try {
           BufferedReader br = new BufferedReader(new FileReader(archivo));
           String linea = br.readLine().trim(); //trim elimina las comas
           DefaultTableModel mt = new DefaultTableModel();//modelo de la tabla como un objeto
           mt.addColumn( "Cedula" );
           mt.addColumn( "Nombres" );
           mt.addColumn( "Edad" );
           mt.addColumn( "Dirección" );
           mt.addColumn( "Teléfono" );
           mt.addColumn( "Sexo" );
           mt.addColumn( "Especialidad" );
           mt.addColumn( "Fecha cita" );
           mt.addColumn( "Departamento" );
           mt.addColumn( "Descripción" );
           mt.addColumn( "Hora" );
           tblCitas.setModel(mt); // agregamos el modelo
           Object [] camposTabla = br.lines().toArray(); //todo lo de la linea en un objeto tipo vector
           for (int i = 0; i < camposTabla.length; i++) {
               String fila = camposTabla[i].toString().trim();
               String [] datoFila = fila.split(", ");
               mt.addRow(datoFila);
               tblCitas.setModel(mt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al mostrar las citas del archivo" +ex.getMessage()); 
       }
    }
    
   public void seleccionarCita(JTable tblCitas) {
       try {
           int numeroFila = tblCitas.getSelectedRow(); //traer los datos de la tabla
           if (numeroFila >= 0) {
               setCedula(tblCitas.getValueAt(numeroFila, 0).toString());
               setNombres(tblCitas.getValueAt(numeroFila, 1).toString());
               setEdad(tblCitas.getValueAt(numeroFila, 2).toString());
               setDireccion(tblCitas.getValueAt(numeroFila, 3).toString());
               setTelefono(tblCitas.getValueAt(numeroFila, 4).toString());
               setSexo(tblCitas.getValueAt(numeroFila, 5).toString());
               setEspecialidad(tblCitas.getValueAt(numeroFila, 6).toString());
               setFechaCita(tblCitas.getValueAt(numeroFila, 7).toString());
               setDepartamento(tblCitas.getValueAt(numeroFila, 8).toString());
               setDescripcion(tblCitas.getValueAt(numeroFila, 9).toString());
               setHora(tblCitas.getValueAt(numeroFila, 10).toString());
           }
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al selecionar la cita" +ex.getMessage());
       }
   }//TODO -- seleccionarCita 
   public void eliminarCita(JTable tblCitas, JTextField cedula) {
       //Eliminar la fila de la tabla
       DefaultTableModel mt = (DefaultTableModel)tblCitas.getModel();//defino tabla a trabajar con su modelo
       for (int i = 0; i < mt.getRowCount(); i++) {
           if (((String)mt.getValueAt(i, 0)).equals(cedula.getText()) ) {
               mt.removeRow(i); //removemos
               break;
           }
       }
       //limpiar el archivo
       try {
           PrintWriter pw = new PrintWriter( "Citas.txt" );
           pw.print( "" ); //limpia todo el archivo
           pw.close();
       } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, "Error al limpar el archivo citas" +ex.getMessage());
       }
       //Insertar nuevos registros en el archivo
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File( "Citas.txt" )))){
           StringJoiner joiner = new StringJoiner( ", " ); //Definir caracter con el cual voy a concatenar
           for (int col = 0; col < tblCitas.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                joiner.add(tblCitas.getColumnName(col));
           }//TODO -- for
           for (int filas = 0; filas < tblCitas.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
               joiner = new StringJoiner( ", " );
               for (int columnas = 0; columnas < tblCitas.getColumnCount(); columnas++) {
                   Object obj = tblCitas.getValueAt(filas, columnas);
                   String valor = obj == null ? "null" : obj.toString();
                   joiner.add(valor);
               }//TODO -- for columnas
               bw.write(joiner.toString());
               bw.newLine();
           }//TODO -- for filas
           JOptionPane.showMessageDialog( null, "Se elimino el registro correctamente");
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error en el archivo citas" +ex.getMessage());
       }
   }//TODO -- eliminarCita
   public void editarCitas(JTable tblCitas) {
        //limpiar el archivo
        if (celdaEditable(tblCitas) != false ) {
            try {
                PrintWriter pw = new PrintWriter("Citas.txt");
                pw.print(""); //limpia todo el archivo
                pw.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al limpar el archivo citas" + ex.getMessage());
            }
            //Insertar nuevos registros en el archivo
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Pacientes.txt")))) {
                StringJoiner joiner = new StringJoiner(", "); //Definir caracter con el cual voy a concatenar
                for (int col = 0; col < tblCitas.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                    joiner.add(tblCitas.getColumnName(col));
                }//TODO -- for
                bw.write(joiner.toString());
                bw.newLine();
                for (int filas = 0; filas < tblCitas.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
                    joiner = new StringJoiner(", ");
                    for (int columnas = 0; columnas < tblCitas.getColumnCount(); columnas++) {
                        Object obj = tblCitas.getValueAt(filas, columnas);
                        String valor = obj == null ? "null" : obj.toString();
                        joiner.add(valor);
                    }//TODO -- for columnas
                    bw.write(joiner.toString());
                    bw.newLine();
                }//TODO -- for filas
                JOptionPane.showMessageDialog(null, "Se edito el registro correctamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al editar el archivo citas" + ex.getMessage());
            }
       }
      
   }
   public boolean celdaEditable(JTable tblCitas) {
       if (tblCitas.getColumnCount() == 0 && tblCitas.getColumnCount() == 1) {
           return false;
       }else {
           return true;
       }
   }

}
