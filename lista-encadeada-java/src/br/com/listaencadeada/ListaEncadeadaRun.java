package br.com.listaencadeada;

public class ListaEncadeadaRun {

	public static void main(String[] args) {
		
		ListaEncadeada<String> myList = new ListaEncadeada<>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        System.out.println("0 -> " + myList.get(0));
        System.out.println("1 -> " + myList.get(1));
        System.out.println("2 -> " + myList.get(2));

        System.out.println(myList);

        System.out.println(myList.remove(3));

        System.out.println(myList);

	}

}
