package projetoPrincipal.tela;

import javax.swing.JButton;

import projetoPrincipal.ouvinte.ouvinteBotoes;
import projetoPrincipal.ouvinte.ouvinteNovo;

public class janelaNovo extends janelaPadrao {

	private JButton btNovoColaborador;
	private JButton btNovoServicos;
	private JButton btNovoCliente;

	public janelaNovo() {
		super("Novo");
		
		btNovoColaboradores();		
		btNovoServicos();
		btNovoCliente();
		
		setVisible(true);
	}

	private void btNovoServicos() {
		btNovoServicos = new JButton();
		btNovoServicos.setText("Novo Colaborador");
		btNovoServicos.setBounds(100, 140 , 300 , 50);
		btNovoServicos.addActionListener(new ouvinteNovo(this));
		btNovoServicos.addMouseListener(new ouvinteBotoes(btNovoServicos));
		add(btNovoServicos);
		
		
	}

	private void btNovoColaboradores() {
		btNovoColaborador = new JButton();
		btNovoColaborador.setText("Novo Serviço");
		btNovoColaborador.setBounds(100, 200 , 300 , 50);
		btNovoColaborador.addActionListener(new ouvinteNovo(this));
		btNovoColaborador.addMouseListener(new ouvinteBotoes(btNovoColaborador));
				add(btNovoColaborador);
	}
	
	private void btNovoCliente() {
		btNovoCliente = new JButton();
		btNovoCliente.setText("Novo Cliente");
		btNovoCliente.setBounds(100, 260 , 300 , 50);
		btNovoCliente.addActionListener(new ouvinteNovo(this));
		btNovoCliente.addMouseListener(new ouvinteBotoes(btNovoCliente));
		add(btNovoCliente);
		
	}
}
