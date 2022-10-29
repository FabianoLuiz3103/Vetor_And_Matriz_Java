package Java.Nano;

public class TesteBanco
{

	public static void main(String[] args) 
	{
		Banco1 cc = new Banco1(321, 5600, 2000);
		if(cc != null) {
			
			//double valor = cc.saldo;
			
			cc.Depositar(50.0);
			
			cc.Retirar(1500);
			
			System.out.println(cc.getSaldo());
		}
		
		
		
		
		Banco1 poupança = new Banco1(111, 222, 1000);
		
		poupança.Retirar(10000);
		
		System.out.println("O saldo da poupança é: " + poupança.getSaldo());

		System.out.println("\nO saldo da conta corrente é: " + cc.getSaldo());
		
		
	}

}
