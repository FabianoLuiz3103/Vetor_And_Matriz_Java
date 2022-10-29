import java.util.Scanner;

public class Vetor18 
{

	public static void main(String[] args) 
	{
		// porcp = (par * 100)/vetA.length;
		
		Scanner teclado = new Scanner(System.in);
		
		int i, zer = 0, um = 0;
		double por0 = 0, por1 = 0;
		int[] vetA = new int[10];
		
		//vetA[i] = (int)Math.round(Math.random() * 1);
		
		for(i = 0; i < vetA.length; i++)
		{
			vetA[i] = (int)Math.round(Math.random() * 1);
			
			if(vetA[i] == 0)
			{
			   zer++;	
			   por0 = (zer * 100)/vetA.length;
			}
			
			if(vetA[i] == 1)
			{
				um++;	
				   por1 = (um * 100)/vetA.length;
			}
		}
		
		System.out.print("\nVETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print(vetA[i] + " ");
		}
		
		System.out.print("\nA porcentagem de 0 no vetor é: " + por0);
		
		System.out.print("\nA porcentagem de 1 no vetor é: " + por1);
		
		teclado.close();

	}

}
