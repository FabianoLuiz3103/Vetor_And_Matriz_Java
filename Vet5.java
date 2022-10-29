import java.util.Scanner;

public class Vet5 
{

	public static void main(String[] args) 
	{
		// B[i] = A[i] * i;
		
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		for(i = 0; i < vetA.length; i++) 
		{
		 
			System.out.println("Insira o " + i + " º número: ");
			vetA[i] = teclado.nextInt();
			
			vetB[i] = vetA[i] * i;
			
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
		
		teclado.close();
		

	}

}
