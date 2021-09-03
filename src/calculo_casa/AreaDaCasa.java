package calculo_casa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
			
         Scanner leitor = new Scanner (System.in);
         
         String comodo, sim, nao;
                 	
         int largura, comprimento, totalMetros;
         
         System.out.println("--------------------------------");
         System.out.println("Calculo da area de uma casa");
         System.out.println("--------------------------------");
         System.out.println();
         
         System.out.print("Qual o nome do cômodo? ");
		 comodo = leitor.next();
		 
		 System.out.print("Qual a largura? ");
	     largura = leitor.nextInt();
         	
	     System.out.print("Qual o comprimento? ");
	     comprimento = leitor.nextInt();
	     
	     totalMetros = (largura * comprimento);
	     System.out.println("A(o) " + comodo + " tem " + totalMetros + " metros quadrados.");
	
	     System.out.println();
	     System.out.println("Deseja calcular mais comôdos? ");
	     
	}

}
