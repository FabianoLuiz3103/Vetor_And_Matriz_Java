import java.util.Scanner;

public class vetor20 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " � N�MERO: ");
			vetA[i] = teclado.nextInt();
		}
		
		boolean palindromo = true;
		for(i = 0; i < (vetA.length/2); i++)
		{
			if(vetA[i] != vetA[vetA.length - 1 - i])
			{
				palindromo = false;
				break;
			}
		}
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		if(palindromo)
		{
			System.out.println("� palindromo! ");
		}
		else {
			System.out.println("N�o � palindromo! ");
		}

		teclado.close();
	}
	

}
