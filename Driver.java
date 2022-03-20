package lab3;

public class Driver {

	public static void main(String[] args) {
		Employee Em = new Employee(420);
		Manager Man = new Manager(420, 3);
		SalesEmployee SEm = new SalesEmployee(420,300);
		SalesManager SMan = new SalesManager(420, 3, 300);
		System.out.println(Man.ComputeSalary()+ " " + Man.getName());
		System.out.println(SEm.ComputeSalary()+ " " + SEm.getName());
		System.out.println(SMan.ComputeSalary()+ " " + SMan.getName());
		System.out.println(Em.ComputeSalary()+ " " + Em.getName());


	}

}
