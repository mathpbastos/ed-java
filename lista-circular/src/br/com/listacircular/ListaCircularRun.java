package br.com.listacircular;

public class ListaCircularRun {

	public static void main(String[] args) {
		
		ListaCircular<String> myList = new ListaCircular<>();
		
		myList.add("c0");
		System.out.println(myList);
		
		myList.remove(0);
		System.out.println(myList);
		
		myList.add("c1");
		System.out.println(myList);
		
		myList.add("c2");
		myList.add("c3");
		System.out.println(myList);
		
	}

}
