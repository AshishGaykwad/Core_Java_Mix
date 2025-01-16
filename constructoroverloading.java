package palakmadam;

class Employee
{
	String name;
	int id;
	float salary;
	
	Employee()
	{
		
	}
	Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	Employee(String name, int id, float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(name + " "+ id + " "+ salary);
	}
}

public class constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("ABC",101);
		Employee e3 = new Employee("XYZ",102,25000);
		e1.display();
		e2.display();
		e3.display();
		
	}

}
