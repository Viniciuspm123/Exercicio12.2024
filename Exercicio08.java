package tafera12;

public class Exercicio08 {

	public static void main(String[] args) {
		int base = 2;
		int expoente = 5;

		long resultado = calcularPotencia(base, expoente);
		System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
	}

	public static long calcularPotencia(int base, int expoente) {
		if (expoente < 0) {
			throw new IllegalArgumentException("O expoente deve ser um número inteiro positivo.");
		}

		long resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}

		return resultado;
	}

}
