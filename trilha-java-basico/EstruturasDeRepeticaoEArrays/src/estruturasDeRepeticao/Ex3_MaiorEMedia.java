package estruturasDeRepeticao;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int numero;
	int count = 0;
	int maior = 0;
	int soma = 0;
	
	do {
		System.out.println("Digite um numero: ");
		numero = scanner.nextInt();
		if(numero > maior) maior = numero;
		soma += numero;
		count++;
	}  while( count <5);
	
	System.out.println("Maior numero: " + maior);
	System.out.println("Media: " + (soma / count));
	
	
	
	scanner.close();
}
}
