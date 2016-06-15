package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TesteTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> listaDeNumeros = new TreeSet<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 1000; i++) {
			listaDeNumeros.add(i);
			list.add(i);
		}

		System.out.println(listaDeNumeros.descendingSet());

		Collections.reverse(list);
		System.out.println(list);
	}

}
