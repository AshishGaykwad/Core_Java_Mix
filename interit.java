package abstraction;

interface I
{
	void m1();
}

interface I2
{
	void m2();
}

interface I3 extends I,I2
{
	void m3();
}

class test implements I3
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("from I1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("from I2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("from I3");
	}


	
}

public class interit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t = new test();
		t.m1();
		t.m2();
		t.m3();
		
	}

}
