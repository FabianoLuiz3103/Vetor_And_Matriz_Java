import java.util.Scanner;

public class vetor27
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, parIm = 0;
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR PARA A: ");
			vetA[i] = teclado.nextInt();
		}
		
		for(i = 0; i < vetA.length; i++)
		{
			
			if(vetA[i] % 2 == 0)
			{
				vetB[parIm] = vetA[i];
				parIm++;
			}
			
			
		}
		
		for(i = 0; i < vetA.length; i++)
		{
			
		    if(vetA[i] % 2 == 1)
			{
				vetB[parIm] = vetA[i];
				parIm++;
			}
			
			
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
