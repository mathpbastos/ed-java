package br.com.duplamenteencadeada;

public class ListaDupEncadeada<T> {
	
	private NoDuplo<T> first;
    private NoDuplo<T> last;
    private int listSize;

    public ListaDupEncadeada() {
        this.first = null;
        this.last = null;
        this.listSize = 0;
    }

    @Override
	public String toString() {
		String str = "";
		
		NoDuplo<T> aux = first;
		for(int i=0; i<size(); i++) {
			str += "[No{Info=" + aux.getInfo()+"}]->\n";
			aux = aux.getNext();
		}
		str += "null";
		return str;
	}

	public int size(){
        return this.listSize;
    }
    
    public void add(T node) {
    	NoDuplo<T> newNode = new NoDuplo<>(node);
    	newNode.setNext(null);
    	newNode.setPrevious(last);
    	if(first == null) {
    		first = newNode;
    	}
    	if(last != null) {
    		last.setNext(newNode);
    	}
    	last = newNode;
    	listSize++;
    }
    
    public void add(int index, T node) {
    	NoDuplo<T> aux = getNode(index);
    	NoDuplo<T> newNode = new NoDuplo<>(node);
    	newNode.setNext(aux);
    	if(newNode.getNext() != null) {
    		newNode.setPrevious(aux.getPrevious());
    		newNode.getNext().setPrevious(newNode);
    	}
    	else {
    		newNode.setPrevious(last);
    		last = newNode;
    	}
    	
    	if(index == 0) {
    		first = newNode;
    	}
    	else {
    		newNode.getPrevious().setNext(newNode);
    		
    	}
    	
    	listSize++;
    	
    }
    
    public void remove(int index) {
    	if(index == 0) {
    		first = first.getNext();
    		if(first != null) {
    			first.setPrevious(null);
    		}
    	}
    	else {
    		NoDuplo<T> aux = getNode(index);
    		aux.getPrevious().setNext(aux.getNext());
    		if(aux != this.last) {
    			aux.getNext().setPrevious(aux.getPrevious());
    		}
    		else {
    			
    		}
    	}
    	
    	listSize--;
    }

    private NoDuplo<T> getNode(int index){
        NoDuplo<T> aux = first;

        for(int i=0; (i < index) && (aux != null); i++){
            aux = aux.getNext();
        }

        return aux;
    }

    public T get(int index){
        return this.getNode(index).getInfo();
    }
	
}
