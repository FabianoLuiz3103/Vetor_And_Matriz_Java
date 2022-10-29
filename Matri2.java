import java.util.Scanner;

public class Matri2 
{

	public static void main(String[] args) 
	{
		// MATRIZ TRÊS DIMENSÕES;
		
		Scanner teclado = new Scanner(System.in);
		
		int i, j, k, soma, somp, somi;
		int[][][] mtri = new int [3][3][3];
		
		for(i = 0; i < mtri.length; i++)
		{
			for(j = 0; j < mtri[i].length; j++)
			{

				for(k = 0; k < mtri[i][j].length; k++)
				{
					System.out.println(  i + "   " + j + "   " + k);
					mtri[i][j][k] = i + j + k;
				}
			}
		}
		
		System.out.println("\n");
		
		soma = 0;
		somp = 0;
		somi = 0;
		for(i = 0; i < mtri.length; i++)
		{
			for(j = 0; j < mtri[i].length; j++)
			{

				for(k = 0; k < mtri[i][j].length; k++)
				{
					soma = soma + mtri[i][j][k];
					
					if(mtri[i][j][k] % 2 == 0 )
					{
						somp = somp + mtri[i][j][k];
					}
					else
					{
						somi = somi + mtri[i][j][k];
					}
				}
			}
		}
		
		System.out.println("\nA soma dos termos = " + soma);
		
		System.out.println("\nA soma dos pares = " + somp);
		
		System.out.println("\nA soma dos ímpares = " + somi);
		
	}

}
