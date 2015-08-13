/**
 * 
 * @author bchangip
 *
 * @param <E>
 */
public class Nodo<E>{
	protected E value;
	protected Nodo<E> next;
	/**
	 * @param value
	 * @param next
	 */
	public Nodo(E value) {
		super();
		this.value = value;
		this.next = null;
	}
	
	/**
	 * @param nodo
	 */
	public void setNext(Nodo<E> nodo){
		this.next = nodo;
	}
	
	public Nodo<E> getNext(){
		return next;
	}
	
	public E getValue(){
		return value;
	}
}
