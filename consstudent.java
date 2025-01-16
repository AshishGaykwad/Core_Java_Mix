package palakmadam;

class Student
{
	String name;
	int rollno;
	 Student()
	 {
		 name = null;
		 rollno=0;
	 }
	 Student (String name , int rollno)
	 {
		 this.name=name;
		 this.rollno=rollno;
	 }
	 void display ()
	 {
		 System.out.println("name:"+name+"Rollno"+ rollno+ "marks: ");
	 }
	 int calculatemarks (int s1, int s2, int s3, int s4)
	 {
		 this.display();
		 return s1+s2+s3+s4;
	 }
}

public class consstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student ();
		System.out.println(s1.calculatemarks(0, 0, 0, 0));
		
		Student s2 = new Student("priya",202);
		int result = s2.calculatemarks(30,40,50,15);
		System.out.println(result);
	}

}
