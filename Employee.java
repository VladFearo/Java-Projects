package lab3;

public class Employee {

	
	private float salary;
	public Employee(float salary)
	{
		this.salary = salary;
	}
	public float ComputeSalary()
	{
		return this.salary;
	}
	public String getName() { return "Employee"; }
	
}
