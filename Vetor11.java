import java.util.Scanner;

public class Vetor11
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, impar=0, soma=0, media=0;
		
		int[] vetA = new int[10];
		
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Informe o " + i + " � n�mero: ");
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] % 2 == 1)
			{
				
				soma = soma + vetA[i];
				
				
				impar++;
			}
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		media = soma/impar;
		
		System.out.println("\n");
		
		System.out.println("Quantide de �mpar = " + impar);
		
		System.out.println("\n");
		
		System.out.println("A soma dos �mapres = " + soma );
		
		System.out.println("\n");
		
		System.out.println("A m�dia dos �mapres = " + media);
		
		teclado.close();
		

	}

}
