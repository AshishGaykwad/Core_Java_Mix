package multithreading;

class table extends Thread
{
	public void run()
	{
		int num = 5;
		for (int i = 1; i <= 10; i++)
		{
			
			System.out.println(num*i);
		}
	}
}

class prime extends Thread
{
	public void run()
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

class pali extends Thread
{
	public void run()
	{
		int num = 12321;
		int temp = num ;
		int revnumber = 0;
		
		while (num>0)
		{
			int digit = num % 10;
			revnumber = revnumber * 10 + digit;
			num = num / 10;
		}
		if (temp == revnumber)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}
	}
}

class harshad extends Thread
{
	public void run()
	{
		int num=171;
		int temp=num;
		int sum=0;
		
		while(num>0)
		{
			
			int rem= num%10;
			sum=sum+rem;
			num=num/10;
		}
		if (temp%sum==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not harshad number");
		}
	}
}

public class table_prime_pali_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		table t1 = new table();
		t1.start();
		
		prime p1 = new prime ();
		p1.start();
		
		pali pa1 = new  pali();
		pa1.start();
		
		harshad h1 = new harshad();
		h1.start();
		
	}

}
