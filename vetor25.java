import java.util.Scanner;

public class vetor25 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length * 2];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR DE A: ");
			vetA[i] = teclado.nextInt();
			
			vetC[i] = vetA[i];
		}
		
		System.out.println("\n\n");
		
		for(i = 0; i < vetB.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR DE B: ");
			vetB[i] = teclado.nextInt();
			
			vetC[vetA.length + i] = vetB[i];
		}
		
	    System.out.println("\n\n");
	    
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
			
		}
		
		System.out.println("\n\n");
	    
		System.out.print("VETOR B = ");
		for(i = 0; i < vetB.length; i++)
		{
			System.out.print(vetB[i] + " ");
			
		}
		
		System.out.println("\n\n");
	    
		System.out.print("VETOR C = ");
		for(i = 0; i < vetC.length; i++)
		{
		 
			System.out.print(vetC[i] + " ");
			
		}
		
		teclado.close();
		

	}

}
