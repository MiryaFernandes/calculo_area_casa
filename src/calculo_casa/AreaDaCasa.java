package calculo_casa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
			
         Scanner leitor = new Scanner (System.in);
         
         String comodo1, comodo2;
                 	
         int largura1, largura2, comprimento1, comprimento2, totalMetros, totalMetros2, totalCasa;
         
         System.out.println("--------------------------------");
         System.out.println("Calculo da area de uma casa");
         System.out.println("--------------------------------");
         System.out.println();
         
         System.out.print("Qual o nome do cômodo? ");
		 comodo1 = leitor.next();
		 
		 System.out.print("Qual a largura? ");
	     largura1 = leitor.nextInt();
         	
	     System.out.print("Qual o comprimento? ");
	     comprimento1 = leitor.nextInt();
	     
	     System.out.println();
	     totalMetros = (largura1 * comprimento1);
	     System.out.println("A(o) " + comodo1 + " tem " + totalMetros + " metros quadrados.");
	
	     String resposta;
	     
	     System.out.println();
	     System.out.print("Deseja calcular mais comôdos(S/N)? ");
	     resposta = leitor.next();
	     System.out.println();
	     
	     
	     if (resposta.equals("sim")||resposta.equals("Sim")) {
	    	 
	    	 while (resposta.equals("sim")||resposta.equals("Sim")) {
	    	 
	    	 System.out.print("Qual o nome do cômodo? ");
			 comodo2 = leitor.next();
			 
			 System.out.print("Qual a largura? ");
		     largura2 = leitor.nextInt();
	         	
		     System.out.print("Qual o comprimento? ");
		     comprimento2 = leitor.nextInt();
		     System.out.println();
		     
		     
		     totalMetros2 = (largura2 * comprimento2);
		     System.out.print("A(o) " + comodo2 + " tem " + totalMetros2 + " metros quadrados.");
		     
		     System.out.println();
		     totalCasa = (totalMetros + totalMetros2);
		     System.out.println("A área total da casa é " + totalCasa + " metros quadrados");
		     System.out.println();
		     
		     
		     System.out.print("Deseja calcular mais comôdos(S/N)? ");
		     resposta =leitor.next();
		     System.out.println();
	    	 
	     } } else if (resposta.equals("nao")||resposta.equals("Nao")){
		     
	    	 
	    	 System.out.println("* * * F I M * * *");
	    	 
	     } else {
	    	 
	    	 System.out.print("Não corresponde a uma resposta válida!");
	    	 
	     }
	     
	}

}
	


