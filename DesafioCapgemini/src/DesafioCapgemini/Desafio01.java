package DesafioCapgemini;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double mediana = 0;
		List<Integer> listaNumeros = new ArrayList<Integer>();
		boolean flag = true;
		do {
			System.out.println("Informe um numero para adicionar a lista");
			listaNumeros.add(scan.nextInt());
			System.out.println("Deseja adicionar mais um numero?\n1-Sim\n2-Nao");
			if (scan.nextInt() == 2) {
				flag = false;
			}

		} while (flag);
		Collections.sort(listaNumeros);
		System.out.println("Lista de Numeros Informados");
		for (int i = 0; i < listaNumeros.size(); i++) {
			System.out.print(listaNumeros.get(i) + "  ");
		}
		if (listaNumeros.size() % 2 == 0) {
			mediana = (listaNumeros.get(listaNumeros.size() / 2) + listaNumeros.get((listaNumeros.size() / 2)+1))/2;
			System.out.println("\nA mediana e: "+mediana);
		}else {
			System.out.println("\nA mediana e: "+listaNumeros.get((listaNumeros.size() / 2)));
		}
		scan.close();
	}

}
