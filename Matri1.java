import java.util.Scanner;

public class Matri1 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, j;
		double soma = 0;
		double media = 0;
        double[][] notas = new double [3][4];
        //[linhas][colunas];
        
        //primeiro aluno.
        notas[0][0] = 10;
        notas[0][1] = 7;
        notas[0][2] = 8.5;
        notas[0][3] = 8;
        
        //segundo aluno.
        notas[1][0] = 9;
        notas[1][1] = 6;
        notas[1][2] = 9.5;
        notas[1][3] = 10;
        
        //terceiro aluno.
        notas[2][0] = 5;
        notas[2][1] = 7;
        notas[2][2] = 6.5;
        notas[2][3] = 9;
        
        for(i = 0; i < notas.length; i++)
        {
        	for(j = 0; j < notas[i].length; j++)
        	{
        		System.out.print(notas[i][j] + " - ");
        	}
        	System.out.println("\n");
        }
        
        //mudando célula da matriz;
        
        notas[1][3] =8;
        
        System.out.println("\n");
        
        for(i = 0; i < notas.length; i++)
        {
        	for(j = 0; j < notas[i].length; j++)
        	{
        		System.out.print(notas[i][j] + " - ");
        	}
        	System.out.println("\n");
        }  
        
        //calculando média de cada aluno;
        
        System.out.println("Calculando a média de cada aluno: ");
        for(i = 0; i < notas.length; i++)
        {
        	soma = 0;
        	for(j = 0; j < notas[i].length; j++)
        	{
        		soma = soma + notas[i][j];
        		media = soma / 4;
        		
        	}
        	System.out.println("Média do aluno " + i + " é = " + media );
        }
        
        //arrays de arrays;
        
        double[] notas1 = {7, 8, 9, 10};
        double[][] notas2 = {{7, 8, 9, 10}, {6, 5, 7, 10}};
        
        System.out.println("\n");
        
        for(i = 0; i < notas2.length; i++)
        {
        	for(j = 0; j < notas2[i].length; j++)
        	{
        		System.out.print(notas2[i][j] + " - ");
        	}
        	System.out.println("\n");
		
	    }
        

}
}
