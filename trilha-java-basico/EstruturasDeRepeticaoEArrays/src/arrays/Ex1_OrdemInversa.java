package arrays;

public class Ex1_OrdemInversa {
	public static void main(String[] args) {
		int [] vetor = {12,23,45,6,7,34};
		
		System.out.println("Ordem normal: ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nOrdem inversa: ");
		for (int i = (vetor.length -1); i >= 0 ; i--) {
			System.out.print(vetor[i] + " ");
		}
	}
}
