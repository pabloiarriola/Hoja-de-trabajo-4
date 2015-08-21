/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pablo Arriola
 */
public class ListaFactory<E>{
    
     public Lista<E> getLista(int entry)
    {
     
        Lista<E> implementacion = null;
        
        // opcion 1 implementacion cadena simple
        if (entry == 1)
        {
            implementacion = CadenaSimple.encadenadaSimple;
        }
        // opcion 2, implementacion cadena doble
        else if(entry == 2)
        {
            implementacion = CadenaDoble.encadenadaDoble;
        }
        // opcion 3, cadena circular
        else if(entry == 3)
        {
            implementacion = Circular.circular;
        }
       
        
        // return de la implementacion que se quiere
        return implementacion;
    }
    
}
