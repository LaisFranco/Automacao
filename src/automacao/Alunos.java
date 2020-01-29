package automacao;

public class Alunos extends Pessoa {

	public Alunos (String nome, int idade, int ddd, int telefone) {
		super(nome,idade,ddd,telefone);
		
	}
	private int matricula = super.getId();
	private double nota;
	
	
	
	public String nome;
	private int idade;

	
	
	
	
	
	
	
	
	
	
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Nome do Aluno: " + this.nome + " Idade: " +  this.idade ;
	}
	
	
	
}
