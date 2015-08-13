/**
 * 
 * @author bchangip
 *
 * @param <E>
 */
public class DoblementeEnlazada<E> implements listaEnlazada<E> {

	NodoDoble<E> nodo = new NodoDoble<E>(null);
	int counter = 0;
	NodoDoble<E> head = nodo;
	NodoDoble<E> tail = head;
	NodoDoble<E> finger;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return counter;
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		if(counter!=0){
			NodoDoble<E> temp = head;
			head = new NodoDoble<E>(value);
			head.setNext(temp);
			head.setPrev(null);
			temp.setPrev(head);
		} else {
			head = new NodoDoble<E>(value);
			tail = head;
			head.setNext(null);
			head.setPrev(null);
		}
		
		counter++;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		if(counter>1){
			NodoDoble<E> temp = head;
			head = temp.getNext();
			head.setPrev(null);
			counter--;
			return temp.getValue();
		} else if(counter==1){
			NodoDoble<E> temp = head;
			head = new NodoDoble<E>(null);
			tail = head;
			counter--;
			return temp.getValue();
		} else {
			return null;
		}
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		if(counter>1){
			NodoDoble<E> temp = tail;
			tail = tail.getPrev();
			tail.setNext(null);
			counter--;
			return temp.getValue();
		} else if(counter==1){
			NodoDoble<E> temp = head;
			head = new NodoDoble<E>(null);
			tail = head;
			counter--;
			return temp.getValue();
		} else {
			return null;
		}
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		NodoDoble<E> temp = new NodoDoble<E>(value);
		if(counter!=0){
			tail.setNext(temp);
			temp.setPrev(tail);
			tail = temp;
		} else {
			head = new NodoDoble<E>(value);
			tail = head;
			head.setNext(null);
			head.setPrev(null);
		}
		
		counter++;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		if(counter!=0){
			return head.getValue();
		} else {
			return null;
		}
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		if(counter!=0){
			return tail.getValue();
		} else {
			return null;
		}
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		boolean encontrado = false;
		finger = head;
		if(head.getValue()==value){encontrado=true;}
		while((encontrado!=true)&&(finger.getNext()!=null)){
			if(finger.getValue()==value){
				encontrado = true;
			}
			finger = finger.getNext();
		}
		
		return encontrado;
	}

	//Metodo que vacia la pila
			public void empty();
			//Metodo que revisa si la pila esta vacia
			public boolean isEmpty();
			//Metodo que hace push a un elemento a la pila
			public void push(E x){
				addFirst(E x)
			}
			//Metodo que hace pop a un elemento de la pila
			public E pop() throws Exception{
				return removeFirst();
			}
			//Metodo que devuelve el tamano de la pila
			public int size();
			//Metodo que devuelve el elemento del fondo de la pila
			public E peek() throws Exception;
}
