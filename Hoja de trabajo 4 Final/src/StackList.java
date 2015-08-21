/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Bryan Chang
 */
import javax.swing.JOptionPane;


public class StackList<E> extends AbstractPila<E>{
    
    // patron singleton
    public static final StackList stacklist = new StackList();
    protected Lista<E> implementacion; 
    /*
     * Constructor de la clase
    */
    private StackList()
    {
        // factory
        ListaFactory<E> lFactory = new ListaFactory<E>();

      
        boolean incorrecta = true;
        
                
        // implementacion array o vector
        while(incorrecta == true) 
        {
           
            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1.Simplemente encadenada 2.Doblemente encadenada  3.Circular"));

        
            switch (opcion1)
            {
              
                case 1: 
                case 2: 
                case 3: 
                {
                    incorrecta = false;
                    implementacion = lFactory.getLista(opcion1);
                    break;
                }
               
                default:
                {
                    incorrecta = true;
                    break;
                }
            }
        }
    }

   
    @Override
    public void push(E item) {
       implementacion.addLast(item);
    }

    @Override
    public E pop() {
        return implementacion.removeLast();
    }

   

    @Override
    public int size() {
        return implementacion.size();
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException(" "); //To change body of generated methods, choose Tools | Templates.
    }

    
    
 
    
    
}
