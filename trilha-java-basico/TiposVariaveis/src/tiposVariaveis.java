
public class tiposVariaveis {
	public static void main(String[] args) {

		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

		int numero01 = 5;
		numero01 = 10;

		final double VALOR_DE_PI = 3.14;

		// classe Operadores.java
		int numero = 5;

		// Imprimindo o numero negativo
		System.out.println(-numero);

		// incrementando numero em mais 1 numero, imprime 6
		numero++;
		System.out.println(numero);

		// incrementando numero em mais 1 numero, imprime 7
		System.out.println(numero++);// ops algo de errado não está certo

		System.out.println(numero);// agora sim, numero virou 7

		// ordem de precedencia conta aqui
		System.out.println(++numero);

		boolean verdadeiro = true;

		System.out.println("Inverteu " + !verdadeiro);

		// classe Operadores.java
		int a, b;

		a = 5;
		b = 6;

		/*
		 * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE if(a==b) resultado =
		 * "verdadeiro"; else resultado = "falso";
		 */

		// MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		boolean resultado = (a == b) ? true : false;

		System.out.println(resultado);

		// classe Operadores.java
		int numero1 = 1;
		int numero2 = 2;

		if (numero1 > numero2)
			System.out.println("Numero 1 maior que numero 2");

		if (numero1 < numero2)
			System.out.println("Numero 1 menor que numero 2");

		if (numero1 >= numero2)
			System.out.println("Numero 1 maior ou igual que numero 2");

		if (numero1 <= numero2)
			System.out.println("Numero 1 menor ou igual que numero 2");

		if (numero1 != numero2)
			System.out.println("Numero 1 diferente de numero 2");

		String nome1 = "JAVA";
		String nome2 = "JAVA";

		System.out.println(nome1 == nome2); // true

		String nome3 = new String("JAVA");

		System.out.println(nome1 == nome3); // false

		String nome4 = nome3;

		System.out.println(nome3 == nome4); // true

		// equals na parada
		System.out.println(nome1.equals(nome2)); // ??
		System.out.println(nome2.equals(nome3)); // ??
		System.out.println(nome3.equals(nome4)); // ??

		// ComparacaoAvancada.java
		int numero001 = 1;
		int numero002 = 1;

		if(numero001== 2 & numero002 ++ == 2 )
		    System.out.println("As 2 condições são verdadeiras");

		System.out.println("O numero 1 agora é " + numero001);
		System.out.println("O numero 2 agora é " + numero002);

		// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

	}
}
