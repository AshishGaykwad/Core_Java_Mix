package oops;
class fibonacci

{
	void fibo()
	{
		int n = 10;
		int a = 0; 
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 3; i<=n ; i++)
		{
			int c = a + b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
class prime extends fibonacci
{
	void p()
	{
		int num = 3;
		 int cnt=0 ;
		 for (int i = 1 ; i<=num;i++)
		 {
			 if (num%i==0)
			 {
				cnt++;
			 }
		 }
		 if (cnt==2)
		 {
			 System.out.println("prime number");
		 }
		 else
		 {
			 System.out.println("not prime number");
		 }
	}
	
}
class evenodd extends prime
{
	void e ()
	{
		int num = 2;
		if (num%2==0)
		{
			System.out.println("even number ");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}

public class fibonaccicons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenodd e1=new evenodd();
		e1.e();
		e1.p();
		e1.fibo();
		
	}

}
