import java.util.Scanner;

public class Vetor15 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetA = new int[10];
		int i;
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME A " + (i + 1) + " º IDADE: ");
			vetA[i] = teclado.nextInt();
			
			
		}
		
	 int menor = vetA[0], maior = vetA[0], ps = 0, pss = 0;
		
		for(i = 1; i < vetA.length; i++) 
		{
			if(vetA[i] > maior)
			{
				maior = vetA[i];
				ps = i;
				
			}
			else if(vetA[i] < menor)
			{
				menor = vetA[i];
				pss = i;
			}
			
		}
		
		System.out.println("\n\n");
		System.out.print("IDADES = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		
		System.out.println("\n\nA maior idade é: " + maior + " e a sua posição é: " + ps);
		
		System.out.println("\n\nA menor idade é: " + menor + " e a sua posição é: " + pss);

		teclado.close();
	}

}
