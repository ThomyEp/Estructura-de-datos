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

public class Horarios {
    private String nombres;
    private String departamento;
    private String entrada;
    private String salida;
    private String extras;

    public String getNombres() {
        return nombres;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }

    public String getExtras() {
        return extras;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
    
    public void crearArchivoHorarios() { //metodo para crear un archivo para medicamentos
        try {
        File objetoArchivo = new File( "Horarios.txt" ); //instancia de la clase File
            if (objetoArchivo.createNewFile()) {
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " creado" ); //crea el archivo
            }else{
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " ya existe" ); //el archivo ya existe
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, " Error al crear el archivo Horarios " );//error al crear archivo
        }
    
    }//TODO --crearArchivoMEdicamentos
    public void guardarHorarios() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Horarios.txt",true); //add , añadir , no sea solo de escritura /true
            fw.write(getNombres());
            fw.write( ", " );
            fw.write(getDepartamento());
            fw.write( ", " );
            fw.write(getEntrada());
            fw.write( ", " );
            fw.write(getSalida());
            fw.write( ", " );
            fw.write(getExtras());
            fw.write( "\n" );
            fw.close();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente el Horario" +getDepartamento() );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar correctamente el Horario" +getDepartamento()  +ex.getMessage()); //crea el archivo
        }
        
    }
    public void mostrarHorarios(JTable tblHorarios){
       String archivoPath = "Horarios.txt";
       File archivo = new File(archivoPath);
       try {
           BufferedReader br = new BufferedReader(new FileReader(archivo));
           String linea = br.readLine().trim(); //trim elimina las comas
           DefaultTableModel mt = new DefaultTableModel();//modelo de la tabla como un objeto
           mt.addColumn( "Nombres" );
           mt.addColumn( "Departamento" );
           mt.addColumn( "Hora entrada" );
           mt.addColumn( "Hora salida" );
           mt.addColumn( "Horas extras" );
           tblHorarios.setModel(mt); // agregamos el modelo
           Object [] camposTabla = br.lines().toArray(); //todo lo de la linea en un objeto tipo vector
           for (int i = 0; i < camposTabla.length; i++) {
               String fila = camposTabla[i].toString().trim();
               String [] datoFila = fila.split(", ");
               mt.addRow(datoFila);
               tblHorarios.setModel(mt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al mostrar los Horarios del archivo" +ex.getMessage()); 
       }
    }
    
   public void seleccionarHorarios(JTable tblHorarios) {
       try {
           int numeroFila = tblHorarios.getSelectedRow(); //traer los datos de la tabla
           if (numeroFila >= 0) {
               setNombres(tblHorarios.getValueAt(numeroFila, 0).toString());
               setDepartamento(tblHorarios.getValueAt(numeroFila, 1).toString());
               setEntrada(tblHorarios.getValueAt(numeroFila, 2).toString());
               setSalida(tblHorarios.getValueAt(numeroFila, 3).toString());
               setExtras(tblHorarios.getValueAt(numeroFila, 4).toString());
          
           }
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al selecionar el Horario" +ex.getMessage());
       }
   }//TODO -- seleccionarHorarios 
   public void eliminarHorarios(JTable tblHorarios, JTextField nombres) {
       //Eliminar la fila de la tabla
       DefaultTableModel mt = (DefaultTableModel)tblHorarios.getModel();//defino tabla a trabajar con su modelo
       for (int i = 0; i < mt.getRowCount(); i++) {
           if (((String)mt.getValueAt(i, 0)).equals(nombres.getText()) ) {
               mt.removeRow(i); //removemos
               break;
           }
       }
       //limpiar el archivo
       try {
           PrintWriter pw = new PrintWriter( "Horarios.txt" );
           pw.print( "" ); //limpia todo el archivo
           pw.close();
       } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, "Error al limpar el archivo Horarios" +ex.getMessage());
       }
       //Insertar nuevos registros en el archivo
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File( "Horarios.txt" )))){
           StringJoiner joiner = new StringJoiner( ", " ); //Definir caracter con el cual voy a concatenar
           for (int col = 0; col < tblHorarios.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                joiner.add(tblHorarios.getColumnName(col));
           }//TODO -- for
           for (int filas = 0; filas < tblHorarios.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
               joiner = new StringJoiner( ", " );
               for (int columnas = 0; columnas < tblHorarios.getColumnCount(); columnas++) {
                   Object obj = tblHorarios.getValueAt(filas, columnas);
                   String valor = obj == null ? "null" : obj.toString();
                   joiner.add(valor);
               }//TODO -- for columnas
               bw.write(joiner.toString());
               bw.newLine();
           }//TODO -- for filas
           JOptionPane.showMessageDialog( null, "Se elimino el registro correctamente");
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error en el archivo Horarios" +ex.getMessage());
       }
   }//TODO -- eliminarHorarios
   public void editarHorarios(JTable tblHorarios) {
        //limpiar el archivo
        if (celdaEditable(tblHorarios) != false ) {
            try {
                PrintWriter pw = new PrintWriter("Horarios.txt");
                pw.print(""); //limpia todo el archivo
                pw.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al limpar el archivo Horarios" + ex.getMessage());
            }
            //Insertar nuevos registros en el archivo
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Horarios.txt")))) {
                StringJoiner joiner = new StringJoiner(", "); //Definir caracter con el cual voy a concatenar
                for (int col = 0; col < tblHorarios.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                    joiner.add(tblHorarios.getColumnName(col));
                }//TODO -- for
                bw.write(joiner.toString());
                bw.newLine();
                for (int filas = 0; filas < tblHorarios.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
                    joiner = new StringJoiner(", ");
                    for (int columnas = 0; columnas < tblHorarios.getColumnCount(); columnas++) {
                        Object obj = tblHorarios.getValueAt(filas, columnas);
                        String valor = obj == null ? "null" : obj.toString();
                        joiner.add(valor);
                    }//TODO -- for columnas
                    bw.write(joiner.toString());
                    bw.newLine();
                }//TODO -- for filas
                JOptionPane.showMessageDialog(null, "Se edito el registro correctamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al editar el archivo Horarios" + ex.getMessage());
            }
       }
      
   }
   public boolean celdaEditable(JTable tblHorarios) {
       if (tblHorarios.getColumnCount() == 0 && tblHorarios.getColumnCount() == 1) {
           return false;
       }else {
           return true;
       }
   }

}
