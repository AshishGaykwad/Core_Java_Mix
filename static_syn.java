package abstraction;

class Obj{
	static synchronized void display(){
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class A4 extends Thread{
	
	
	public void run() {
		Obj.display();
	}
}

class B4 extends Thread{
	
	
	public void run() {
		Obj.display();
	}
}


public class static_syn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Obj obj = new Obj();
		
		A4 a1 = new A4();
		B4 b1 = new B4();
		a1.setName("A1 Thread");
		b1.setName("B1 Thread");
		a1.start();
		b1.start();
		
	}

}
