package br.com.duplamenteencadeada;

public class ListaDupEncadeadaRun {

	public static void main(String[] args) {
		
		ListaDupEncadeada<String> myList = new ListaDupEncadeada<>();
		
		myList.add("Node 1");
		myList.add("Node 2");
		myList.add("Node 3");
		myList.add("Node 4");
		myList.add("Node 5");
		myList.add("Node 6");
		myList.add("Node 7");
		myList.add("Node 8");
		myList.add("Node 9");
		myList.add("Node 0");
		
		System.out.println(myList);
		
		myList.remove(8);
		myList.add(8, "Node 99");
		
		System.out.println("\n" + myList);
		
	}

}
