/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pablo Arriola
 */
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/*
 * En esta clase se da la opcion de abrir el archivo de texto
 * que se desea analizar
 */
public class AbrirJFileChooser extends JFrame {
    private JButton botonFile;
    private String path;

    
    /*
     * Constructor
     */
    public AbrirJFileChooser() {
    }
   
    /*
     * Para seleccionar el archivo a abrir
     */
    public void Abrir() {
        JFileChooser elegir = new JFileChooser("datos.txt");
        int opcion = elegir.showOpenDialog(botonFile);

        /* para obtener el path del archivo
        */
        if (opcion == JFileChooser.APPROVE_OPTION) {
            path = elegir.getSelectedFile().getPath(); 
            String nombrthArchivo = elegir.getSelectedFile().getPath(); 
            String nombre = elegir.getSelectedFile().getName(); //Nombre del archivo
            String path = elegir.getSelectedFile().getPath();
            System.out.println("El nombre del archivo es: "+ nombre);
            System.out.println("Path: "+ path);
        }
        
    }

    /*
     *  return del archivo
     */
    public String getPath() {
        return path;
    }
}