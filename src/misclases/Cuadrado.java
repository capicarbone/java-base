package misclases;

public class Cuadrado extends FiguraPlana {
	
	public Cuadrado(int alto){
		
		setAlto(alto);		
	}

	@Override
	public void setAncho(int ancho){
		super.setAncho(ancho);
		
		super.setAlto(ancho);
		
	}

	@Override
	public void setAlto(int alto) {		
		super.setAlto(alto);
		
		super.setAncho(alto);
	}

	@Override
	public String toString() {
		
		String p = super.toString();
		
		return p + ", soy un Cuadrado";
	}
	
	
	
	
	
	

}
