package miprimerjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import misclases.Cuadrado;
import misclases.FiguraPlana;
import misclases.Triangulo;

public class Principal {
	
	
	public static String leer_linea(){
		
		String entrada = null;
		BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in));	
		
		try {
			entrada = leerEntrada.readLine();
		} catch (IOException e) {			
			System.out.println("No se pudu leer");
		}
		
		return entrada;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {			
		
		FiguraPlana figura = new FiguraPlana();
		
		figura.setAlto(4);
		figura.setAncho(5);
		
		System.out.println(figura.toString());
		
		System.out.print("El area de la figura es ");
		System.out.println(figura.area());
		
		figura = new FiguraPlana(4,5);
		
		Cuadrado cuadrado = new Cuadrado(2);	
		Cuadrado cuadrado2 = new Cuadrado(2);
		
		System.out.println(cuadrado.toString());
		
		if (cuadrado.equals(cuadrado2))
			System.out.println("Los dos cuadrados son iguales");
		else
			System.out.println("Los dos cuadrados son diferentes");
		
		Triangulo triangulo = new Triangulo(2,3);
		System.out.println(triangulo.toString());		
		
		FiguraPlana arreglo[] = new FiguraPlana[3];
		
		arreglo[0] = new FiguraPlana(2,3);
		arreglo[1] = new Cuadrado(6);
		arreglo[2] = new Triangulo(4, 2);
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i].toString());		
		}
		
						

	}

}
