package br.com.senaiso.bauru.amanda.secao05;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor de 1 a 10:");
			int vlr = sc.nextInt();
			switch(vlr) {
			case 1: System.out.println("Você ganhou um boné!");
			case 2: System.out.println("Você ganhou uma caneta!");
			case 3: System.out.println("Você ganhou um lapis!");
			case 4: System.out.println("Você ganhou uma calculadora!");
			case 5: System.out.println("Você ganhou uma borracha!");
			case 6: System.out.println("Você ganhou uma régua!");
			case 7: System.out.println("Você ganhou um transferidor!");
			case 8: System.out.println("Você ganhou um compasso!");
			case 9: System.out.println("Você ganhou um celula!");
			case 10: System.out.println("Você ganhou um R$1 000,00!");
			default: System.out.println("Que pena você perdeu tudo!");
			}
			sc.clouse();
	}

}
