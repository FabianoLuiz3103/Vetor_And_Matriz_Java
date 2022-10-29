import java.util.Scanner;

public class vetor33 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		long fat = 1;
		int[] vetA = new int[15];
		long[] vetB = new long[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Informe o " + i + " º valor para A:");
			vetA[i] = teclado.nextInt();
		}
		
		for(i = 0; i < vetA.length; i++)
		{
			vetB[i] = 1;
			for(fat = 1; fat <= vetA[i]; fat++)
			{
				
				vetB[i] = vetB[i] * fat;
			}
		}
		
		System.out.println("\nFATORIAIS: ");
		
		for(i = 0; i < vetA.length; i++)
		{
		System.out.println(vetA[i] + "! é: " + vetB[i]);
		}
		System.out.println();

		teclado.close();
	}

}
