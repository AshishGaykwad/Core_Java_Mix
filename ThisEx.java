package palakmadam;

class test
{
	int x = 56;
	String name = "rahul";
	

void method (int x)
{
	String name = "pankaj";
	System.out.println(this.x+""+x);
	System.out.println(this.name+" "+name);
}
}
public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		t.method(7);
	}

}
