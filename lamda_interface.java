package abstraction;

interface I4{
	void show(int a, int b);
}

public class lamda_interface {

	public static void main(String[] args) {
		
		I4 i = (a,b) -> {
			System.out.println("hello world "+(a+b));
		};
		
		i.show(12,4);

	}

}
