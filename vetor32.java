import java.util.Scanner;

public class vetor32 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		double pow=0;
		int[] vetA = new int[11];
		
		for(i = 0; i < vetA.length; i++)
		{
	
			vetA[i] = (int) Math.pow(2, i);
			
			System.out.println("\n2 elevado a " + i + " é: " + vetA[i] );
			
		}
		

	}

}
