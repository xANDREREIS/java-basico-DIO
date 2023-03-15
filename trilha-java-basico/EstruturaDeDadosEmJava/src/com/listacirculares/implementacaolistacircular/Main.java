package com.listacirculares.implementacaolistacircular;

public class Main {
	public static void main(String[] args) {
		
		ListaCircular<String> minhaListaCircular = new ListaCircular<>();
		
		minhaListaCircular.add("c0");
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.remove(0);
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.add("c0");
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.add("c1");
		minhaListaCircular.add("c2");
		System.out.println(minhaListaCircular);
		
		System.out.println(minhaListaCircular.get(0));
		System.out.println(minhaListaCircular.get(3));
		System.out.println(minhaListaCircular.get(1));
		System.out.println(minhaListaCircular.get(4));
		System.out.println("------------------------");
		
		for (int i = 0; i < 20; i++) {
			System.out.println(minhaListaCircular.get(i));
		}
		
	}
}
