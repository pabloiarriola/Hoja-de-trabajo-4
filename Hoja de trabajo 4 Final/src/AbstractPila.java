/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pablo Arriola
 */
import java.util.ArrayList;



public abstract class AbstractPila<E> implements Pila<E>{
   
    public AbstractPila()
    {
        
    } 
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
            return size() == 0;
    }
}
