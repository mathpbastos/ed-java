package br.com.arvorebinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj>{

	Integer value;
	
	public Obj(Integer value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public int compareTo(Obj other) {
		int i = 0;
		
		if(this.value > other.value) {
			i = 1;
		}
		else if(this.value < other.value){
			i = -1;
		}
		
		return i;
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
}
