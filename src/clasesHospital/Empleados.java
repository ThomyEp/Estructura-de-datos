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

public class Empleados {
    private String cedula;
    private String nombres;
    private String direccion;
    private String telefono;
    private String edad;
    private String jornada;
    private String ingreso;
    private String salida;
    private String area;
    private String puesto;

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

    public String getEdad() {
        return edad;
    }

    public String getJornada() {
        return jornada;
    }

    public String getIngreso() {
        return ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public String getArea() {
        return area;
    }

    public String getPuesto() {
        return puesto;
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

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void crearArchivoEmpleados() { //metodo para crear un archivo para medicamentos
        try {
        File objetoArchivo = new File( "Empleados.txt" ); //instancia de la clase File
            if (objetoArchivo.createNewFile()) {
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " creado" ); //crea el archivo
            }else{
               // JOptionPane.showMessageDialog( null, "Archivo" +objetoArchivo.getName()+ " ya existe" ); //el archivo ya existe
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, " Error al crear el archivo Empleados " );//error al crear archivo
        }
    
    }//TODO --crearArchivoMEdicamentos
    public void guardarEmpleados() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Empleados.txt",true); //add , añadir , no sea solo de escritura /true
            fw.write(getCedula());
            fw.write( ", " );
            fw.write(getNombres());
            fw.write( ", " );
            fw.write(getDireccion());
            fw.write( ", " );
            fw.write(getTelefono());
            fw.write( ", " );
            fw.write(getEdad());
            fw.write( ", " );
            fw.write(getJornada());
            fw.write( ", " );
            fw.write(getIngreso());
            fw.write( ", " );
            fw.write(getSalida());
            fw.write( ", " );
            fw.write(getArea());
            fw.write( ", " );
            fw.write(getPuesto());
            fw.write( "\n" );
            fw.close();
            JOptionPane.showMessageDialog(null, "Se guardo correctamente el empleado" +getNombres() );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar correctamente el empleado" +getNombres()  +ex.getMessage()); //crea el archivo
        }
        
    }
    public void mostrarEmpleados(JTable tblEmpleados){
       String archivoPath = "Empleados.txt";
       File archivo = new File(archivoPath);
       try {
           BufferedReader br = new BufferedReader(new FileReader(archivo));
           String linea = br.readLine().trim(); //trim elimina las comas
           DefaultTableModel mt = new DefaultTableModel();//modelo de la tabla como un objeto
           mt.addColumn( "Cedula" );
           mt.addColumn( "Nombres" );
           mt.addColumn( "Dirección" );
           mt.addColumn( "Teléfono" );
           mt.addColumn( "Edad" );
           mt.addColumn( "Jornada" );
           mt.addColumn( "Hora ingreso" );
           mt.addColumn( "Hora salida" );
           mt.addColumn( "Area" );
           mt.addColumn( "Puesto" );
           tblEmpleados.setModel(mt); // agregamos el modelo
           Object [] camposTabla = br.lines().toArray(); //todo lo de la linea en un objeto tipo vector
           for (int i = 0; i < camposTabla.length; i++) {
               String fila = camposTabla[i].toString().trim();
               String [] datoFila = fila.split(", ");
               mt.addRow(datoFila);
               tblEmpleados.setModel(mt);
           }
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al mostrar los empleados del archivo" +ex.getMessage()); 
       }
    }
    
   public void seleccionarEmpleados(JTable tblEmpleados) {
       try {
           int numeroFila = tblEmpleados.getSelectedRow(); //traer los datos de la tabla
           if (numeroFila >= 0) {
               setCedula(tblEmpleados.getValueAt(numeroFila, 0).toString());
               setNombres(tblEmpleados.getValueAt(numeroFila, 1).toString());
               setDireccion(tblEmpleados.getValueAt(numeroFila, 2).toString());
               setTelefono(tblEmpleados.getValueAt(numeroFila, 3).toString());
               setEdad(tblEmpleados.getValueAt(numeroFila, 4).toString());
               setJornada(tblEmpleados.getValueAt(numeroFila, 5).toString());
               setIngreso(tblEmpleados.getValueAt(numeroFila, 6).toString());
               setSalida(tblEmpleados.getValueAt(numeroFila, 7).toString());
               setArea(tblEmpleados.getValueAt(numeroFila, 8).toString());
               setPuesto(tblEmpleados.getValueAt(numeroFila, 9).toString());
           }
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error al selecionar el empleado" +ex.getMessage());
       }
   }//TODO -- seleccionarEmpleados 
   public void eliminarEmpleados(JTable tblEmpleados, JTextField cedula) {
       //Eliminar la fila de la tabla
       DefaultTableModel mt = (DefaultTableModel)tblEmpleados.getModel();//defino tabla a trabajar con su modelo
       for (int i = 0; i < mt.getRowCount(); i++) {
           if (((String)mt.getValueAt(i, 0)).equals(cedula.getText()) ) {
               mt.removeRow(i); //removemos
               break;
           }
       }
       //limpiar el archivo
       try {
           PrintWriter pw = new PrintWriter( "Empleados.txt" );
           pw.print( "" ); //limpia todo el archivo
           pw.close();
       } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, "Error al limpar el archivo Empleados" +ex.getMessage());
       }
       //Insertar nuevos registros en el archivo
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File( "Empleados.txt" )))){
           StringJoiner joiner = new StringJoiner( ", " ); //Definir caracter con el cual voy a concatenar
           for (int col = 0; col < tblEmpleados.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                joiner.add(tblEmpleados.getColumnName(col));
           }//TODO -- for
           for (int filas = 0; filas < tblEmpleados.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
               joiner = new StringJoiner( ", " );
               for (int columnas = 0; columnas < tblEmpleados.getColumnCount(); columnas++) {
                   Object obj = tblEmpleados.getValueAt(filas, columnas);
                   String valor = obj == null ? "null" : obj.toString();
                   joiner.add(valor);
               }//TODO -- for columnas
               bw.write(joiner.toString());
               bw.newLine();
           }//TODO -- for filas
           JOptionPane.showMessageDialog( null, "Se elimino el registro correctamente");
       } catch (Exception ex) {
           JOptionPane.showMessageDialog( null, "Error en el archivo Empleados" +ex.getMessage());
       }
   }//TODO -- eliminarEmpleados
   public void editarEmpleado(JTable tblEmpleados) {
        //limpiar el archivo
        if (celdaEditable(tblEmpleados) != false ) {
            try {
                PrintWriter pw = new PrintWriter("Empleados.txt");
                pw.print(""); //limpia todo el archivo
                pw.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al limpar el archivo Empleados" + ex.getMessage());
            }
            //Insertar nuevos registros en el archivo
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Empleados.txt")))) {
                StringJoiner joiner = new StringJoiner(", "); //Definir caracter con el cual voy a concatenar
                for (int col = 0; col < tblEmpleados.getColumnCount(); col++) { // cuantas columnas tiene mi tabla
                    joiner.add(tblEmpleados.getColumnName(col));
                }//TODO -- for
                bw.write(joiner.toString());
                bw.newLine();
                for (int filas = 0; filas < tblEmpleados.getRowCount(); filas++) { //cuenta las filas que tiene im tabla
                    joiner = new StringJoiner(", ");
                    for (int columnas = 0; columnas < tblEmpleados.getColumnCount(); columnas++) {
                        Object obj = tblEmpleados.getValueAt(filas, columnas);
                        String valor = obj == null ? "null" : obj.toString();
                        joiner.add(valor);
                    }//TODO -- for columnas
                    bw.write(joiner.toString());
                    bw.newLine();
                }//TODO -- for filas
                JOptionPane.showMessageDialog(null, "Se edito el registro correctamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al editar el archivo Empleados" + ex.getMessage());
            }
       }
      
   }
   public boolean celdaEditable(JTable tblEmpleados) {
       if (tblEmpleados.getColumnCount() == 0 && tblEmpleados.getColumnCount() == 1) {
           return false;
       }else {
           return true;
       }
   }

}
