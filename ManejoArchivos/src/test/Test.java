package test;

import manejoArchivo.ManejoArchivos;

public class Test {
    
    public static void main(String[] args) {
        String nombreArchivo = "Asignaturas.txt";
        String contenido = "Desarrollo en Aplicaciones Multiplataforma";
        String contenido2 = "Ingles";
        
        //Crea el archivo
        ManejoArchivos.CrearArchivo(nombreArchivo);
        
        //Escribe la primera linea, sobreescribe las linea existente
        //ManejoArchivos.EscribirArchivo(nombreArchivo, contenido);
        //ManejoArchivos.EscribirArchivo(nombreArchivo, contenido2);
        
        //Escribe varias lineas a la vez
        ManejoArchivos.agregarArchivo(nombreArchivo, contenido);
        ManejoArchivos.agregarArchivo(nombreArchivo, contenido2);
        
        //leer el archivo
        ManejoArchivos.leerArchivo(nombreArchivo);
        
    }
    
}
