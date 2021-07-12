package Entities;

public class Exercicio1Lista5Java {
	//SUPER CLASSE ANIMAL	
	public String nome;
	public int idade;
	//public boolean som;
	//CONSTRUCTOR
	public Exercicio1Lista5Java(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//ENCAPSULAMENTO
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
	//METODO
	public void checaSom(){
		System.out.printf("Emite som!\n");
	}
	
	
	
	
	
	
	
	
	
	
	
}
