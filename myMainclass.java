package abstraction;

abstract class area
{
	abstract void calculateArea();
}

class rect extends area
{
	void calculateArea()
	{
		int l=10;
		int b=20;
		int area=l*b;
		System.out.println(area);
	}
}

class square extends area
{
	void calculateArea()
	{
	int side=50;
	int area = side*side;
	System.out.println(area);
	}
	
}
class circle extends area
{
	void calculateArea()
	{
	float pi=3.14f;
	int r=20;
	float area = pi*r*r;
	System.out.println(area);
	}
	
}
public class myMainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rect r1= new rect();
		square sq = new square();
		circle cir = new circle();
		
		r1.calculateArea();
		sq.calculateArea();
		cir.calculateArea();
	}

}