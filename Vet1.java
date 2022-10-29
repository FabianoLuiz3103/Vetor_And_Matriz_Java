import java.util.Scanner;

public class Vet1 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		int[] vetA = new int[8];
		int[] vetB = new int[8];
		
		for(i = 0; i < vetA.length; i++) {
			
			System.out.println("Entre com o valor da posição " + i + ":");
			vetA[i] = teclado.nextInt();
		}
		
		for (i = 0; i < vetA.length; i++) {
			
			vetB[i] = vetA[i];
		}
		
		System.out.print("Vetor A = ");
		for (i = 0; i < vetA.length; i++) 
		{
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (i = 0; i < vetB.length; i++) 
		{
			System.out.print(vetB[i] + " ");
		}
		System.out.println();
		
		teclado.close();
	}

}
