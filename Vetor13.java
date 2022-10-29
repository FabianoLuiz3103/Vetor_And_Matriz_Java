import java.util.Scanner;

public class Vetor13 
{

	public static final int CONSTANT = 15;
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, soma1 = 0,soma2 = 0, media = 0, qt = 0, qtt = 0;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("Informe o " + i + " º número: ");
			vetA[i] = teclado.nextInt();
			
		}
		
		for(i = 0; i < vetA.length; i++) 
		{
			if(vetA[i] < CONSTANT) 
			{
				
				soma1 = soma1 + vetA[i];
				
			}
			
			if(vetA[i] == CONSTANT)
			{
				
				qt++;
			}
			
			if(vetA[i] > CONSTANT) 
			{
				
				qtt++;
				
				soma2 = soma2 + vetA[i];
				
				media = soma2 / qtt;
			}
		}
		
		System.out.println("\n");
		
		System.out.print("VETOR A = ");
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.print(vetA[i] + " ");
			
		}
		
		System.out.println("\n");
		
		System.out.print("A soma dos menores que 15 resulta em = " + soma1);
		
		System.out.print("\n\nA quantidade de números iguais a 15 é = " + qt);
		
		System.out.println("\n\nA quantidade de números maiores que 15 é = " + qtt);
		
		System.out.println("\n\nA soma dos maiores que 15 resulta em = " + soma2);
		
		System.out.println("\n\nA media dos maiores que 15 resulta em = " + media);
		
		teclado.close();


	}

}
