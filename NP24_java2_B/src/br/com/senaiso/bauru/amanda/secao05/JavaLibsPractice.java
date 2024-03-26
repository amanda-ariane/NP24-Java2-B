package br.com.senaiso.bauru.amanda.secao05;

public class JavaLibsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xVlr = JOptionPane.
    			showInputDialog("Qual o valor você gastaria nesse local?:");
    	JOptionPane.showMessageDialog(null, xVlr);    	
                
        
        //Parse the input as an int.
        //Print its value +1
    	JOptionPane.showMessageDialog(null, Integer.parseInt(xVlr)+0);      
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
    	int valor = Integer.parseInt(
    			JOptionPane.showInputDialog("Digite o valor:")
    			);
    	JOptionPane.showMessageDialog(null, valor);
    	
    	
    	
    	
	}

	private static Object name(Object object, String name) {
		// TODO Auto-generated method stub
		return null;
	}}