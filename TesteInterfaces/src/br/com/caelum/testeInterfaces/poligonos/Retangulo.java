package br.com.caelum.testeInterfaces.poligonos;

import br.com.caelum.testeInterfaces.interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.largura * this.altura;
	}

}
