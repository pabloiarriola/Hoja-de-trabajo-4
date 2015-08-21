/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pablo Arriola
 */
import java.util.Vector;

public class StackVector<E> extends AbstractPila<E>{
    
    
    public static final StackVector stackvector = new StackVector();
    
    
    protected Vector<E> data;

    public StackVector() 
    // post: constructs a new, empty stack
    {
        this.data = new Vector<E>();
    }
    
    @Override
    public void push(E item) 
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.addElement(item);
    }

    @Override
    public E pop() 
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size() -1);
    }

    @Override
    public E peek() 
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }
    @Override
    public int size() 
    // post: returns the number of elements in the stack
    {
        return data.size();
    }
    /*BORRAR*/
    public void clear()
    {
        data.clear();
    }
}
