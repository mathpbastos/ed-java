package br.com.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
	
	private Node<T> root;

	public ArvoreBinaria() {
		this.root = null;
	}
	
	private Node<T> insert(Node<T> ref, Node<T> newNode){
		
		if(ref == null) {
			return newNode;
		}
		else if(newNode.getInfo().compareTo(ref.getInfo()) < 0) {
			ref.setLeft(insert(ref.getLeft(), newNode));
		}else {
			ref.setRight(insert(ref.getRight(), newNode));
		}
		return ref;		
	}
	
	public void insert(T info) {
		Node<T> newNode = new Node<>(info);
		this.root = insert(root, newNode);
	}
	
	public void inOrdem() {
		System.out.println("\nIn ordem:");
		inOrdem(this.root);
	}
	
	private void inOrdem(Node<T> ref) {
		if(ref != null) {
			inOrdem(ref.getLeft());
			System.out.print(ref.getInfo() + ", ");
			inOrdem(ref.getRight());
		}
	}
	
	public void preOrdem() {
		System.out.println("\nPós ordem:");
		preOrdem(this.root);
	}
	
	private void preOrdem(Node<T> ref) {
		if(ref != null) {
			System.out.print(ref.getInfo() + ", ");
			preOrdem(ref.getLeft());
			preOrdem(ref.getRight());
		}
	}
	
	public void posOrdem() {
		System.out.println("\nPós ordem:");
		posOrdem(this.root);
	}
	
	private void posOrdem(Node<T> ref) {
		if(ref != null) {
			posOrdem(ref.getLeft());
			posOrdem(ref.getRight());
			System.out.print(ref.getInfo() + ", ");
		}
	}
	
	public void remove(T info) {
		try {
			
			Node<T> ref = this.root;
			Node<T> parent = null;
			Node<T> filho = null;
			Node<T> temp = null;
			
			while(ref != null && !ref.getInfo().equals(info)) {
				parent = ref;
				if(info.compareTo(ref.getInfo()) < 0) {
					ref = ref.getLeft();
				}
				else {
					ref = ref.getRight();
				}
			}
			
			if(ref == null) {
				System.out.println("Informação não encontrada. -> TRY");
			}
			
			if(parent == null) {
				
				if(ref.getRight() == null) {
					this.root = ref.getLeft();
				}
				else if(ref.getLeft() == null) {
					this.root = ref.getRight();
				}
				else {
					for(temp = ref, filho = ref.getLeft(); 
							filho.getRight() != null;
							temp = filho, filho = filho.getLeft()) {
						
						if(filho != ref.getLeft()) {
							temp.setRight(filho.getLeft());
							filho.setLeft(root.getLeft());
						}
						
					}
					
					filho.setRight(root.getRight());
					root = filho;
					
				}
				
			}
			else if(ref.getRight() == null) {
				if(parent.getLeft() == ref) {
					parent.setLeft(ref.getLeft());
				}
				else {
					parent.setRight(ref.getLeft());
				}
			}
			else if(ref.getLeft() == null) {
				if(parent.getLeft() == ref) {
					parent.setLeft(ref.getRight());
				}
				else {
					parent.setRight(ref.getRight());
				}
			}
			else {
				for(temp = ref, filho = ref.getLeft();
						filho.getRight() != null;
						temp = filho, filho.getLeft()) {
					
					if(filho != ref.getLeft()) {
						temp.setRight(filho.getLeft());
						filho.setLeft(ref.getLeft());
					}
					
					filho.setRight(ref.getRight());
					if(parent.getLeft() == ref) {
						parent.setLeft(filho);
					}
					else {
						parent.setRight(filho);
					}
				}
			}
			
		}catch(NullPointerException e) {
			System.out.println("Informação não encontrada. -> CATCH");
		}
	}
	
}
