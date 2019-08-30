
public class CriaConta {

	public static void main(String[] args) {
		Conta Conta1 = new Conta();
		Conta1.saldo = 200.50;
		
		while (Conta1.saldo < 2.000)	{
			Conta1.saldo++;
			
			System.out.println(Conta1.saldo);
		}
		
		
	}
}
