package tafera12;

public class Exercicio02{

public static int calcularFatorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("O fatorial não está definido para números negativos.");
    }
    if (n == 0 || n == 1) {
        return 1;
    }
    int fatorial = 1;
    for (int i = 2; i <= n; i++) {
        fatorial *= i;
    }
    return fatorial;
}

public static void main(String[] args) {
    int numero = 5; 
    int resultado = calcularFatorial(numero);
    System.out.println("O fatorial de " + numero + " é: " + resultado);
    
}
}