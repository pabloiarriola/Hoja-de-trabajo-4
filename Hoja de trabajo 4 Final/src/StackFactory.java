/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pablo Arriola
 */
public class StackFactory<E> {
    
    public Pila<String> getStack(int entry)
    {
       
        Pila<String> implementacion = null;
        
       // implementacion stackList
        if (entry == 1)
        {
            implementacion =  StackArrayList.stackarraylist;
        }
        // implementacion stackVector
        else if(entry == 2)
        {
            implementacion = StackVector.stackvector;
        }
        // implementacion cadena simple
        else if(entry == 3)
        {
            implementacion = StackList.stacklist;
        }
        return implementacion;
    }
    
}
