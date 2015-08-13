/**
 * 
 * @author bchangip
 *
 * @param <E>
 */
public class NodoDoble<E>{
	protected E value;
	protected NodoDoble<E> next;
	protected NodoDoble<E> prev;
	/**
	 * @param value
	 * @param next
	 */
	public NodoDoble(E value) {
		super();
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	/**
	 * @param nodo
	 */
	public void setNext(NodoDoble<E> nodo){
		this.next = nodo;
	}
	
	public NodoDoble<E> getNext(){
		return next;
	}
	
	public void setPrev(NodoDoble<E> nodo){
		this.prev = nodo;
	}
	
	public NodoDoble<E> getPrev(){
		return prev;
	}
	
	public E getValue(){
		return value;
	}
}
