package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import projetoPrincipal.tela.janelaListar;
import projetoPrincipal.tela.janelaListarColaborador;
import projetoPrincipal.tela.janelaListarServico;

public class ouvinteListar implements ActionListener {
	
    private janelaListar tela;
	
	public ouvinteListar(janelaListar tela) {
		this.tela = tela;
	}

	public void actionPerformed(ActionEvent e) {
		JButton bo = (JButton) e.getSource();
		
		if(bo.getText().equals("Listar Colaboradores")) {
			tela.dispose();
			new janelaListarColaborador();
			
		}else if(bo.getText().equals("Listar Servicos")) {
			tela.dispose();
			new janelaListarServico();
		}
		
	}

}
