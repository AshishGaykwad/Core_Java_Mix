package palakmadam;

class T
{
	String name ;
	int id;
	float marks;
	
	T(String n , int i, float m)
	{
		name = n;
		id = i;
		marks = m;
	}
}
class Z extends T
{
	Z (String name, int id, float marks)
	{
		super (name , id, marks);
	}
	
	void display ()
	{
		System.out.println(name + " " + id + " " + marks +" ");
	}
}
public class Extendex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z t1 = new Z("abc",5,36.5f);
		t1.display();
		
	}

}
