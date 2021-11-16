package projetoPrincipal.tela;
	import java.awt.Color;

	import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.border.LineBorder;

import projetoPrincipal.ouvinte.ouvinteDoBtSalvarColaborador;

	@SuppressWarnings("serial")
	public class janelaColaborador extends janelaPadrao {
	    private JTextField textNome;
	    private JTextField textEmail;
	    private JTextField textTelefone;
	    private JComboBox<?> comboBox;
	    private JTextArea  textServicos;
	    
	    public JTextField getTextNome() {
	        return textNome;
	    }
	    public JTextField getTextEmail() {
	        return textEmail;
	    }
	    public JTextField getTextTelefone() {
	        return textTelefone;
	    }
	  
	    public JTextArea getTextServicos() {
	        return textServicos;
	    }
	    public JComboBox<?> getTextSexo() {
			return comboBox;
		}

	    
	    
	    public janelaColaborador() {
	        super("Cadastrar Colaborador");
	        adicionarLabel();
	        adicionarTextField();
	        adicionarLabel2();
	        adicionarTextField2();
	        adicionarLabel3();
	        adicionarTextField3();
	        adicionarLabel4();
	        adicionarComboBox();
	        adicionarBotao();
	        setVisible(true);
	    }
	    private void adicionarLabel() {
	        JLabel texto = new JLabel("Nome:");
	        
	        texto.setBounds(127, 80, 140, 40);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    private void adicionarTextField () {
	        textNome = new JTextField();
	    
	        
	        textNome.setBorder(new LineBorder(Color.PINK, 2, true));
	        textNome.setBounds(127, 110, 250, 35);
	        textNome.setEnabled(true);
	        
	        add(textNome);
	    }
	    private void adicionarLabel2 () {
	        JLabel texto = new JLabel("Email: ");
	        
	        texto.setBounds(127, 150, 140, 40);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    private void adicionarTextField2 () {
	        textEmail = new JTextField();
	        
	        
	        textEmail.setBorder(new LineBorder(Color.PINK, 2, true));
	        textEmail.setBounds(127, 180, 250, 35);
	        textEmail.setEnabled(true);
	        
	        add(textEmail);
	    }
	    private void adicionarLabel3 () {
	        JLabel texto = new JLabel("Telefone: ");
	        
	        texto.setBounds(127, 230, 200, 20);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    private void adicionarTextField3 () {
	        textTelefone = new JTextField();
	        
	        
	        textTelefone.setBorder(new LineBorder(Color.PINK, 2, true));
	        textTelefone.setBounds(127, 250, 250, 35);
	        textTelefone.setEnabled(true);
	        
	        add(textTelefone);
	    }
	    private void adicionarLabel4 () {
	        JLabel texto = new JLabel("Sexo: ");
	        
	        texto.setBounds(127, 300, 200, 20);
	        texto.setForeground(Color.black);
	        
	        add(texto);
	    }
	    private void adicionarComboBox() {
	        String[] opcoes = {"Masculino", "Feminino", "Outro"};
	        comboBox = new JComboBox<String>(opcoes);
	        comboBox.setBorder(new LineBorder(Color.PINK, 2, true));
	        comboBox.setBounds(127, 335, 240, 25);
	        add(comboBox);
	    }
	
	    private void adicionarBotao () {
	        
	        JButton botao = new JButton("Salvar");
	        
	        botao.setBounds(210, 390, 90, 35);
	        botao.setToolTipText("Clique Para Confirmar");
	        
	        ouvinteDoBtSalvarColaborador ouvinte = new ouvinteDoBtSalvarColaborador(this);
	        botao.addActionListener(ouvinte);
	        add(botao);
	    }
		
	    
}