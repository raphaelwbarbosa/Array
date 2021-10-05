package method;



public class Gerente {
	
	private String nome;
	private String cpf;
	private String rg;
	private byte idade;
	
	
	
	
	public Gerente(String nome, String cpf, String rg, byte idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	
	}

	@Override
	public String toString() {
		return "Nome:" + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nIdade: " + idade;
	}
	
	
	
	}


