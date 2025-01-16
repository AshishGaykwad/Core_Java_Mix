package palakmadam;

public class nonStaticEx
	{
		public void sum(int x,int y,int z)
		{
			int result=x+y+z;
			System.out.println(result);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		nonStaticEx obj = new nonStaticEx();
		obj.sum(10,20,30);
		
	}

}

