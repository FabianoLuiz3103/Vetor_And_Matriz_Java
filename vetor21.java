import java.util.Scanner;

public class vetor21
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("Informe o " + i + " º valor de A: ");
			vetA[i] = teclado.nextInt();
			
			vetB[i] = (vetA[i] % 2 == 0) ? 1 : 0;
			//isso substitui todo esse if...else e limpa o código;
			
		}
		System.out.print("\nVETOR A = ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.print( vetA[i] + ", ");
		}
		
		System.out.print("\nVETOR B = ");
		for(i = 0; i < vetB.length; i++)
		{
		if(vetA[i] % 2 == 0 )
		{
			vetB[i] = 1;
			System.out.print(vetB[i] + ", ");
		}
		else if(vetA[i] % 2 == 1) 
		{
			vetB[i] = 0;
			System.out.print(vetB[i] + ", ");
		}
		}
		
		System.out.print("\nVETOR B.1 = ");
		for(i = 0; i < vetB.length; i++)
		{
			System.out.print(vetB[i] + " " );
		}
		
		teclado.close();

	}

}
