package iciciloans.carloans;

public interface Rbi {
int x=100;
public void withdrowl();
public void deposit();
public static void main(String[] args) {
	//Rbi i=new Rbi();
	Rbi i; // polymorphisom 
	i= new ICICI();
	i.withdrowl();		
	i.deposit();
	
	i= new HDFC();
	i.withdrowl();		
	i.deposit();
	
	
	
}
}
