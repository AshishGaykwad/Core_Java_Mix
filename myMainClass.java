package ExceptionHandling;



class invalidGrade  extends Exception
{
	
}

class emptyGradeList extends Exception
{
	
}

class invalidGradingException extends Exception
{
	
}

class studentGradingSystem 
{
	int totalGrades ;
	int totalSum ;
	
	studentGradingSystem ()
	{
		this.totalSum=0;
		this.totalGrades=0;
	}
	
	public void addGrade(int grade) throws invalidGradingException {
        if (grade < 0 && grade > 100)
        {
           
        	throw new invalidGradingException();
        	
        }
        totalSum = totalSum + grade;
    	totalGrades = totalGrades + 1;
    }
	
	public double calavg () throws emptyGradeList
	{
		if (totalGrades==0)
		{
			
			throw new emptyGradeList();
		}
		
		
	return totalGrades;
	}
	
	public void removeGrade (int index) throws  invalidGradingException
	{
		if(index < 0 || index >= totalGrades)
		{
			throw new invalidGradingException();
		}
	}
}

public class myMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
