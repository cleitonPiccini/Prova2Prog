class Conteudo {
	
	Palavra p[100];
	Imagem imagem[100];
	Video video[100];
	
	public void insertTexto (String t) {
		
		t= "Texto";
		p[1] = new Palavra();
		p[1].setTexto(t);
		
	}
	
	public void insertImagem (String i) {
		
		i= "imagem";
		imagem[1] = new Imagem();
		imagem[1].setImagem(i);
		
	}
	
	public void insetVideo (String v ) {
		
		v = "Video";
		video[1] = new Video();
		video[1].setVideo(v);
		
	}
	
}
