public class Video implements Tamanho {
	
	String video; // Imagine que seja um video.
	int altura, largura;
	
	public void setVideo (String v) {
		
		this.video = v;
		
	}
	
	public String getVideo () {
		
		return this.video;
		
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

