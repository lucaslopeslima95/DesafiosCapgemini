package Testes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Desafios.Desafio03;

class Desafio03Teste {

	@Test
	void test() {
		Assertions.assertEquals(Desafio03.retornaStringCriptografada("ola mundo") , "omd luo an");
	}

}
