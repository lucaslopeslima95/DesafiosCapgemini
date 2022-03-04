package Desafios;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		
		System.out.println(retornaStringCriptografada("tenha um bom dia "));
	}

	public static String retornaStringCriptografada(String textoParaCriptografar) {

		String textoSemEspa�os = textoParaCriptografar.replace(" ", "");

		String textoCriptografado = "";

		char[] arrayDoTextoParaCriptografar = textoSemEspa�os.toCharArray();

		int indiceParaPercorreOArrayComAsLetrasDoTexto = 0;
		// Math.sqrt - Retorna a raiz quadrada, Math.Ceil Retorna o numero arredondado
		// para cima
		int dimencao = (int) Math.ceil(Math.sqrt(textoSemEspa�os.length()));

		char[][] matrizParaCriptografar = new char[dimencao][dimencao];

		for (int i = 0; i < matrizParaCriptografar.length; i++) {
			for (int j = 0; j < matrizParaCriptografar.length; j++) {

				if (indiceParaPercorreOArrayComAsLetrasDoTexto <= (textoSemEspa�os.length() - 1)) {

					matrizParaCriptografar[j][i] = arrayDoTextoParaCriptografar[indiceParaPercorreOArrayComAsLetrasDoTexto];

					indiceParaPercorreOArrayComAsLetrasDoTexto++;

				}
			}
		}
		for (int i = 0; i < matrizParaCriptografar.length; i++) {
			for (int j = 0; j < matrizParaCriptografar.length; j++) {

				// if pula a execu��o caso a posi��o na matriz seja vazia
				if (matrizParaCriptografar[i][j] == Character.MIN_VALUE) {
					continue;
				}

				textoCriptografado = textoCriptografado + matrizParaCriptografar[i][j];

			}
			// if ultilizado para evitar que no ultimo loop seja adicionado um espa�o em
			// branco
			if (i < (matrizParaCriptografar.length - 1)) {
				textoCriptografado = textoCriptografado + " ";
			}

		}
		return textoCriptografado;

	}
}
