package URI;

/**For the class "Discipline" declare the attributes 'name' (text), 'student' (Student), 'teacher'
(Teacher), 'grade1' (real number), 'grade2' (real number), 'grade3' (real number), 'grade4'
(real number), 'average' (real number), 'aprovacao' (text). */

public class Subject {
	
	String name;
	Student carlos;
	Teacher teacher;
	double grade1;
	double grade2;
	double grade3;
	double grade4;
	double avarege;
	String approved;

	/**For the class "Course" create a constructor that receives as parameters the name of the
	an object of type Student and an object of type Teacher. Initialize the attribute
	as 'Fail' and all other attributes (grades and average) with zero. */

	public Disciplines (String name, Student student, Teacher teacher) {
		this.name = name;
		this.student = carlos;
		this.teacher = teacher;
		this.approved = "DISAPPROVED";
		this.grade1 = 0;
		this.grade2 = 0;
		this.grade3 = 0;
		this.grade4 = 0;
		this.avarege = 0;
	}

	/**(class Discipline) Method called "lancarNota" which returns nothing and receives as parameters
	four grades as parameters. Pass the received notes as parameters to the
	grades attributes of the class. Print the following message on the screen: */

	public ThrowNotes (double grade1, double grade2, double grade3, double grade4) {
		this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
		
		System.out.printf("Grades successfully posted for the student", student , "in the discipline", name,"! \r\n"
				+ "");
	}

	/** (class Discipline) Method called "calculateAverage" that returns nothing and receives no
	parameter. Calculate the student's average in the subject according to the IFMT formula and
	and store it in the 'average' attribute. Print the message below on the screen: */
		
	public void CalculateAverage() {

		avarege = (grade1 + grade2 + grade3 + grade4) /4;
		
		System.out.printf("Calculated average! The student", carlos ,"averaged", avarege , "in the discipline of", name ,", under the responsibility of the lecturer ", teacher,". ");
		
		
		if(avarege >= 6) {
			approved = "APPROVED";
			carlos.nummer_Subject_Approved++;
		}else {
			approved = "DISAPPROVED";
			carlos.nummer_Subject_Disapproved++;
		}
	}
	
	/**From the calculated student's average, check with a conditional
	if it is greater than or equal to six. If it is TRUE, change the attribute
	'pass' attribute to 'Pass' and add 1 to the student's 'passed_grades' attribute. At
	case FALSE, add 1 to the student's 'disapproved_grades' attribute */
}
