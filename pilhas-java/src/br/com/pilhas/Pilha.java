package br.com.pilhas;

public class Pilha {
	private No reference;

    public Pilha(){
        this.reference = null;
    }

    public Pilha(No reference) {
        this.reference = reference;
    }

    public boolean isEmpty(){
        return this.reference == null;
    }

    @Override
    public String toString() {
        No aux = this.reference;
        String retorno = "Pilha:\n";
        while(true){

            if(aux != null){
                retorno += "[No{info = " + aux.getInfo() + "}]\n";
                aux = aux.getNext();
            }
            else {
                break;
            }
        }
        return retorno;
    }

    public No top(){

        return this.reference;

    }

    public void push(No no){
        No aux = this.reference;
        this.reference = no;
        no.setNext(aux);
    }


    public No pop(){
        if(this.isEmpty()){
            return null;
        } else {
            No aux = this.reference;
            this.reference = this.reference.getNext();
            return aux;
        }

    }
}
