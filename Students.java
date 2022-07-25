package week3.assignment4;

public class Students {

	public static void getStudentInfo(int id) {

		System.out.println("Student Information for the ID: " + id);

	}
	public static void getStudentInfo(int id, String name) {

		System.out.println("ID: " + id );
		System.out.println("Name: " + name);
	}
	public static void getStudentInfo(String email, String phonenumber) {

		System.out.println("Email: "+ email);
		System.out.println("PhoneNumber: "+ phonenumber);
	}	

	public static void main(String[] args) {

		int id = 3695;
		String name = "Jagavi P.R";
		String email = "rajialagar@gmail.com";
		String ph = "9578636345";
		getStudentInfo(id);
		getStudentInfo(id,name);
		getStudentInfo(email,ph);

	}

}


