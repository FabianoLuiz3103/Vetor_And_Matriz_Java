import java.util.Scanner;
import java.text.DecimalFormat;

public class Vetor17 
{

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		int i =0;
		double cot;
		double[] vetA = new double[20];
		
		
		System.out.println("Informe a cota��o do d�lar em rela��o ao real: ");
		cot = teclado.nextDouble();
		
		for(i = 0; i < vetA.length; i++)
		{
			
			vetA[i] = cot * (i+1);
			
			
		}
		
		System.out.println("\nCOTA��O: ");
		for(i = 0; i < vetA.length; i++)
		{
			System.out.println(" A cota��o do d�lar no valor de US$ " + (i+1) + " �: " + new DecimalFormat("R$ #,##0.00").format(vetA[i]));
			//System.out.println(new DecimalFormat("#,##0.00").format(vetA[i])); 
			
		}
		
		teclado.close();

	}

}
