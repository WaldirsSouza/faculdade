package exemplos;

import java.util.Scanner;

public class SALARIO {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("informe seu salario: ");
		double salario = teclado.nextDouble();

		System.out.print("informe o valor da porcentagem do seu reajuste: ");
		double porcentagem = teclado.nextDouble();

		double novoSalario = salario + (salario * porcentagem / 100);
		System.out.print("seu novo salario é:" + novoSalario);

	}

}
