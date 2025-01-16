package palakmadam;
class N
{
	int i=1000;    //super keyword
}
class M extends N
{
	int i=12;       //this keyword
	
	void show ()
	{
		int i=34;         
		System.out.println(super.i);
	}
}

public class super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M obj = new M();
		obj.show();
	}

}
