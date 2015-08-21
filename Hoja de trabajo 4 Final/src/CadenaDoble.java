/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Bryan Chang
 */
public class CadenaDoble<E> extends AbstractLista<E> {
    public static final CadenaDoble encadenadaDoble = new CadenaDoble();
    protected int count;
    protected DoubleLinkedNode<E> head;
    protected DoubleLinkedNode<E> tail;
    
    public CadenaDoble(){
        head = null;
        tail = null;
        count = 0;
    }
    
    public void addFirst(E value)
        // pre: value is not null
        // post: adds element to head of list
    {
        // construct a new element, making it head
        head = new DoubleLinkedNode<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }


    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
        // construct new element
        tail = new DoubleLinkedNode<E>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }


    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
        
        DoubleLinkedNode<E> temp = tail;
        
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
             tail.setNext(null);
        }
        count--;
        return temp.value();
    }
    
    public int size(){
        return count; 
    }
}