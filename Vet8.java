import java.util.Scanner;

public class Vet8 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, pares =0;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Informe o " + i + " º número: ");
			vetA[i] = teclado.nextInt();
			
		}
		
		for(i = 0; i < vetA.length; i++)
			
		{
			if(vetA[i] % 2 == 0) 
			{
				pares++;
			}
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("QUANTIDADE DE PARES NO VETOR A: ");
	
			System.out.print(pares + " ");
			
			teclado.close();
		

	}

}
