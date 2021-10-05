package method;

import java.util.ArrayList;

public class GerentList {
	ArrayList<Gerente> list = new ArrayList<Gerente>();

	public void cadastrogerente(Gerente gerente) {
		list.add(gerente);

	}

	public void remover(Gerente gerente) {
		list.removeIf((elemento) -> elemento.getNome().equalsIgnoreCase(gerente.getNome()));
		String pessoa = "Gerente removido com sucesso!";
	}

	public Gerente buscar(Gerente gerente) {
		for (Gerente elemento : this.list) {
			if (elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
				return elemento;
			}
		}
		return null;
	}

	public void editar(Gerente gerente) {
		int indice = list.indexOf(this.buscar(gerente));
		if (indice != -1) {
			list.set(indice, gerente);
		}
	}
}