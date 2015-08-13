/**
 * 
 * @author bchangip
 *
 * @param <E>
 */
public class SimplementeEnlazada<E> implements ADTStack<E>{
	
	Nodo<E> nodo = new Nodo<E>(null);
	int counter = 0;
	Nodo<E> head = nodo;
	Nodo<E> finger;
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return counter;
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		if(counter!=0){
			Nodo<E> temp = head;
			head = new Nodo<E>(value);
			head.setNext(temp);
		} else {
			head = new Nodo<E>(value);
		}
		
		counter++;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		if(counter>1){
			Nodo<E> temp = head;
			head = head.getNext();
			counter--;
			return temp.getValue();
		} else if(counter==1){
			Nodo<E> temp = head;
			head = new Nodo<E>(null);
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
			Nodo<E> temp = null;
			finger = head;
			while(finger.getNext()!=null){
				temp = finger;
				finger = finger.getNext();
			}
			
			temp.setNext(null);
			counter--;
			return finger.getValue();
		} else if(counter==1){
			Nodo<E> temp = head;
			head = new Nodo<E>(null);
			counter--;
			return temp.getValue();
		} else {
			return null;
		}
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		Nodo<E> temp = new Nodo<E>(value);
		finger = head;
		if(counter!=0){
			while(finger.getNext()!=null){
				finger = finger.getNext();
			}
			
			finger.setNext(temp);
		} else {
			head = new Nodo<E>(value);
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
			finger = head;
			while(finger.getNext()!=null){
				finger = finger.getNext();
			}
			
			return finger.getValue();
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