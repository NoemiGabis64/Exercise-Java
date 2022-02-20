package URI;

public class TestSchool{
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Carlos",12344);

		TeacherTraining teacher1 = new TeacherTrainig("José", "Graduate");
		TeacherTraining teacher2 = new TeacherTrainig("Maria", "Master");
		TeacherTraining teacher3 = new TeacherTrainig("Julia", "Doctor");

		Disciplines Mathematics = new Disciplines("Mathematics", student, teacher1);
		Disciplines English = new Disciplines("English", student, teacher2);
		Disciplines Physics = new Disciplines("Pysics", student, teacher3);

		Mathematics.ThrowNotes(6.5f, 5.0f, 7.0f, 4.5f);
		Mathematics.CalculateAverage();

		English.ThrowNotes(8f, 9f, 7.0f, 4.5f);
		English.CalculateAverage();

		Physics.ThrowNotes(2.5f, 5.0f, 7.0f, 4.5f);
		Physics.CalculateAverage();
	}

}