/*create a class name electronic device with a method power on create another class smartphone 
that is extending electronic device and has a method make call . crater another class name 
android phone which is the devived class that extends smart phone class and has a method run 
android app create a object of android phone class and execute the method*/


package palakmadam;

class eledevice
{
	void poweron()
	{
		System.out.println("this is power on method");
	}
}

class smartphone extends eledevice
{
	void makecall ()
	{
		System.out.println("this is method make call");
	}
}

class androidphone extends smartphone
{
	void androidapp ()
	{
		System.out.println("this is method android app ");
	}
}



public class Exce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		androidphone a1 = new androidphone();
		a1.androidapp();
		a1.makecall();
		a1.poweron();
	}

}
