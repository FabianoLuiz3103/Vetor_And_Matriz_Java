import java.util.Scanner;

public class Vvetor22 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR PARA A: ");
			vetA[i] = teclado.nextInt();
			
		}
		
		System.out.println("\n\n");
		
		for(i = 0; i < vetB.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR PARA B: ");
			vetB[i] = teclado.nextInt();
			
			if(vetA[i] > vetB[i])
			{
				vetC[i] = 1;
			}
			else if(vetA[i] == vetB[i])
			{
				vetC[i] = 0;
			}
			else {
				vetC[i] = -1;
			}
			
		}
		
		
		System.out.print("\nVETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
			
		}
		
		System.out.print("\nVETOR B = ");
		for(i = 0; i < vetB.length; i++)
		{
			System.out.print(vetB[i] + " ");
			
		}
		
		System.out.print("\nVETOR C = ");
		for(i = 0; i < vetC.length; i++)
		{
			System.out.print(vetC[i] + " ");
			
		}
		
		teclado.close();

	}

}
