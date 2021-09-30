package br.com.filas;

public class Fila {

    private No reference;

    public Fila() {
        this.reference = null;
    }

    public void enqueue(No no){
        no.setNext(reference);
        reference = no;
    }

    public No dequeue(){
        if(this.isEmpty()){
            return null;
        }
        else{
            No firstNo = reference;
            No aux = reference;
            while(true){
                if(firstNo.getNext() != null){
                    aux = firstNo;
                    firstNo = firstNo.getNext();
                }
                else{
                    aux.setNext(null);
                    break;
                }
            }
            return firstNo;
        }
    }

    public No first(){
        if(this.isEmpty()){
            return null;
        }
        else{
            No firstNo = reference;
            while(true){
                if(firstNo.getNext() != null){
                    firstNo = firstNo.getNext();
                }
                else{
                    break;
                }
            }
            return firstNo;
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        No aux = reference;

        if(reference != null){
            while(true){
                retorno += "[No{objeto="+ aux.getInfo() +"}]--->";
                if(aux.getNext() != null){
                    aux = aux.getNext();
                }else{
                    retorno += "null";
                    break;
                }
            }
        }else{
            retorno = "null";
        }

        return retorno;
    }

    public boolean isEmpty(){
        return reference == null;
    }

}