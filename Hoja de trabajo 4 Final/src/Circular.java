/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Olga Cobaquil
 */
public class Circular<E> extends AbstractLista<E> {
    protected Node<E> tail; 
    protected int count;
    
    public static final Circular circular = new Circular();

    /*
     * Constructor
     */
    public Circular()
    // pre: constructs a new circular list
    {
       tail = null;
       count = 0;
    }

    
    /*
     * Elemento nuevo a la lista (inicio)
     */
    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
       Node<E> temp = new Node<E>(value);
       if (tail == null) { // first value added
           tail = temp;
           tail.setNext(tail);
       } else { // element exists in list
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }

    /*
     * Elemento nuevo a la lista (final)
     */
    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
       // new entry:
       addFirst(value);
       tail = tail.next();
    }


    
    /*
     * devuelve y remueve el ultimo elemento de la lista
     */
    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
       Node<E> finger = tail;
       while (finger.next() != tail) {
           finger = finger.next();
       }
       // finger now points to second-to-last value
       Node<E> temp = tail;
       if (finger == tail)
       {
           tail = null;
       } else {
           finger.setNext(tail.next());
           tail = finger;
       }
       count--;
       return temp.value();
    }
    
     public int size(){
         return count; 
     }
    
}