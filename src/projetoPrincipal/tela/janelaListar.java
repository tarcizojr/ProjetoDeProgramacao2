package projetoPrincipal.tela;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import projetoPrincipal.ouvinte.ouvinteBotoes;
import projetoPrincipal.ouvinte.ouvinteListar;

public class janelaListar extends janelaPadrao {
	private JButton btListarColaborador;
	private JButton btListarServicos;

	public janelaListar() {
		super("Listar");
		
		btListarColaboradores();
		btListarServicos();
		
		setVisible(true);
	}

	private void btListarServicos() {
		btListarServicos = new JButton();
		btListarServicos.setText("Listar Servicos");
		btListarServicos.setBounds(100, 140 , 300 , 50);
		btListarServicos.addActionListener((ActionListener) new ouvinteListar(this));
		btListarServicos.addMouseListener(new ouvinteBotoes(btListarServicos));
		add(btListarServicos);
		
		
	}

	private void btListarColaboradores() {
		btListarColaborador = new JButton();
		btListarColaborador.setText("Listar Colaboradores");
		btListarColaborador.setBounds(100, 200 , 300 , 50);
		btListarColaborador.addActionListener((ActionListener) new ouvinteListar(this));
		btListarColaborador.addMouseListener(new ouvinteBotoes(btListarColaborador));
				add(btListarColaborador);
	}

}
