package Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafios.Desafio01;

class Desafio01Teste {

	@Test
	public void retornaMedianaTeste() {
		int[] listaNumeros = { 1, 9, 8, 11, 7, 5, 4, 2, 60, 25, 32 };
		Assertions.assertEquals(Desafio01.retornaMediana(listaNumeros), 8);
	}

}
