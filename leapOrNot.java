package Akshaysir;

public class leapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1923;
		
		if (year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}
