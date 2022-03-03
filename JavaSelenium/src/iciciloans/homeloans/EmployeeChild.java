package iciciloans.homeloans;

public class EmployeeChild extends Employee//extends forinharitance
{
	String City;
	//right click under cls > sours > generate constructor using field
	public EmployeeChild(String city) {
		super(1,"mama",10.34f);
		City = city;
		System.out.println(this.City);
	}    //we cant use this. super .keyword inside static method, use -inside constrpctur
	public void m5()
	{
	//this.
	}

	public static void main(String[] args) {
		EmployeeChild ec = new EmployeeChild(" hyderabad");

	}

}
