package br.com.caelum.testeInterfaces.poligonos;

import br.com.caelum.testeInterfaces.interfaces.AreaCalculavel;

public class Circulo implements AreaCalculavel{

	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}
