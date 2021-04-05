package model;

public class Player {
	
	private String name;
	private String profissao;
	private int idade;
	private String genero;
	
	public Player(String name, String profissao, int idade, String genero)
	{
		this.name = name;
		this.profissao = profissao;
		this.idade = idade;
		this.genero = genero;
		
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return this.name + "-" 	
			+ this.profissao + "-"
			+ this.idade + "-"
			+ this.genero;
	}
	
	public String toFileString() {
		return this.name.toLowerCase() + "-" 
				+ this.profissao + "-"
				+ this.idade + "-"
				+ this.genero + "\n";
	}
}