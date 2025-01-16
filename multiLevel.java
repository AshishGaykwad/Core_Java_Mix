package palakmadam;

class person
{
	String name;
	int id;
	
	public person (String name, int id )
	{
		this.name=name;
		this.id=id;
	}
}

class employe extends person
{
	String dept;
	
	public employe (String name, int id, String dept)
	{
		super (name, id);
		this.dept=dept;
	}
}
class manager extends employe
{
	int teamSize;
	manager(String name,int id,String dept,int teamSize)
	{
		super(name,id,dept);
		this.teamSize = teamSize;
	}
	
	void dispaly()
	{
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("dept: "+dept);
		System.out.println("teamSize: "+teamSize);
		
	}
}
public class multiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		manager m1 = new manager("xyz",101,"IT",100);
		m1.dispaly();
		
	}

}
