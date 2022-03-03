package Desafios;


public class Desafio03 {

	
	public static void main(String[] args) {
		retornaStringCriptografada("tenha um bom dia");
	}
	
	public static String retornaStringCriptografada(String string) {
		String semEspaço = string.replace(" ", "");
		char[] arrayStringParaCriptografar = semEspaço.toCharArray();
		int posicaoMax = semEspaço.length()-1;
		int indice = 0;
		int dimencao = (int) Math.ceil(Math.sqrt(semEspaço.length()));
		char[][] criptografador = new char[dimencao][dimencao];
		
		for (int i = 0; i < criptografador.length; i++) {
			for (int j = 0; j < criptografador.length; j++) {
				
				criptografador[j][i] = arrayStringParaCriptografar[indice];
				if(posicaoMax > indice) {
					indice++;
				}
			}
		}
		for (int i = 0; i < criptografador.length; i++) {
			for (int j = 0; j < criptografador.length; j++) {
				System.out.print(criptografador[i][j]);
			}
			System.out.print(" ");
		}
		return null;
		
	}
}
