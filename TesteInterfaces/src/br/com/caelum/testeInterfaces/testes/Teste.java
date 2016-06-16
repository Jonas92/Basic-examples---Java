package br.com.caelum.testeInterfaces.testes;

import br.com.caelum.testeInterfaces.interfaces.AreaCalculavel;
import br.com.caelum.testeInterfaces.poligonos.Circulo;
import br.com.caelum.testeInterfaces.poligonos.Retangulo;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calcularArea());
		
		AreaCalculavel a2 = new Circulo(2);
		System.out.println(a2.calcularArea());
	}
}
