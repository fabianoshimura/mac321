package br.usp.ime.p2.ex2;

public class Esfera {
	double raio;
	double pi = 3.1415926535;;
	
	public Esfera (double raio) {
		this.raio = raio;
	}
	
	public double area() {
		double area;
		
		area = 4 * pi * raio * raio;
		
		return area;
	}
	
	public double volume() {
		double volume;
		
		volume = 4 * pi * raio * raio * raio / 3;
		
		return volume;
	}
	
	public static void main (String [] args) {
		double raio = 5.5;
		
		Esfera esfera = new Esfera(raio);
		
		System.out.println("Área da esfera = " + esfera.area());
		System.out.println("Volume da esfera = " + esfera.volume());
	}
}
