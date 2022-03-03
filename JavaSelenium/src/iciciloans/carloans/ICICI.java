package iciciloans.carloans;

public class ICICI implements Rbi 
{
	public static void main(String[] args) {
		ICICI i=new ICICI();
		i.withdrowl();
		i.deposit();
		
	}

	@Override
	public void  withdrowl()  {
		System.out.println("i am overriden withdrowl in ICICI ");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit in ICICI ");
		
		
	}

	
   }