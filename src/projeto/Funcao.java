package projeto;

public class Funcao{
	private Colaborador col;
	private Servico sercol;

	public Colaborador getCol() {
		return col;
	}

	public void setCol(Colaborador col) {
		this.col = col;
	}

	public Servico getSercol() {
		return sercol;
	}

	public void setSercol(Servico sercol) {
		this.sercol = sercol;
	}
	
	public Funcao() {
	
	}
	public Funcao(Funcao f) {
		sercol = f.getSercol();
		
	}
		
	public String toString () {
		String texto = "Colaborador(a):" + col.getNome() + " Exercer a Função:" + sercol.getNome();
		return texto;
	}
	
}