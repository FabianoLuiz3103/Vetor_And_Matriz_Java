import java.util.Scanner;

public class JogoVelha 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
			int i, j, linha=0, coluna=0, jogada = 1;
		
		char sinal;
		
			boolean ganhou = false, liV = false, coV = false;
			
		char[][] velha = new char[3][3];

		System.out.println("    |         |");
		System.out.println("    |         |");
		System.out.println("----|---------|----");
		System.out.println("    |         |");
		System.out.println("    |         |");
		System.out.println("    |         |");
		System.out.println("----|---------|----");
		System.out.println("    |         |");
		System.out.println("    |         |");
		
		
		do
		{
			
			if(jogada % 2 == 1)
			{
				System.out.println("Jogador 1: ");
				sinal = 'x';
			}
			else 
			{
				System.out.println("Jogador 2: ");
				sinal = 'o';
			}
		
			do
			{
				System.out.println("Entre com a lnha (1, 2 ou 3): ");
				linha = teclado.nextInt();
				
				if(linha > 0 && linha <= 3)
				{
					liV = true;
				}
				else
				{
					liV = false;
					System.out.println("LINHA INVÁLIDA!!");
				}
				
			}while(liV == false);
			
			do
			{
				System.out.println("Entre com a coluna (1, 2 ou 3): ");
				coluna = teclado.nextInt();
				
				if(coluna > 0 && coluna <= 3)
				{
					coV = true;
				}
				else
				{
					coV = false;
					System.out.println("COLUNA INVÁLIDA!!");
				}
				
			}while(coV == false);
			
			linha--;
			coluna--;
			if(velha[linha][coluna] == 'x' || velha[linha][coluna] == 'o')
			{
				System.out.println("POSIÇÃO JÁ USADA!");
			}
			else
			{
				velha[linha][coluna] = sinal;
				jogada++;
			}
			
			for(i = 0; i < velha.length; i++)
			{
				for(j = 0; j < velha[i].length; j++)
				{
					System.out.print(velha[i][j] + " | ");
				}
				
				System.out.println("  ");
			}
			
			     if((velha[0][0] == 'x' && velha[0][1] == 'x' && velha[0][2] == 'x')||  //linha 1
					(velha[1][0] == 'x' && velha[1][1] == 'x' && velha[1][2] == 'x')||  //linha 2
					(velha[2][0] == 'x' && velha[2][1] == 'x' && velha[2][2] == 'x')||  //linha 3
					(velha[0][0] == 'x' && velha[1][0] == 'x' && velha[2][0] == 'x')||  //coluna 1
					(velha[0][1] == 'x' && velha[1][1] == 'x' && velha[2][1] == 'x')||  //coluna 2
					(velha[0][2] == 'x' && velha[1][2] == 'x' && velha[2][2] == 'x')||  //coluna 3
					(velha[0][0] == 'x' && velha[1][1] == 'x' && velha[2][2] == 'x'))   //diagonal
				{
			    	ganhou = true;
			    	System.out.println("PARABÉNS, JOGADOR 1!! ");
				
			}
			     
			     else if((velha[0][0] == 'o' && velha[0][1] == 'o' && velha[0][2] == 'o')||  //linha 1
						(velha[1][0] == 'o' && velha[1][1] == 'o' && velha[1][2] == 'o')||  //linha 2
						(velha[2][0] == 'o' && velha[2][1] == 'o' && velha[2][2] == 'o')||  //linha 3
						(velha[0][0] == 'o' && velha[1][0] == 'o' && velha[2][0] == 'o')||  //coluna 1
						(velha[0][1] == 'o' && velha[1][1] == 'o' && velha[2][1] == 'o')||  //coluna 2
						(velha[0][2] == 'o' && velha[1][2] == 'o' && velha[2][2] == 'o')||  //coluna 3
						(velha[0][0] == 'o' && velha[1][1] == 'o' && velha[2][2] == 'o'))   //diagonal
			             {
			            	 ganhou = true;
			            	 System.out.println("PARABÉNS, JOGADOR 2!! ");
			             }
			     else if (jogada > 9)
			     {
			    	 ganhou = true;
			    	 System.out.println("DEU VELHA! ");
			    	 
			     }
			
		
		}while(ganhou == false);
		
		
		teclado.close();
	}

}
