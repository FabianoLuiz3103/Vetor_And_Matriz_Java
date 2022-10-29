import java.util.Scanner;

public class Vet3 
{

	public static void main(String[] args)
	{
		// B[i] = sqrt(A[i]);

		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		int[] vetA = new int[15];
		int[] vetB = new int[15];
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("Informe o " + i + " º número: ");
			vetA[i] = teclado.nextInt();
		}
		
		for(i = 0; i < vetA.length; i++) 
		{
			vetB[i] = (int) Math.sqrt(vetA[i]);
		}
		
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
