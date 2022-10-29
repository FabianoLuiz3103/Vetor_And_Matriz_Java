import java.util.Scanner;

public class Matri3 
{

	public static void main(String[] args) 
	{
		//Matrizes irregulares;
		
		Scanner teclado = new Scanner(System.in);
		
		int n, i, qtd, j;
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        n = teclado.nextInt();
        
        
        String[][] nomes = new String[n][];
        
        for(i = 0; i < nomes.length; i++)
        {
        	System.out.println("Entre com a quantidade de filhos: ");
        	qtd = teclado.nextInt();
        	
        	nomes[i] = new String[qtd];
        	
        	for(j = 0; j < nomes[i].length; j++)
        	{
        		System.out.println("Digite o nome do " + j + " º filho:");
        		nomes[i][j] = teclado.next();
        	}
        }
        
        System.out.println("\n");
        
        for(i = 0; i < nomes.length; i++)
        {
        	System.out.println("Pessoa " + i + " tem " + nomes[i].length + " filhos" );
        	
        	for(j = 0; j < nomes[i].length; j++)
        	{
        		System.out.println(nomes[i][j]);
        	}
        	
        	teclado.close();
        }
        
	}

}
