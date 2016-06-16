package br.com.caelum.testeInterfaces.poligonos;

import br.com.caelum.testeInterfaces.interfaces.AreaCalculavel;

public class Quadrado implements AreaCalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

}
