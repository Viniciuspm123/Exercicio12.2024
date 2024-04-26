package tafera12;

public class exercicio04 {
	
	
	 public static void main(String[] args) {
	        double[] lista = {3.5, 7.2, 5.1, 8.6, 4.9};
	        double media = calcularMedia(lista);
	        System.out.println("A média dos números é: " + media);
	    }
	    
	   
	    public static double calcularMedia(double[] numeros) {
	        if (numeros == null || numeros.length == 0) {
	            throw new IllegalArgumentException("A lista de números está vazia.");
	        }
	        
	        double soma = 0;
	        for (double numero : numeros) {
	            soma += numero;
	        }
	        
	        return soma / numeros.length;
	    }
}
