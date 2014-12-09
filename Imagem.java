public class Imagem implements  Rotacao,Tamanho{
	
	String imagem; //Imagine que seja uma imagem.
	int angulo;
	
	public void setImagem (String i) {
		
		this.imagem = i;
		
	}
	
	public String getImagem (){
		
		return this.imagem;
	
	}
	
}
