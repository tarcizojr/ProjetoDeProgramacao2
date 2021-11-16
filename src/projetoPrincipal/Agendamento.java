package projetoPrincipal;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Agendamento {
	private Cliente cli;
	private String dia;
	private String hora;
	private Funcao fu;
	
	
	public Agendamento (Cliente c , String d, String h, Funcao f) {
		this.cli = c;
		this.dia = d;
		this.hora = h;
		this.fu = f;
	}
	public Agendamento() {
	
	}
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli2) {
		this.cli = cli2;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String data) {
		this.dia = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora2) {
		this.hora = hora2;
	}
	public Funcao getFu() {
		return fu;
	}
	public void setFu(Funcao fu) {
		this.fu = fu;
	}
	
	
}
