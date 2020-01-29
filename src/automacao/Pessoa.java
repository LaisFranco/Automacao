package automacao;

public abstract class Pessoa {
	
	private int id = 1;
	private String nome ;
	private int idade;
	private int ddd;
	private int telefone;
	private Endereco endereco = new Endereco();
	
	public Pessoa(String nome, int idade, int ddd, int telefone) {
		this.id = this.id++;
		this.nome = nome;
		this.idade = idade;
		this.ddd = ddd;
		this.telefone = telefone;
		
		
	}
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getDdd() {
		return ddd;
	}


	public void setDdd(int ddd) {
		this.ddd = ddd;
	}


	public String getNumeroDoTelefone() {
		return "("+ddd+") " + telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public int getId() {
		return id;
	}


	

}
