package exemplos;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
		System.out.print("informe seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Olá Mestre " + nome + " !" );
	}

}
