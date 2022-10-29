import java.util.Scanner;

public class vetor23 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] vetA = new int[10];
		char[] vetB = new char[vetA.length];
		int[] Decimal = new int[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR A: ");
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] < 7)
			{
				vetB[i] = 'a';
				Decimal[i] = 'a';
			}
			else if(vetA[i] == 7)
			{
				vetB[i] = 'b';
				Decimal[i] = 'b';
			}
			else if((vetA[i] > 7)&&(vetA[i] < 10))
			{
				vetB[i] = 'c';
				Decimal[i] = 'c';
			}
			else if (vetA[i] == 10)
			{
				vetB[i] = 'd';
				Decimal[i] = 'd';
			}
			else if(vetA[i] > 10)
			{
				vetB[i] = 'e';
				Decimal[i] = 'e';
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
		for(i = 0; i < vetB.length; i++)
		{
			System.out.print(vetB[i] + " ");
		}
		
		System.out.println("\n\n");
		
		System.out.print("VETOR DECIMAL = ");
		for(i = 0; i < Decimal.length; i++)
		{
			System.out.print(Decimal[i] + " ");
		}
		
		teclado.close();

	}

}
