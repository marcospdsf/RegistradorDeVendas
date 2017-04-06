package RegistrandoVenda;

public class Vendedor {

	// Atributos
	public String nome;
	public String codigo;
	// Como não foi citado no slide qual a porcentagem da comissão, decidi
	// colocar 10 (10%)
	public static final double COMISSAO = 10;
	public String endereco;

	// Construtor
	public Vendedor(String nome, String endereco, String codigo) {

		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;

	}

	// Getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}