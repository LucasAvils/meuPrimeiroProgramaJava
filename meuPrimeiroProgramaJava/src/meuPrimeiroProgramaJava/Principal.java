/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author LGame
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ol� Amigo \nQual � o seu nome?");
		
		// ler uma string do console usando a biblioteca scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir um string usando printf
		System.out.printf("Ol� %s!", nome);
		in.close();
	}

}
