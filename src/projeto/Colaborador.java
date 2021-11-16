package projeto;

import projetoPrincipal.Sexo;

public class Colaborador {
	private String nome;
	private String telefone;
	private Sexo sexo;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Colaborador() {
		
	}
	public Colaborador(String n, String t, Sexo x, String e ) {
		nome = n;
		telefone = t;
		sexo = x;
		email = e;
		
	}
	
	public String toString() {
		return "-------------------------"
			+ "\nNome:" + nome +" "
			+ "Telefone:" + telefone+" "
			+ "Sexo:" + sexo +" "
			+ "Email:" + email
			+"\n-------------------------";
		
	}
	public boolean equals() {
		if (email.equals(email) == true) {
			return true;
		}else {
			return false;
		}
		
	}
}