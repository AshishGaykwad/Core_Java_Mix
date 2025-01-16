package palakmadam;

public class twoconstructor 
{
		String name;
		int id;
		String email;
		
		twoconstructor (String name , int id , String email)
		{
			this.name = name;
			this.id = id;
			this.email=email;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoconstructor t1 =new twoconstructor("pankaj",101,"abc@email.com");
		
		System.out.println(t1.name);
		System.out.println(t1.id);
		System.out.println(t1.email);
	}

}
