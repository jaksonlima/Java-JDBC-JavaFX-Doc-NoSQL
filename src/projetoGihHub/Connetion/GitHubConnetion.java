package projetoGihHub.Connetion;

import projeto.Autentica.GitHubAutenticaUser;

public class GitHubConnetion extends GitHubAutenticaUser{

	private int conexao;
	private double nome;
	private String emaiil;

	public GitHubConnetion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getConexao() {
		return conexao;
	}

	public void setConexao(int conexao) {
		this.conexao = conexao;
	}

	public double getNome() {
		return nome;
	}

	public void setNome(double nome) {
		this.nome = nome;
	}

	public String getEmaiil() {
		return emaiil;
	}

	public void setEmaiil(String emaiil) {
		this.emaiil = emaiil;
	}

}
