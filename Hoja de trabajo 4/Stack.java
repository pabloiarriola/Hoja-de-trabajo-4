/*
Universidad del Valle de Guatemala
Seccion: 10
Yasmin Valdez , 14079
Bryan Chan, 
*/


import java.util.Vector;

public class Stack<E> implements ADTStack<E>{
	
	protected Vector<E> pila;
	
	public E pop(){
		return pila.remove(size()-1);
	}
	
	public void push(E item){
		
		pila.add(item);
	}
	
	public Stack(){
		
		pila = new Vector<E>();
	}
	
	public E peek(){
		
		return pila.get(size()-1);
	}
	
	public int size(){
		
		return pila.size();
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		pila.clear();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pila.isEmpty();
	}
}