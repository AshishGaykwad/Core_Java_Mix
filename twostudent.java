package palakmadam;

public class twostudent 
	{
		String name;
		int id;
		String email;
	
	twostudent(String s ,int i , String e)
	{
		name = s;
		id = i;
		email=e;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		twostudent s1 = new twostudent("pankaj",23,"abc");
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.email);
		
		twostudent s2 = new twostudent("rohan",22,"xyz");
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.email);
		
	}

}
