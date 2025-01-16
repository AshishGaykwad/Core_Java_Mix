//


package palakmadam;

class perimeter
{
	void peri(int side)  // peri of squre 4*side
	{
		System.out.println(4*side);
	}
	void peri(int l, int b) //peri of tringle
	{
		System.out.println(2+l*b);
	}
	void peri(int side1, int side2, int side3)
	{
		System.out.println(side1+side2+side3);
	}
}

public class peri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		perimeter p = new perimeter();
		p.peri(5);
		p.peri(2, 10);
		p.peri(10,20, 30);

	}

}
