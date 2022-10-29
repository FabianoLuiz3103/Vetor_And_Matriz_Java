import java.util.Scanner;

public class Vet9 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int soma = 0, i;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++) 
		{
			
			System.out.println("Informe o " + i + " º número: ");
			vetA[i] = teclado.nextInt();
			
			soma = soma + vetA[i];
			
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("SOMA DOS TERMOS =  ");
		
		System.out.println(soma + " ");
		
		System.out.println("\n");
		
		
		teclado.close();

	}

}
