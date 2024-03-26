package br.com.senaiso.bauru.amanda.secao05;

public class Exercio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 19;
		boolean bPodeDirigir = ! (idade < 18 && idade > 65);//uma variavel de verdadeiro ou falso
								 // idade >=18 && idade <=65
		System.out.println("Você " + ( bPodeDirigir ? "Pode" : "Não Pode" )+ " Dirigir"); // estou fazendo uma comparação de verdadeiro ou falso

	}

}
