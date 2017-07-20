	import java.util.ArrayList;
	import java.util.List;
	
	public class Student {

		private String name;
		private int age;
		private Gender gender;
		//teste2
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		public Student(String name, int age, Gender gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		
		public static List<Student> getStudentsList()
		{
			List<Student> studentList = new ArrayList<>();
			
			studentList.add(new Student("Danut", 40, Gender.MALE));
			studentList.add(new Student("Mirela", 38, Gender.FEMALE));
			studentList.add(new Student("Mihai", 33, Gender.MALE));
			studentList.add(new Student("Gigi", 25, Gender.MALE));
			return studentList;
		}
		
	}

