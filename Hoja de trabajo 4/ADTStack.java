/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carné: 14012
Diego Sosa. Carné: 14735
Julio González. Carné: 14096
30/07/2015
Hoja de Trabajo 2
*/

public interface ADTStack<E> {
	//Metodo que vacia la pila
	public void empty();
	//Metodo que revisa si la pila esta vacia
	public boolean isEmpty();
	//Metodo que hace push a un elemento a la pila
	public void push(E x) ;
	//Metodo que hace pop a un elemento de la pila
	public E pop() throws Exception;
	//Metodo que devuelve el tamano de la pila
	public int size();
	//Metodo que devuelve el elemento del fondo de la pila
	public E peek() throws Exception;	
}