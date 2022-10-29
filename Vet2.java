import java.util.Scanner;

public class Vet2
{

	public static void main(String[] args)
	{
		
		//B[i] = A[i] * 2;
		Scanner teclado = new Scanner(System.in);
		
		 int i;
		
         int[] vetA = new int[8];
         int[] vetB = new int[8];
         
         for(i = 0; i < vetA.length; i++) 
         {
        	 
        	 System.out.println("Informe o " + i + " º número: ");
        	 vetA[i] = teclado.nextInt();
         }
         
         for(i = 0; i < vetA.length; i++) 
         {
             
        	 vetB[i] = vetA[i] * 2;
        	 
         }
         
         System.out.print("Vetor A = ");
         for(i = 0; i < vetA.length; i++) 
         {
        	 System.out.print(vetA[i] + " ");
         }
         
         System.out.println();
         
         System.out.print("Vetor B = ");
         for(i = 0; i < vetB.length; i++) 
         {
        	 System.out.print(vetB[i] + " ");
         }
         
         System.out.println();
		
         teclado.close();
		
	}

}
