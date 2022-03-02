package Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafios.Desafio02;

class Desafio02Teste {

	@Test
	void test() {
		int[] listaNumeros = { 1, 9, 8, 11, 7, 5, 4, 2, 60, 25, 32, 13 };
		Assertions.assertEquals(Desafio02.procurarPar(listaNumeros), 5);
	}

}
