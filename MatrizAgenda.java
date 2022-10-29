import java.util.Scanner;

public class exercício4 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, j, dia, hora, mes;
		boolean sair = false, mesV = false, diaV = false, horaV = false;
		int opcao;
		
		String[][][] agenda = new String[12][31][8];
		
		do 
		{
		System.out.println("\nVocê deseja alterar ou consultar sua agenda? ");
		System.out.println("\nDigite '1' para alterar; " + "\nDigite '2' para consultar; " + "\nDigite '0' para sair: ");
		opcao = teclado.nextInt();
		
		switch(opcao)
		{
		case 1: 
			
			do 
			{
			System.out.println("\nEntre com o mês do ano: ");
			mes = teclado.nextInt();
			
			if(mes > 0 && mes <= 12)
			{
				mesV = true;
			}
			else 
			{
				mesV = false;
			    System.out.println("MÊS INVÁLIDO!!");
			}
			
			}while(mesV == false);
			
			System.out.println();
			
			do 
			{
			System.out.println("\nEntre com o dia do mês: ");
			dia = teclado.nextInt();
			
			if(dia > 0 && dia <= 31)
			{
				diaV = true;
			}
			else
			{
				diaV = false;
				System.out.println("DIA INVÁLIDO!!");
			}
			
			}while(diaV == false);
			
			System.out.println();
			
			do
			{
			System.out.println("\nEntre com a hora desejada: ");
			hora = teclado.nextInt();
			
			if(hora >= 6 && hora <= 14)
			{
				horaV = true;
			}
			else
			{
				horaV = false;
				System.out.println("HORA INVÁLIDA!!");
			}
			
			}while(horaV == false);
			
			System.out.println();
			
			mes--;
			dia--;
			System.out.println("\nEntre com o compromisso: ");
			agenda[mes][dia][hora] = teclado.next();
			
			break;
			
			
		case 2: 
			
			do 
			{
			System.out.println("\nEntre com o mês do ano: ");
			mes = teclado.nextInt();
			
			if(mes > 0 && mes <= 12)
			{
				mesV = true;
			}
			else 
			{
				mesV = false;
			    System.out.println("MÊS INVÁLIDO!!");
			}
			
			}while(mesV == false);
			
			System.out.println();
			
			
			do 
			{
			System.out.println("\nEntre com o dia do mês: ");
			dia = teclado.nextInt();
			
			if(dia > 0 && dia <= 31)
			{
				diaV = true;
			}
			else
			{
				diaV = false;
				System.out.println("DIA INVÁLIDO!!");
			}
			
			}while(diaV == false);
			
			System.out.println();
			
			do
			{
			System.out.println("\nEntre com a hora desejada: ");
			hora = teclado.nextInt();
			
			if(hora >= 6 && hora <= 14)
			{
				horaV = true;
			}
			else
			{
				horaV = false;
				System.out.println("HORA INVÁLIDA!!");
			}
			
			}while(horaV == false);
			
			
			System.out.println();
			mes--;
			dia--;
			
			System.out.println();
			
			System.out.println("\nO compromisso agendado é: ");
			
			System.out.println();
			
			System.out.println(agenda[mes][dia][hora]);
			
			break;
		case 0:
			sair = true;
			System.out.println("FIM DA EXECUÇÃO!");
			break;
		default:
				System.out.println("OPÇÃO INVÁLIDA!! ");
		}
		
		}while(sair == false);
		
		
		for(i = 0; i < agenda.length; i++)
		{
			for(j = 0; j < agenda[i].length; j++)
			{
				for(int k = 0; k < agenda[i][j].length; k++)
				{
					
				}
				
			}
		}
		
		teclado.close();
	}
}

