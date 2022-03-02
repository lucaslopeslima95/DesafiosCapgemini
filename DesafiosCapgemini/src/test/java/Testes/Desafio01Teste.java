package Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafios.Desafio01;

class Desafio01Teste {

	@Test
	public void retornaMedianaTeste() {
		int[] listaNumeros = {1, 5, 3, 4, 2};
		Assertions.assertEquals(Desafio01.retornaMediana(listaNumeros), 3);
	}

}
