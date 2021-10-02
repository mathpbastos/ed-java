package br.com.listacircular;

public class ListaCircular<T> {

	private Node<T> head;
	private Node<T> tail;
	private int listSize;
	
	public ListaCircular() {
		this.head = null;
		this.tail = null;
		this.listSize = 0;
	}

	@Override
	public String toString() {
		String str = "";
		
		Node<T> aux = this.tail;
		for(int i=0; i<this.size(); i++) {
			str += "[No{Info=" + aux.getInfo() + "}] -->";
			aux = aux.getNext();
		}
		
		str += this.isEmpty() ? "[]" : "(HEAD)";
		
		return str;
	}

	public int size() {
		return this.listSize;
	}
	
	public boolean isEmpty() {
		return this.listSize == 0;
	}
	
	public void add(T info) {
		Node<T> newNode = new Node<>(info);
		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = this.head;
			this.head.setNext(this.tail);
		}
		else {
			newNode.setNext(this.tail);
			this.head.setNext(newNode);
			this.tail = newNode;
		}
		this.listSize++;
	}
	
	public void remove(int index) {
		if(index >= this.listSize)
			throw new IndexOutOfBoundsException("Tamanho da lista menor que o index passado.");
		Node<T> aux = this.tail;
		if(index == 0) {
			this.tail = this.tail.getNext();
			this.head.setNext(this.tail);
		}
		else if(index == 1) {
			this.tail.setNext(this.tail.getNext().getNext());
		}
		else {
			for(int i=0; i < (index-1); i++) {
				aux = aux.getNext();
			}
			aux.setNext(aux.getNext().getNext());
		}
		this.listSize--;
	}
	
	private Node<T> getNode(int index){
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("Lista Vazia");
		if(index == 0)
			return this.tail;
		
		Node<T> aux = this.tail;
		for(int i=0; i < index; i++) {
			aux = aux.getNext();
		}
		return aux;
	}
	
	public T get(int index) {
		return this.getNode(index).getInfo();
	}
	
}
