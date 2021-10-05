package method;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Gerente paulo = new Gerente("paulo", "234234", "7674646", (byte) 34);
		GerentList gerentes = new GerentList();
		ClienteList clientes = new ClienteList();
		Cliente raphael = new Cliente("rapha"+"2323323",  "54543",  (byte) 32);
		
		ContList contas = new ContList();
		
		gerentes.cadastrogerente(paulo);
		Gerente buscar = gerentes.buscar(paulo);
		if(buscar == null) {
			System.out.println("Gerente não localizado");
		}else {
			System.out.printf("%s Localizado!!!\n", buscar.getNome());
		}
		Cliente buscarC = clientes.buscar(raphael);
		if(buscarC == null) {
			System.out.println("Cliente não localizado");
		}else {
			System.out.printf("%s Localizado!!!\n",buscar.getNome());
					
		}	
		
		
	}	
		
}



		

