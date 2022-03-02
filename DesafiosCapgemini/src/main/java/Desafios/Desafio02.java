package Desafios;

public class Desafio02 {

	public static void main(String[] args) {
		int[] listaNumeros = { 1, 9, 8, 11, 7, 5, 4, 2, 60, 25, 32,13 };
		System.out.println("Quantidade de Pares encontrados: "+procurarPar(listaNumeros));
	}

	public static int procurarPar(int[] listaNumeros) {
		int x = 2;
		int count=0;
		for (int i = 0; i < listaNumeros.length; i++) {
			for (int j = 0; j < listaNumeros.length; j++) {
				if (listaNumeros[i]-listaNumeros[j] == x) {
					count++;
				}
			}
		}
		return count;

	}

}
