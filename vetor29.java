import java.util.Scanner;

public class vetor29 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, divs, cont=0;
		int[] vetA = new int[5];
		
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println("INFORME O " + i + " º VALOR DE A: ");
			vetA[i] = teclado.nextInt();
			
		}
		
		boolean primo;
		String msg;
		
		for(i = 0; i < vetA.length; i++)
		{
			primo = true;
			
			for(divs = 2; divs < vetA[i]; divs++) 
			{
				if(vetA[i] % divs == 0) {
					
					primo = false;
					break;
				}
			}
			
			if(primo) {
				
				msg = "primo";
			}
			else
				msg="não é primo";
			
			System.out.println(vetA[i] + " " + msg);
		}
		
		teclado.close();

	}

}
