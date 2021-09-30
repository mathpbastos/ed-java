package br.com.pilhas;

public class No<T> {
	
	private T info;
    private No next;

    public No(){}

    public No(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "No{" +
                "info=" + info +
                '}';
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
