class Conteudo {
	
	Palavra p[100];
	Imagem i[100];
	Video v[100];
	
	public void insertTexto (String t) {
		
		t= "oi";
		p[1] = new Palavra();
		p[1].setTexto(t);
		
	}
	
	public void insertImagem (String i) {
		
		i= "imagem";
		i[1] = new Imagem();
		i[1].setImagem(i);
		
	}
	
	public void insetVideo (String v ) {
		
		v = "Video";
		v[1] = new Video();
		v[1].setVideo(v);
		
	}
	
}
