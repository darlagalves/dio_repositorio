package com.dio.calculadora;

import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, soma , sub, multi;
		a = b = soma = sub = multi = 0;
		float div;
		div = 0 ;
		
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = entrada.nextInt();
		
		soma = soma(a,b);
		sub = subtracao(a,b);
		multi = multiplicacao(a,b);
		div = divisao(a,b);
	}
	
	public static int soma (int a, int b) {
		int soma = 0;
		soma = a + b;
		
		return(soma);
	}
	
	public static int subtracao (int a, int b) {
		int sub = 0;
		sub = a - b;
		
		return(sub);
	}
	
	public static int multiplicacao (int a, int b) {
		int multi = 0;
		multi = a * b;
		
		return(multi);
	}
	
	public static float divisao (int a, int b) {
		int div = 0;
		div = a / b;
		
		return(div);
	}

}
