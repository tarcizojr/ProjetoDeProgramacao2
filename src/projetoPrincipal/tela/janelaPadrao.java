package projetoPrincipal.tela;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import DynamicLayout.DynamicLayout;
import projetoPrincipal.ouvinte.ouvinteBtVoltar;
import projetoPrincipal.ouvinte.ouvinteMenuBar;

@SuppressWarnings("serial")
public class janelaPadrao extends JFrame {

	private JButton voltar;
	
	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

	public janelaPadrao(String titulo) {		
		
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			    if ("Nimbus".equals(info.getName())) {
			        UIManager.setLookAndFeel(info.getClassName());
			        break;
			    }
			}

			setTitle(titulo);
			setSize(500,600);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(true);			
			setLayout(new DynamicLayout(500, 600));
			setMinimumSize(new Dimension(200, 300));
			
			
			
			
			
			
			setVisible(true);

			
			
			ouvinteMenuBar ouvinteMenuBar = new ouvinteMenuBar(this);
			
			JMenuBar barraDeMenu = new JMenuBar();		
			setJMenuBar(barraDeMenu);
			
			JMenu menuOpcoes = new JMenu("Opçoes");
			menuOpcoes.setBackground(getForeground());
			menuOpcoes.setMnemonic('o'); //diz que a tecla de atalho para a opção é  alt + o
			barraDeMenu.add(menuOpcoes);
			
			JMenuItem itemMenu = new JMenuItem("Menu");
			itemMenu.addActionListener(ouvinteMenuBar);
			menuOpcoes.add(itemMenu);
			
			JMenuItem itemListar = new JMenuItem("Listar");
			itemListar.addActionListener(ouvinteMenuBar);			
			itemListar.setMnemonic('l');
			menuOpcoes.add(itemListar);
			
			JMenuItem itemNovo = new JMenuItem("Novo");
			itemNovo.addActionListener(ouvinteMenuBar);
			itemNovo.setMnemonic('n');
			menuOpcoes.add(itemNovo);
			
			JMenuItem itemBuscarAgendamento = new JMenuItem("Buscar Agendamento");
			itemBuscarAgendamento.addActionListener(ouvinteMenuBar);
			itemBuscarAgendamento.setMnemonic('b');
			menuOpcoes.add(itemBuscarAgendamento);
			
			JMenuItem itemSair = new JMenuItem("Sair");
			itemSair.addActionListener(ouvinteMenuBar);
			itemSair.setMnemonic('s');
			menuOpcoes.add(itemSair);
			
			
			if(!(this instanceof janelaMenu)) {
				ImageIcon img = new ImageIcon("img/icons8-seta.png");
				JButton voltar = new JButton(img);
				voltar.setBounds(10,20,50,50);
				voltar.setOpaque(false);
				voltar.setContentAreaFilled(false);
				
				voltar.addActionListener(new ouvinteBtVoltar(this));
				add(voltar);
			}
			
			
			} catch (Exception e) {
			}
	
}


}
