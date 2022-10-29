import java.util.Scanner;

public class vetor26 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, pares = 0, impares = 0;
		int[] vetA = new int[20];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR PARA A: ");
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] % 2 == 0)
			{
				vetB[pares] = vetA[i];
				pares++;
			}
			else if(vetA[i] % 2 == 1)
			{
				vetC[impares] = vetA[i];
				impares++;
			}
		}
		
		System.out.println("\n\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n\n");
		
		System.out.print("VETOR B = ");
		for(i = 0; i < pares; i++)
		{
			System.out.print(vetB[i] + " ");
		}
		
		System.out.print("\n\n");
		
		System.out.print("VETOR C = ");
		for(i = 0; i < impares; i++)
		{
			System.out.print(vetC[i] + " ");
		}
		
		
		teclado.close();

	}

}
