package Desafios;


public class Desafio03 {

	public static void main(String[] args) {
		System.out.println(retornaStringCriptografada("Ola Mundo"));
	}

	public static String retornaStringCriptografada(String textoParaCriptografar) {
		int indiceParaPercorreOArrayComAsLetrasDoTexto = 0;
		int dimencaoDaMatriz = 0;
		int valorMaiorDaRaizDoTamanhoTexto = 0;
		int valorMenorDaRaizDoTamanhoTexto = 0;

		//.replace, substitui o 1° parametro pelo segundo
		String textoSemEspaços = textoParaCriptografar.replace(" ", "");

		String textoCriptografado = "";

		char[] arrayDoTextoParaCriptografar = textoSemEspaços.toCharArray();

		// Math.sqrt - Retorna a raiz quadrada, Math.Ceil Retorna o numero arredondado
		// para cima; Math . pow retorna potencia do primeiro pelo segundo argumento
		valorMaiorDaRaizDoTamanhoTexto = (int) Math.ceil(Math.sqrt(textoSemEspaços.length()));
		
		valorMenorDaRaizDoTamanhoTexto = (int) Math.floor(Math.sqrt(textoSemEspaços.length()));

		if (valorMaiorDaRaizDoTamanhoTexto == valorMenorDaRaizDoTamanhoTexto) {
			dimencaoDaMatriz = valorMaiorDaRaizDoTamanhoTexto;
			
		} else if ((valorMenorDaRaizDoTamanhoTexto * valorMenorDaRaizDoTamanhoTexto) >= textoSemEspaços.length()) {

			dimencaoDaMatriz = valorMenorDaRaizDoTamanhoTexto;
			
		} else {
			
			dimencaoDaMatriz = valorMaiorDaRaizDoTamanhoTexto;

		}

		char[][] matrizParaCriptografar = new char[dimencaoDaMatriz][dimencaoDaMatriz];

		for (int i = 0; i < matrizParaCriptografar.length; i++) {
			for (int j = 0; j < matrizParaCriptografar.length; j++) {

				if (indiceParaPercorreOArrayComAsLetrasDoTexto <= (textoSemEspaços.length() - 1)) {

					matrizParaCriptografar[j][i] = arrayDoTextoParaCriptografar[indiceParaPercorreOArrayComAsLetrasDoTexto];

					indiceParaPercorreOArrayComAsLetrasDoTexto++;

				}
			}
		}
		for (int i = 0; i < matrizParaCriptografar.length; i++) {
			for (int j = 0; j < matrizParaCriptografar.length; j++) {

				// if pula a execução caso a posição na matriz seja vazia
				if (matrizParaCriptografar[i][j] == Character.MIN_VALUE) {
					continue;
				}

				textoCriptografado = textoCriptografado + matrizParaCriptografar[i][j];

			}
			// if ultilizado para evitar que no ultimo loop seja adicionado um espaço em
			// branco
			if (i < (matrizParaCriptografar.length - 1)) {
				textoCriptografado = textoCriptografado + " ";
			}

		}
		return textoCriptografado;

	}
}

