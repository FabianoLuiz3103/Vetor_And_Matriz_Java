import java.util.Scanner;

public class vetor24 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR DE A: ");
			vetA[i] = teclado.nextInt();
			
			vetB[vetA.length - i - 1] = vetA[i];
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
		
		
		teclado.close();

	}

}
