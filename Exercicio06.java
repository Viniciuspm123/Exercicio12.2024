package tafera12;

public class Exercicio06 {

	public static void main(String[] args) {
		String texto = "Hello, world!";
		int numVogais = contarVogais(texto);
		System.out.println("O número de vogais na string é: " + numVogais);
	}

	public static int contarVogais(String texto) {
		if (texto == null || texto.isEmpty()) {
			return 0;
		}

		int contador = 0;
		texto = texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char caractere = texto.charAt(i);
			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
				contador++;
			}
		}

		return contador;
	}

}
