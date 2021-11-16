package projeto;

	public class Servico {
	    private long id;
	    private String nome;
	    private String descricao;
	    private int duracaoMedia;
	    
	    public Servico() {
	    	
	    }

	    public Servico (String nome, String descricao, int duracaoMedia) {
	        this.id = System.currentTimeMillis();
	        this.nome = nome;
	        this.descricao = descricao;
	        this.duracaoMedia = duracaoMedia;
	    }

	    public String toString() {
	       return "Nome do Servi�o: " + nome
	       	+ "\nId:" + id;
	       
	        	
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public int getDuracaoMedia() {
	        return duracaoMedia;
	    }

	    public void setDuracaoMedia(int duracaoMedia) {
	        this.duracaoMedia = duracaoMedia;
	    }


	}



