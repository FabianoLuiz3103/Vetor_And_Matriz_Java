import java.util.Scanner;

public class Vet6 
{

	public static void main(String[] args) 
	{
		// C[i] = A[i] + B[i];
		
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[10];
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("Informe o " + i + " º valor do VETOR A: ");
			vetA[i] = teclado.nextInt();
			
				
		}
		
		
		for(i = 0; i < vetB.length; i++) 
		{
			System.out.println("Informe o " + i + " º valor do VETOR B: ");
			vetB[i] = teclado.nextInt();
		}
		
		
		for(i = 0; i < vetC.length; i++) 
		{
			vetC[i] = vetA[i] + vetB[i];
			
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR B = ");
		for(i = 0; i < vetB.length; i++) 
		{
			System.out.print(vetB[i] + " ");
			
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR C = ");
		for(i = 0; i < vetC.length; i++) 
		{
			System.out.print(vetC[i] + " ");
			
		}
		
		System.out.println("\n");
		
		teclado.close();

	}

}
