package br.com.duplamenteencadeada;

public class NoDuplo<T> {
	
	private T info;
    private NoDuplo<T> next;
    private NoDuplo<T> previous;

    public NoDuplo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoDuplo<T> getNext() {
        return next;
    }

    public void setNext(NoDuplo<T> next) {
        this.next = next;
    }

    public NoDuplo<T> getPrevious() {
        return previous;
    }

    public void setPrevious(NoDuplo<T> previous) {
        this.previous = previous;
    }
	
}
