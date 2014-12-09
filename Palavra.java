public class Palavra implements Rotacao {
	
	String texto;
	boolean n,i,s;
	int angulo;
	
	public void setTexto (String t) {
		
		this.texto = t;
		
	}
	
	public String getTexto () {
		
		return this.texto;
		
	}
	
	public void setFormatacao (boolean negrito, boolean italico, boolean sublinhado ) {
		
		this.n = negrito;
		this.i = italico;
		this.s = sublinhado;
		
	}
	
	public boolean getFormatacao () {
		
		return this.n; // Erro na criação do diagrama uml.
		
	}
	
	public void setAngulo ( int a ) {
		
		this.angulo = a;
		
	}
	
	public int getAngulo () {
		
		return this.angulo;
		
	}
}
	
