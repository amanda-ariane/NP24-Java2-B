package br.com.senaiso.bauru.amanda.secao04;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shitPrice = "15", taxRate="0.05" ,
        		gidderish="887ds7nds87dsfs";
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        double totalTax = Integer.parseInt(shitPrice) *
        		Double.parseDouble(shitPrice);
        System.out.println("Total :" + totalTax);
        
        
        //Try to parse taxRate as an int
        System.out.println(Integer.parseInt(shitPrice));
        //Try to parse gibberish as an int
        
    }
    
}
