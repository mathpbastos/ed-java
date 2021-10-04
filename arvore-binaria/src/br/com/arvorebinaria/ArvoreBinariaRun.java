package br.com.arvorebinaria;

import br.com.arvorebinaria.model.Obj;

public class ArvoreBinariaRun {

	public static void main(String[] args) {
		
		ArvoreBinaria<Obj> myTree = new ArvoreBinaria<>();
		
		myTree.insert(new Obj(13));
		myTree.insert(new Obj(10));
		myTree.insert(new Obj(25));
		myTree.insert(new Obj(2));
		myTree.insert(new Obj(12));
		myTree.insert(new Obj(20));
		myTree.insert(new Obj(31));
		myTree.insert(new Obj(29));
		
		myTree.inOrdem();
		myTree.preOrdem();
		myTree.posOrdem();

	}

}
