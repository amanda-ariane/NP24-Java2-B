package br.com.senaiso.bauru.amanda.secao05;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scn = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        
        System.out.println("Digite 3 valores inteiros: ");
        int vlr1, vlr2, vlr3, total;
        vlr1 = scn.nextInt();
        vlr2 = scn.nextInt();
        vlr3 = scn.nextInt();
        total = vlr1+vlr2+vlr3;
        System.out.println("Total "+ total);
        
        //Remember to close the Scanner
        scn.close();
    }
}
