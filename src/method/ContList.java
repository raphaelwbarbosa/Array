package method;

import java.util.ArrayList;

public class ContList {

ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void cadastroC(Conta conta) {
		contas.add(conta);
		
	}
	public void remover(Conta remove) {
		contas.removeIf((elemento) -> elemento.getNome().equalsIgnoreCase(remove.getNome()));
		System.out.println("Conta removida com sucesso!");
	}
		public Conta buscarconta(Conta conta) {
		for(Conta elemento: this.contas) {
		if(elemento.getNome().equalsIgnoreCase(conta.getNome()))	{
			return elemento;
		}
	}	
		return null;
}		

		public void editar(Conta conta) {
			int indice = contas.indexOf(this.buscarconta(conta));
			if(indice != -1) {
				contas.set(indice, conta);
			}
		
		
		}		
}
