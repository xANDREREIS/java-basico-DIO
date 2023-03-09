package arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random();
		int [][] numeros = new int [4][4];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				int numero = random.nextInt(9);
				numeros[i][j] = numero;
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		for (int[] linha : numeros) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
		
		int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
		
	}
}
