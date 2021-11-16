package projetoPrincipal.tela;

	import java.awt.Color;

	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.border.LineBorder;

import projetoPrincipal.ouvinte.ouvinteDoBtSalvarServico;


	@SuppressWarnings("serial")
	public class janelaServico extends janelaPadrao{
	    private JTextField textFieldNome;
	    private JTextArea textDescricao;
	    private JTextField textFieldNumber;
	    
	    public janelaServico() {
	        super("Cadastrar Serviço");
	        adicionarLabel();
	        adicionarTextField();
	        adicionarLabel2();
	        adicionarTextArea();
	        adicionarLabel3();
	        adicionarTextField2();
	        adicionarBotao();
	        setVisible(true);
	    
	    }
	    
	    public void adicionarLabel() {
	        JLabel texto = new JLabel("Nome:");
	        
	        texto.setBounds(127, 80, 140, 40);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextField () {
	        textFieldNome = new JTextField();
	        
	        textFieldNome.setBorder(new LineBorder(Color.PINK, 2, true));
	        textFieldNome.setBounds(127, 110, 250, 35);
	        textFieldNome.setEnabled(true);
	        
	        add(textFieldNome);
	    }
	    public void adicionarLabel2 () {
	        JLabel texto = new JLabel("Descrição:");
	        
	        texto.setBounds(127, 170, 140, 40);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextArea () {
	        textDescricao = new JTextArea();
	        
	        textDescricao.setBorder(new LineBorder(Color.PINK, 2, true));
	        textDescricao.setBounds(127, 200, 250, 70);
	        textDescricao.setForeground(Color.black);
	        
	        add(textDescricao);
	    }
	    public void adicionarLabel3 () {
	        JLabel texto = new JLabel("Duração Média:");
	        
	        texto.setBounds(127, 300, 140, 40);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    public void adicionarTextField2 () {
	        textFieldNumber = new JTextField();
	        
	        textFieldNumber.setBorder(new LineBorder(Color.PINK, 2, true));
	        textFieldNumber.setBounds(127, 330, 250, 35);
	        textFieldNumber.setForeground(Color.black);
	        
	        add(textFieldNumber);
	    }
	    public void adicionarBotao () {
	        
	        JButton botao = new JButton("Salvar");
	        
	       botao.setBounds(210, 450, 80, 40);
	       botao.setToolTipText("Clique Para Confirmar");
	       ouvinteDoBtSalvarServico ouvinte = new ouvinteDoBtSalvarServico(this);
	       botao.addActionListener(ouvinte);
	       add(botao);
	    }
	    
	    public JTextField getTextFieldNome() {
	        return textFieldNome;
	    }

	    public JTextArea getTextDescricao() {
	        return textDescricao;
	    }

	    public JTextField getTextFieldNumber() {
	        return textFieldNumber;
	    }
	    
	    

	}


