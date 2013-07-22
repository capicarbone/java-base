package misclases;

public class Triangulo extends FiguraPlana {

	public Triangulo(int base, int altura) {		
		setAlto(altura);
		setAncho(base);
	}

	@Override
	public int area() {
		return ( getAlto() * getAlto() ) / 2; 
	}

	@Override
	public String toString() {
		
		return super.toString() + ", y soy un lindo triángulo :)";
	}
	
	
	

}
