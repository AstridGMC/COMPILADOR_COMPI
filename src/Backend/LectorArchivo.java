/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author astridmc
 */
public class LectorArchivo {

    public String texto;
    public String nombre;
    public File doc;

    //<origen>|<destino>|<tiempo_vehiculo>|<tiempo_pie>|<consumo_gas>|<desgaste_persona>
    public String IdentificarDatos(String path) {

        texto = leerArchivo(path);
        return texto;
    }

    public String leerArchivo(String path) {
        String texto = "";
        try (FileReader entrada = new FileReader(path)) {
            int c = 0;
            while (c != -1) {
                c = entrada.read();
                char letra = (char) c;
                texto += letra;
            }
            return texto;
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo \\n");
            return "";
        }
    }

    public boolean GuardarTexto(File archivo, String contenido) {
        boolean respuesta = false;

        if (archivo != null) {
            FileOutputStream salida;
            try {
                nombre = archivo.getName();
                salida = new FileOutputStream(archivo);
                byte[] byteTxt = contenido.getBytes();
                salida.write(byteTxt);
                respuesta = true;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc = archivo;
        } else {
            javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
            jF1.addChoosableFileFilter(new FileNameExtensionFilter(".mlg", ".mlg"));
            String ruta = "";
            String extencion;
            try {
                if (jF1.showSaveDialog(null) == jF1.APPROVE_OPTION) {
                    extencion = jF1.getFileFilter().getDescription().replace("Todos los Archivos", "");
                    ruta = jF1.getSelectedFile().getAbsolutePath()+extencion;
                    File file = new File(ruta);
                    // Si el archivo no existe es creado
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);
                    bw.close();
                    doc = file;
                    nombre = file.getName();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return respuesta;
    }

    public boolean GuardarArchivo( String contenido) {
        javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
        jF1.addChoosableFileFilter(new FileNameExtensionFilter(".mlg", ".mlg"));
        String ruta = "";
        String extencion;
        try {
            
            if (jF1.showSaveDialog(null) == jF1.APPROVE_OPTION) {
                extencion = jF1.getFileFilter().getDescription().replace("Todos los Archivos", "");
                ruta = jF1.getSelectedFile().getAbsolutePath()+extencion;
                File file = new File(ruta);
                nombre = file.getName();
                System.out.println(nombre);
                // Si el archivo no existe es creado
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
                doc = file;
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean GuardarArchivosCreados( String contenido, int opcion) {
        String formato = EscogerFormato(opcion);
        javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
        jF1.addChoosableFileFilter(new FileNameExtensionFilter(formato, formato));
        String ruta = "";
        String extencion;
        try { 
            
            if (jF1.showSaveDialog(null) == jF1.APPROVE_OPTION) {
                extencion = jF1.getFileFilter().getDescription().replace("Todos los Archivos", "");
                ruta = jF1.getSelectedFile().getAbsolutePath()+extencion;
                File file = new File(ruta);
                nombre = file.getName();
                System.out.println(nombre);
                // Si el archivo no existe es creado
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
                doc = file;
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public String EscogerFormato(int paso){
        switch(paso){
            case 1:
                return "cpp";
            case 2:
                return "cpp";
            case 3:
                return "asm";
            default:
                return null;
        }
    }
            

}
