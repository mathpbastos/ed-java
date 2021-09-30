package br.com.listaencadeada;

public class ListaEncadeada<T> {
	
	No<T> reference;

    public ListaEncadeada(){
        this.reference = null;
    }

    public boolean isEmpty(){
        return reference == null;
    }

    public int size(){
        int size = 0;
        No<T> aux = reference;

        while(true){
            if(aux != null){
                size++;
                if(aux.getNext() != null) {
                    aux = aux.getNext();
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }

        return size;
    }

    public void add(T info){
    	No<T> newNode = new No<>(info);
        if(this.isEmpty()){
            reference = newNode;
            return;
        }
        No<T> aux = reference;
        for(int i=0; i < (size() - 1); i++){
            aux = aux.getNext();
        }
        aux.setNext(newNode);
    }

    private No<T> getNode(int index){
    	No<T> aux = reference;
        No<T> returnNode = null;
        if(index >= size()){
            throw new IndexOutOfBoundsException("Index > List Size");
        }
        else {
            for (int i = 0; i <= index; i++) {
                returnNode = aux;
                aux = aux.getNext();
            }
        }
        return returnNode;
    }

    public T get(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Index > List Size");
        }
        else{
            return getNode(index).getInfo();
        }
    }

    public T remove(int index){
    	No<T> aux = this.getNode(index);
        if(index == 0){
            reference = aux.getNext();
            return aux.getInfo();
        }
        No<T> previousNode = getNode(index - 1);
        previousNode.setNext(aux.getNext());
        return aux.getInfo();
    }

    @Override
    public String toString() {
    	No<T> aux = reference;
        String str = "";
        for(int i=0; i<this.size(); i++){
            str += "[No{conteudo=" + aux.getInfo() +"}] ---> ";
            aux = aux.getNext();

        }
        str += "null";
        return str;
    }
	
}
