/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Pablo Arriola
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class HojaTrabajo4 {
    // implementacion a utilizar
    
    private static  Pila<String> implementacion; 
     
     public static void main(String[] args) {
         
   
        //llama al factory
        StackFactory<String> sFactory = new StackFactory<String>();

       
        
        // opcion correcta o no
        boolean error = true;
        
        
        // eleccion de la implementacion a utilizar, (ingreso del usuario)
        while(error == true) 
        {
            /*El usuario escoge la implentacion que desea utilizar*/
            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1. ARRAYLIST  2. STACKVECTOR  3.LISTA"));

        
            switch (opcion1)
            {
                case 1: // eleccion array
                case 2: // eleccion vector
                case 3: // eleccion lista
                {
                    error = false;
                    implementacion = sFactory.getStack(opcion1);
                    break;
                }
                
                
                // eleccion de algo invalido
                default:
                {
                    error = true;
                    break;
                }
            }
        }
        leerArchivo(implementacion);
    }
    
    
/*
 * Leer archivo de texto
 */
    public static void leerArchivo(Pila<String> imp){
    
         Pila<String> miStack = imp;
      
        String micadena = null;
        String linea=null;
        
        
        FileReader fr;
        BufferedReader br;
                
        
        try
        {
            /*Sobjeto para abrir el archivo*/
            AbrirJFileChooser abrirArchivo = new AbrirJFileChooser();
            abrirArchivo.Abrir(); // seleccin del archivo
            String ruta =abrirArchivo.getPath(); //ruta del archivo
           
            
            // ñectura del archivo
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            
            while ((micadena = br.readLine())!=null)
            {
                linea = micadena;
                System.out.println(micadena);
            }
          
        }
        
        // si no se puede leer el archivo
        catch(Exception e)
        {
            System.out.println("No se encontró el archivo datos.txt");
            System.exit(0);
        }
        System.out.println(linea);
        StringTokenizer tokens = new StringTokenizer(linea," ");
        
        //revision de los caracreres del archivo
        while (tokens.hasMoreTokens())
        {
            String token;
            token = tokens.nextToken();
            
            System.out.println("El caracter actual es: " + token);
           
            if ((token.equals("+")) ||(token.equals("-"))|| (token.equals("*"))||(token.equals("/")))
            {
                  int operando1 = 0;
                  int operando2 = 0;
                  int suma;
                  
                  operando1 = Integer.parseInt(miStack.pop());
                  operando2 = Integer.parseInt(miStack.pop());
                  
                  if (token.equals("+"))
                  {
                      suma = operando1 + operando2;
                      miStack.push(String.valueOf(suma));
                  }
                  else if (token.equals("-"))
                  {
                      suma = operando1 - operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
                  else if (token.equals("*"))
                  {
                      suma = operando1 * operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
                  else
                  {
                      suma = operando1 / operando2;
                      miStack.push(String.valueOf(suma));
 
                  }
            }
            else 
            {
                miStack.push(token);
            }
        }
        
        String nuevo = miStack.pop();
        System.out.println(nuevo);
        JOptionPane.showMessageDialog(null, "El resultado de las operaciones fue:\n" + nuevo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
  
}
  
    
