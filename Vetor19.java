import java.util.Scanner;

public class Vetor19 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Informe o " + i + " � n�mero: " );
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] % 2 != 0)
			{
				System.out.println("FIM DA EXECU��O!");
				break;
				
			}
			
			
		}
		
		
		teclado.close();

	}

}
