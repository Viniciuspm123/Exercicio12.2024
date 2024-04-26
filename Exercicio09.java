package tafera12;

import java.util.Scanner;

public class Exercicio09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int lado1 = 3;
		int lado2 = 4;
		int lado3 = 5;

		boolean resultado = verificarTriangulo(lado1, lado2, lado3);

		if (resultado) {
			System.out.println("Os lados " + lado1 + ", " + lado2 + ", " + lado3 + " podem formar um triângulo.");
		} else {
			System.out.println("Os lados " + lado1 + ", " + lado2 + ", " + lado3 + " não podem formar um triângulo.");
		}
	}

	public static boolean verificarTriangulo(int lado1, int lado2, int lado3) {

		return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
	}
}
