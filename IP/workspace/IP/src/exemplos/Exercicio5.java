package exemplos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("infome um número inteiro: ");
		int numero1 = teclado.nextInt();
		int numero2 = numero1 - 1;
		int numero3 = numero1 + 1;
		System.out.print("o antecessor do seu número é " + numero2 + " e o sucessor dele é " + numero3);

	}

}
