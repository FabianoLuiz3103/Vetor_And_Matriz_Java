import java.util.Scanner;

public class vetor28 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, j;
		int[] vetA = new int[5];
		
		for(i = 0; i < vetA.length; i++) {
			
			System.out.println("Informe o " + i + " º valor para A: ");
			vetA[i] = teclado.nextInt();
			
			
		}
		
		
		
		for(i = 0; i < vetA.length; i++) {
			
			System.out.println("-------------------");
			for(j = 1; j <= 10; j++) {
				
				System.out.println(vetA[i] + " x " + j + " = " + vetA[i] * j);
			}
		}
		
		teclado.close();
	}

}
