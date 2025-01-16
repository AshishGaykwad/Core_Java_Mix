package abstraction;

class Ob{
	synchronized void display(){
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class A3 extends Thread{
	Ob ob;
	
	A3(Ob ob){
		this.ob = ob;
	}
	public void run() {
		ob.display();
	}
}

class B3 extends Thread{
	Ob ob;
	
	B3(Ob ob){
		this.ob = ob;
	}
	public void run() {
		ob.display();
	}
}


public class object_level_syn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ob ob = new Ob();
		
		A3 a1 = new A3(ob);
		B3 b1 = new B3(ob);
		a1.setName("A1 Thread");
		b1.setName("B1 Thread");
		a1.start();
		b1.start();
		
	}

}
