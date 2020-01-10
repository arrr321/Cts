package comm.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



	public class Student {

		String firstName, lastName;
		int studentID = 0;
		double GPA = 0.0;

		public Student(String firstName, String lastName, int studentID, double GPA) {
			if (firstName == null || lastName == null || studentID == 0 || GPA == 0.0)
				throw new NullPointerException();
			this.firstName = firstName;
			this.lastName = lastName;
			this.studentID = studentID;
			this.GPA = GPA;
		}

		public String firstName() {
			return firstName;
		}

		public String lastName() {
			return lastName;
		}

		public int studentID() {
			return studentID;
		}

		public double GPA() {
			return GPA;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getStudentID() {
			return studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		public double getGPA() {
			return GPA;
		}

		public void setGPA(double gPA) {
			GPA = gPA;
		}

		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
		
	}
