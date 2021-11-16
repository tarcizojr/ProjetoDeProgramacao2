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
		
		adicionarOpçoes();
		repaint();
		
		setVisible(true);
		
	}
	

	private void adicionarOpçoes() {		
		
		JButton agendamento = new JButton("Agendamento");
		agendamento.setBounds(60, 80 , z , w);
		agendamento.addMouseListener(new ouvinteBotoes(agendamento));
		agendamento.addActionListener(new ouvinteJanelaMenu(this));
		add(agendamento);
		
		JButton geradorDeRelatorioa = new JButton("Relatório");
		geradorDeRelatorioa.setBounds(60, 140 , z , w);
		geradorDeRelatorioa.addMouseListener(new ouvinteBotoes(geradorDeRelatorioa));
		geradorDeRelatorioa.addActionListener(new ouvinteJanelaMenu(this));
		add(geradorDeRelatorioa);
		
		JButton buscarServiço = new JButton("Buscar Serviço");
		buscarServiço.setBounds(60, 200 , z , w);
		buscarServiço.addMouseListener(new ouvinteBotoes(buscarServiço));
		buscarServiço.addActionListener(new ouvinteJanelaMenu(this));
		add(buscarServiço);
		
		JButton adicionarColaboradoraServiço = new JButton("Adicionar Colaborador a Serviço");
		adicionarColaboradoraServiço.setBounds(60, 260 , z , w);
		adicionarColaboradoraServiço.addMouseListener(new ouvinteBotoes(adicionarColaboradoraServiço));
		adicionarColaboradoraServiço.addActionListener(new ouvinteDoBtAdicionarServico(this));
		add(adicionarColaboradoraServiço);		
		
		JButton EnviarEmailAoscolaboradores = new JButton("Enviar email ao colaboradores");
		EnviarEmailAoscolaboradores.setBounds(60, 320 , z , w);
		EnviarEmailAoscolaboradores.addMouseListener(new ouvinteBotoes(EnviarEmailAoscolaboradores));
		EnviarEmailAoscolaboradores.addActionListener(new ouvinteJanelaMenu(this));
		add(EnviarEmailAoscolaboradores);		
		
		
		

	}
 }
