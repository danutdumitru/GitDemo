import java.util.List;

public class StudentList {

	public StudentList() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void listStudents2()
	{
		List<Student> lst = Student.getStudentsList();
		lst.forEach(e -> System.out.println(e.toString()));
	}

}
