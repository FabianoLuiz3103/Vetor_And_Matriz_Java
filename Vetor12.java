import java.util.Scanner;

public class Vetor12 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, par=0, impar=0, porcp=0, porci;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++) {
			
			System.out.println("Informe o " + i + " � n�mero: ");
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] % 2 == 0) 
			{
				par++;
			}
			
			if(vetA[i] % 2 == 1) 
			{
				impar++;
			}
			
	
		}
		
		porcp = (par * 100)/vetA.length;
		
		porci = 100 - porcp;
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("A quandidade de pares �: " + par);
		
		System.out.println("\n");
		
		System.out.print("A quantidade de �mapres �: " + impar);
		
		System.out.println("\n");
		
		System.out.print("A porcentagem de pares �: " + porcp + "%");
		
		System.out.println("\n");
		
		System.out.print("A porcentagem de �mpares �: " + porci + "%");
		
		teclado.close();
		

	}

}
