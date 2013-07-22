package misclases;

public class FiguraPlana {
	
	// Atributos 
	
	private int alto;
	private int ancho;
	
	// Constructores
	
	public FiguraPlana(){
		
		this.alto = 0;
		this.ancho = 0;
	}
	
	public FiguraPlana(int alto, int ancho){
		
		this.alto = alto;
		this.ancho = ancho;
	}
	
	// Método Getter y Setter
	
	public int getAlto(){
		return alto;
	}
	
	public int getAncho(){
		return ancho;
	}
	
	public void setAlto(int alto){
		
		this.alto = alto;
	}
	
	public void setAncho(int ancho){
		
		this.ancho = ancho;
	}
	
	// Métodos públicos
	
	public int area(){
		
		int a = ancho*alto;
		
		return a;
				
	}
	
	@Override
	public String toString() {
		
		String s = "Figura: el ancho es " + Integer.toString(ancho) + " y el alto " + Integer.toString(alto);
			
		return s;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		FiguraPlana f = (FiguraPlana) obj;
		
		if ( this.alto == f.getAlto() && this.ancho == f.getAlto() )
			return true;
		else
			return false;
		
	}
	
	
	
}
