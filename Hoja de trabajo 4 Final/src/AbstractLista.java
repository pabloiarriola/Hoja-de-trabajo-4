/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sanchez Tortola
 */
public abstract class AbstractLista<E> implements Lista<E> {
    
    /*
     * Constructor de la clase
     */
    public AbstractLista()
   // post: does nothing
   {
   }

    
   /*
    * Lista vacia o no
    */
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
  
}
