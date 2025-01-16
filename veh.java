package abstraction;

interface vehicle
{
	void start();
	
	default void stop()
	{
		System.out.println("stop");
	}
	
	static void horn()
	{
		System.out.println("horn");
	}
	
	private void maintainance()
	{
		System.out.println("last routine maintainace performed");
	}
	
	default void service ()
	{
		System.out.println("vehicle serveice:yes");
		maintainance();
	}
	
	
}

class car implements vehicle
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("starting car");
	}
	
}

public class veh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		car c = new car();
		
		c.start();
		vehicle.horn();
		c.service();
		c.stop();
	}

}
