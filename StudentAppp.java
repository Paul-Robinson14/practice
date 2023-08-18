import java.util.Scanner;

public class StudentAppp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the name ");
		s1.name = scan.nextLine();
		System.out.println("Enter the Roll no ");
		s1.rollNumber = scan.nextInt();
		System.out.println("Enter the CGPA ");
		s1.cgpa = scan.nextDouble();
		s1.study();
		s1.markAttendance();
		Student s2= new Student();
		System.out.println("Enter the name of the Staff");
		s2.name=scan.nextLine();
		s2.name=scan.nextLine();
		System.out.println("Enter the class");
		s2.rollNumber=scan.nextInt();
		System.out.println("Enter the staff id");
		s2.cgpa=scan.nextDouble();
		s2.study();
		scan.close();
	}

}
