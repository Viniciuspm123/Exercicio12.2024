package tafera12;

public class Exercicio03 {
	
	 public static void main(String[] args) {
	        String texto = "arara"; 
	        boolean resultado = ehPalindromo(texto);
	        
	        if (resultado) {
	            System.out.println("'" + texto + "' é um palíndromo.");
	        } else {
	            System.out.println("'" + texto + "' não é um palíndromo.");
	        }
	    }
	    
	    public static boolean ehPalindromo(String texto) {
	        int esquerda = 0;
	        int direita = texto.length() - 1;
	        
	        while (esquerda < direita) {
	            if (texto.charAt(esquerda) != texto.charAt(direita)) {
	                return false;
	            }
	            esquerda++;
	            direita--;
	        }
	        return true;
	    }

}
