public class Imagem implements  Rotacao,Tamanho{
	
	String imagem; //Imagine que seja uma imagem.;
	int angulo;
	int altura, largura;
	
	public void setImagem (String i) {
		
		this.imagem = i;
		
	}
	
	public String getImagem (){
		
		return this.imagem;
	
	}
	
	public void setAngulo ( int a ) {
		
		this.angulo = a;
		
	}
	
	public int getAngulo () {
		
		return this.angulo;
		
	}
	
	public void setTamanho ( int a, int l) {
		
		this.altura = a;
		this.largura = l;
		
	}
	
	public int getAltura () {
		
		return this.altura;
		
	}
	
	public int getLargura () {
		
		return this.largura;
		
	}
	
}
