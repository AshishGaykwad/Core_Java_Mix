package palakmadam;

public class emp {
	
	String name ;
	int contact;
	String designation;
	
	
	public emp()
	{
		name = "user";
		contact = 000;
		designation = "";
	}
	emp(String name)
	{
		this.name = name;
	}
	
	emp(String name, int contact)
	{
		this.name = name;
		this.contact = contact;
	}
	void dispaly()
	{
		System.out.println(name + " "+contact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp e1 = new emp("Rahul");
		emp e2 = new emp("xyz",123);
		
		e1.dispaly();
		e2.dispaly();
	}

}
