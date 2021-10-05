package method;



public class Cliente {

	
	
	public Cliente(String nomeC, String email, byte idade) {
		super();
		this.nomeC = nomeC;
		this.email = email;
		this.idade = idade;
	}


	private String nomeC;
	private String email;
	private byte idade;
	
	
	public String getNome() {
		return nomeC;
	}


	public void setNome(String nome) {
		this.nomeC = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public byte getIdade() {
		return idade;
	}


	public void setIdade(byte idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Cliente: " + nomeC + ",\nEmail: " + email + ",\nIdade: " + idade;
	}



	
	
	}
	
	



