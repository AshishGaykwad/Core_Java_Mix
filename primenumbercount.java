package Akshaysir;
//
//public class primenumbercount {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int cnt=0;
//		int num=100;
//		
//		for (int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//				cnt++;
//		}
//		if(cnt==2)
//		{
//			System.out.println("prime number");
//		}
//		else
//		{
//			System.out.println("not prime number");
//		}
//	}
//
//}

public class primenumbercount {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("The number of prime numbers between 1 and 100 is: " + count);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
