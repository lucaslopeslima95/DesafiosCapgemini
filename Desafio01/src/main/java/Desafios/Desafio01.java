package Desafios;

import java.util.Scanner;

public class Desafio01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] listaNumeros = {1, 5, 3, 4, 2};
		System.out.println("\nMediana e: " + retornaMediana(listaNumeros));
	}

	public static int retornaMediana(int[] listaNumeros) {
		for (int i = 0; i < listaNumeros.length; i++) {
			for (int j = 0; j < listaNumeros.length; j++) {
				if (listaNumeros[i] < listaNumeros[j]) {
					int temp = listaNumeros[i];
					listaNumeros[i] = listaNumeros[j];
					listaNumeros[j] = temp;
				}
			}
		}
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.print(listaNumeros[i] + " ");
		}
		return listaNumeros[((listaNumeros.length - 1) / 2)];
	}
}
