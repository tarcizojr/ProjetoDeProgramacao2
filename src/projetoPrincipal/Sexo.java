package projetoPrincipal;
public enum Sexo {
	   HOMEM("Homem"),
	    MULHER("Mulher"),
	    OUTROS("Outros");

	    private String sexo;

	    Sexo(String s){
	        sexo = s;
	    }

	    public String getSexo() {
	        return sexo;
	    }
}
