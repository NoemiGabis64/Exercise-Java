package URI.Builders.School;

/** For the class "Student" declare the attributes 'name' (text), 'enrollment' (long integer),
passed_grades' (long integer), 'approved_grades' (long integer) and 'renewed_grades' (long integer); */

public class Student{
	
	String name;
	int registration;
	int nummer_Subject_Approved = 0;
	int nummer_Subject_Disapproved = 0;

	/**For the class "Student" create a constructor that takes as parameters the name and the enrollment
	of the student and pass their values to the attributes of the class. The other two attributes of the
	class attributes must be initialized with zero; */

	public Student(String name, int registration){
		this.name = name;
		this.registration = registration;
	}
	
	/**(class Student) Method called "displayResult" that returns nothing and receives no
	parameter. Print the following message on the screen: */

	public displayResult() {
		System.out.printf("The student", name ," was approved in ", nummer_Subject_Approved ,"subject(s) and failed", nummer_Subject_Disapproved ,"discipline(s). ");
	}
}
