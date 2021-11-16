package projetoPrincipal;

public class Funcao {
	private Colaborador colaborador;
	private Servico servicoColaborador;
	public Colaborador getCol() {
		return colaborador;
	}
	public void setCol(Colaborador col) {
		this.colaborador = col;
	}
	public Servico getSercol() {
		return servicoColaborador;
	}
	public void setSercol(Servico sercol) {
		this.servicoColaborador = sercol;
	}
	public Funcao() {
	
	}
	public Funcao(Funcao f) {
		servicoColaborador = f.getSercol();
	}	
	public String toString () {
		String texto = colaborador.getNome() + ":" + servicoColaborador.getNome();
		return texto;
	}	
}
