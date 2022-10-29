import java.util.Scanner;

public class Vetor16 
{
    public static final double MEDIA = 7.0;
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int[] alunos = new int[10];
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		for(i = 0; i < alunos.length; i++)
		{
			
			System.out.println("\nInforme a nota 1 do " + (i+1) + " º aluno: ");
			nota1[i] = teclado.nextDouble();
			
		}
		
		for(i = 0; i < alunos.length; i++)
		{
			System.out.println("\n\nInforme a nota 2 do " + (i+1) + " º aluno: ");
			nota2[i] = teclado.nextDouble();
		}
		
		for(i = 0; i < alunos.length; i++)
		{
			result[i]= (nota1[i] + nota2[i])/ 2;
			
			System.out.println("\nA média do " + i + " º aluno é: " + result[i]);
			
			if(result[i] >= MEDIA)
			{
			    System.out.print("\n >>>>> APROVADO!! <<<<<< ");	
			}
			else
				System.out.println("\n >>>>> REPROVADO!! <<<<<<< ");
			
		}

		teclado.close();
	}

}
