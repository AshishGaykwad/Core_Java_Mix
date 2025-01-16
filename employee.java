package palakmadam;

public class employee 
	{
		String name;
		int id;
		String email;
		String roll;
		double salary;
	
		employee(String s ,int i , String e,String r,double sal)
	{
		name = s;
		id = i;
		email=e;
		roll=r;
		salary=sal;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		employee e1 = new employee("abc",23,"abc@gmail.com","manager",50000);
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.email);
		System.out.println(e1.roll);
		System.out.println(e1.salary);
		
		employee e2 = new employee("pqr",22,"pqr@gmail.com","developer",30000);
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.email);
		System.out.println(e2.roll);
		System.out.println(e2.salary);
		
		employee e3 = new employee("xyz",22,"xyz@gmail.com","analyst",35000);
		System.out.println(e3.name);
		System.out.println(e3.id);
		System.out.println(e3.email);
		System.out.println(e3.roll);
		System.out.println(e3.salary);
		
		employee e4 = new employee("efg",22,"efg@gmail.com","designer",25000);
		System.out.println(e4.name);
		System.out.println(e4.id);
		System.out.println(e4.email);
		System.out.println(e4.roll);
		System.out.println(e4.salary);
		
		employee e5 = new employee("rst",22,"rst@gmail.com","tester",40000);
		System.out.println(e5.name);
		System.out.println(e5.id);
		System.out.println(e5.email);
		System.out.println(e5.roll);
		System.out.println(e5.salary);
		
	}

}
