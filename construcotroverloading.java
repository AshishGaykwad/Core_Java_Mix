package palakmadam;

public class construcotroverloading {
	
	String name;
	int uid;
	
	construcotroverloading()
	{
		name = "user";
		uid=000;
		
	}
	construcotroverloading(String name)
	{
		this.name=name;
	}
	construcotroverloading(String name, int id)
	{
		this.name= name;
		this.uid= uid;
	}
		void dispaly()
		{
			System.out.println(name+" "+uid);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		construcotroverloading p1=new construcotroverloading("ashish");
		
		construcotroverloading p2=new construcotroverloading("xyz",101);
		
		p1.dispaly();
		p2.dispaly();
		
	}

}
