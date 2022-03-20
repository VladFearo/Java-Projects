package lab3;

public class SalesEmployee extends Employee implements Sale
{
	private float commis;
	public SalesEmployee(float salary, float commis)
	{
		super(salary);
		this.commis = commis;
	}
	public float ComputeSalary()
	{
		return super.ComputeSalary()*(1+1/this.commis);
	}
	@Override
	public float getCom() {
		return this.commis;
	}
	@Override
	public String getSaleName() {
		return "SalesEmployee";
	}


}
