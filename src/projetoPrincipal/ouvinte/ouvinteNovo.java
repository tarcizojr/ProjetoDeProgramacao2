package projetoPrincipal.ouvinte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import projetoPrincipal.tela.janelaColaborador;
import projetoPrincipal.tela.janelaMenu;
import projetoPrincipal.tela.janelaNovoCliente;
import projetoPrincipal.tela.janelaServico;

public class ouvinteNovo implements ActionListener {
private JFrame tela;
	
	public ouvinteNovo(JFrame tela) {
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bo = (JButton) e.getSource();
		
		if(bo.getText().equals("Novo Colaborador")) {
			tela.dispose();
			new janelaColaborador();
		}else if(bo.getText().equals("Novo Serviço")) {
			tela.dispose();
			new janelaServico();
			
		}else if(bo.getText().equals("Novo Cliente")) {
			tela.dispose();
			new janelaNovoCliente();
		}else if(bo.getText().equals("Salvar")) {
			JOptionPane.showMessageDialog(null, "Colaborador Cadastrado!!");
			tela.dispose();
			new janelaMenu();
		}
		
	}
}
