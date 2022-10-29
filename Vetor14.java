import java.util.Scanner;

public class Vetor14 
{
    public static final int IDADE = 35;
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, sup = 0, men = 0;
		
		int[] vetA = new int[10];
		
		for(i = 0; i < vetA.length; i++) 
		{
			System.out.println("INFORME A " + (i+1) + " º IDADE: ");
			vetA[i] = teclado.nextInt();
			
			if(vetA[i] > IDADE) 
			{
			    sup++;	
			}
			else
				men++;
			
		}
		
		System.out.println("\nA quantidade de pessoas com mais de 35 anos é: " + sup);
		
		System.out.println("\nA quantidade de pessoas com menos de 35 anos é: " + men);
		
		teclado.close();

	}

}
