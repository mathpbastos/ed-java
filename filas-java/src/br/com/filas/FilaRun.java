package br.com.filas;

public class FilaRun {

	public static void main(String[] args) {
		Fila fila = new Fila();

        fila.enqueue(new No("primeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("quarto"));
        fila.enqueue(new No("quinto"));

        System.out.println("Fila Inicial:\n" + fila);

        System.out.println("\nRemovido --> " + fila.dequeue());

        System.out.println("\nFila Pós-remoção:\n" + fila);

        System.out.println("\nPrimeiro da Fila --> " + fila.first());
	}

}
