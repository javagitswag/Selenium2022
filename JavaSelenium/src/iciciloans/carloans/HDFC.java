package iciciloans.carloans;

public class HDFC implements Rbi{

	public static void main(String[] args ) {
		HDFC h=new HDFC();
		h.withdrowl();
		h.deposit();
		
}

	@Override
	public void withdrowl() {
		System.out.println("i am overriden withdrowl in HDFC");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit in HDFC");
		
	}
}
