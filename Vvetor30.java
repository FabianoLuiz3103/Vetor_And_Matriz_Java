import java.util.Scanner;

public class Vvetor30 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, par=0;
		int[] vetA = new int[2];
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("INFORME O " + i + " º VALOR PARA A:");
			vetA[i] = teclado.nextInt();
			
		}
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("Analisando o número: " + vetA[i]);
			for(par = 2; par <= vetA[i]; par++) {
				
		        if(par % 2 == 0) {
		        	
		        	
		        	System.out.println(par + " é par");
		        }
			}
			
			System.out.println();
		}
		teclado.close();

	}

}
