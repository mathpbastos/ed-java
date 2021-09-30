package br.com.listaencadeada;

public class No<T> {
	
	private T info;
    private No next;

    public No() {
        this.next = null;
    }

    public No(T info) {
        this.info = info;
        this.next = null;
    }

    public No(T info, No next) {
        this.info = info;
        this.next = next;
    }

    @Override
    public String toString() {
        return "No{" +
                "info=" + info +'}';
    }

    public String printList(){
        String str = "No{" +
                "info=" + info +'}';

        if(next != null){
            str += " -> " + next.toString();
        }
        else{
            str += "-> null";
        }
        return str;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
	
}
