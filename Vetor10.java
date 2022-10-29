import java.util.Scanner;

public class Vetor10 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, soma = 0, multfiv=0;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("Informe o " + i + " º número: ");
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] % 5 == 0) {
				
				soma = soma + vetA[i];
				multfiv++;
			}
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("Quanitdade de mult de 5: " + multfiv);
		
		System.out.println("\n\n");
		
		System.out.print("A soma dos mult de 5 é: " + soma);
		
		
		teclado.close();
		
		
	}

}
