package manejoArchivo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    
    public static void CrearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado con exito el archivo\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void EscribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        
        try {         
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Modificado el contenido con exito\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            System.out.println("El archivo no existe");
        }
    }
    
    public static void agregarArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        
        try {   
            
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Modificado el contenido con exito\n");
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace(System.out);
            System.out.println("El archivo no existe");
            
        } catch (IOException e){
            
            e.printStackTrace(System.out);
            System.out.println("Error en la Entrada/Salida");
            
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            
            var lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("Lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
                System.out.println("Error al leerlo");
            } catch (IOException e) {
            e.printStackTrace(System.out);
            System.out.println("No se ha encontrado el archivo");
        }
    }
    
}
