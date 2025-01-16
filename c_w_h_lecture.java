package abstraction;

abstract class parent2
{         //abstract class
	public parent2()    //constructor
	{
		System.out.println("i am a constructor of base2");
	}
	public void sayHello()    //method
	{
		System.out.println("Hello");
	}
	abstract public void greet();      // abstract method
	abstract public void greet2();     // abstract method
}

 class child2 extends parent2
 {   // concreate class
	 public void greet()
	 {
		 System.out.println("good morning");
	 }

	@Override
	public void greet2() {
	System.out.println("good afternoon");
		
	}
 }
 
 abstract class child3 extends parent2
 {
	 public void th()
	 {
		 System.out.println("i am good");
	 }
 }
 
 

public class c_w_h_lecture {

	public static void main(String[] args) {
		
		//parent2 p = new parent2();    error throw
		child2 c = new child2();
		//child3 c = new child3(); error throw
		
		c.greet();
		c.greet2();
		c.sayHello();
		
		
	}

}
