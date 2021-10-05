package method;

import java.util.ArrayList;

public class ClienteList {
	ArrayList<Cliente> listc = new ArrayList<Cliente>();
	public void cadastro(Cliente cliente) {
		listc.add(cliente);
		
	}
	public void remover(Cliente remove) {
		listc.removeIf((elemento) -> elemento.getNome().equalsIgnoreCase(remove.getNome()));
		System.out.println("Cliente removido com sucesso!");
	}
		public Cliente buscar(Cliente cliente) {
		for(Cliente elemento:this.listc) {
		if(elemento.getNome().equalsIgnoreCase(cliente.getNome()))	{
			return elemento;
		}
	}	
			return null;
}		

		public void editar(Cliente cliente) {
			int indice = listc.indexOf(this.buscar(cliente));
			if(indice != -1) {
				listc.set(indice, cliente);
			}
		
		
		}
		}