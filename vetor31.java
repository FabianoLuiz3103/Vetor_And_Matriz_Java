import java.util.Scanner;

public class vetor31 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, divs;
		int[] vetA = new int[1];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Informe o " + i + " � valor para A: ");
			vetA[i] = teclado.nextInt();
		}
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Analisando o n�mero " + vetA[i]);
			
			for(divs = 1; divs <=  vetA[i]; divs++)
			{
				
			if(vetA[i] % divs == 0) {
				
				System.out.println("\n" + divs + " � divisor de " + vetA[i]);
				
			}
			
			}
			
			System.out.println();
		}
		
       teclado.close();
	}

}
