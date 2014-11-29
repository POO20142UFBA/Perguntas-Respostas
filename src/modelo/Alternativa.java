package modelo;

public class Alternativa {
	
	private String alternativa;
	private boolean ehCorreta;

	public Alternativa(String a, boolean b){
		setAlternativa(a);
		setEhCorreta(b);
	}
	public Alternativa(){
		
	}
	
	public String getAlternativa(){
		return this.alternativa;
	}
	public void setAlternativa(String value){
		this.alternativa = value;
	}	
	public boolean getEhCorreta(){
		return this.ehCorreta;
	}
	public void setEhCorreta(boolean value){
		this.ehCorreta = value;
	}	
}
