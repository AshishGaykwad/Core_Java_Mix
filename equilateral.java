package Akshaysir;

public class equilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1=10;
		int side2=20;
		int side3=30;
		
		if (side1==side2&&side2==side3&&side3==side1)
		{
			System.out.println("equilateral triangle");
		}
		else if (side1==side2||side2==side3||side3==side1)
		{
			System.out.println("isosceles triangle ");
		}
		else 
		{
			System.out.println("scalene triangle");
		}
	}

}
