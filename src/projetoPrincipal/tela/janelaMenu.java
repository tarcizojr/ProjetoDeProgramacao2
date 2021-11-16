package projetoPrincipal.tela;

import javax.swing.JButton;

import projetoPrincipal.ouvinte.ouvinteBotoes;
import projetoPrincipal.ouvinte.ouvinteDoBtAdicionarServico;
import projetoPrincipal.ouvinte.ouvinteJanelaMenu;

@SuppressWarnings("serial")
public class janelaMenu extends janelaPadrao {
	
	private int z = 377;
	private int w = 44;
	
	public janelaMenu() {
		super("Menu");
		
		adicionarOp�oes();
		repaint();
		
		setVisible(true);
		
	}
	

	private void adicionarOp�oes() {		
		
		JButton agendamento = new JButton("Agendamento");
		agendamento.setBounds(60, 80 , z , w);
		agendamento.addMouseListener(new ouvinteBotoes(agendamento));
		agendamento.addActionListener(new ouvinteJanelaMenu(this));
		add(agendamento);
		
		JButton geradorDeRelatorioa = new JButton("Relat�rio");
		geradorDeRelatorioa.setBounds(60, 140 , z , w);
		geradorDeRelatorioa.addMouseListener(new ouvinteBotoes(geradorDeRelatorioa));
		geradorDeRelatorioa.addActionListener(new ouvinteJanelaMenu(this));
		add(geradorDeRelatorioa);
		
		JButton buscarServi�o = new JButton("Buscar Servi�o");
		buscarServi�o.setBounds(60, 200 , z , w);
		buscarServi�o.addMouseListener(new ouvinteBotoes(buscarServi�o));
		buscarServi�o.addActionListener(new ouvinteJanelaMenu(this));
		add(buscarServi�o);
		
		JButton adicionarColaboradoraServi�o = new JButton("Adicionar Colaborador a Servi�o");
		adicionarColaboradoraServi�o.setBounds(60, 260 , z , w);
		adicionarColaboradoraServi�o.addMouseListener(new ouvinteBotoes(adicionarColaboradoraServi�o));
		adicionarColaboradoraServi�o.addActionListener(new ouvinteDoBtAdicionarServico(this));
		add(adicionarColaboradoraServi�o);		
		
		JButton EnviarEmailAoscolaboradores = new JButton("Enviar email ao colaboradores");
		EnviarEmailAoscolaboradores.setBounds(60, 320 , z , w);
		EnviarEmailAoscolaboradores.addMouseListener(new ouvinteBotoes(EnviarEmailAoscolaboradores));
		EnviarEmailAoscolaboradores.addActionListener(new ouvinteJanelaMenu(this));
		add(EnviarEmailAoscolaboradores);		
		
		
		

	}
 }
