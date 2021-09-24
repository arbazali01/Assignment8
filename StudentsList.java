package Assignment7;



public class StudentsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentsBuilder st1 = new StudentsBuilder();
		   st1.showCredentials();
		   st1.space();
		
		StudentsBuilder st2 = new StudentsBuilder(1, "Arbas", "arb@gmail.com", 9951012345l);
	       st2.showCredentials();
	       st2.space();
		
		
		StudentsBuilder st3 = new StudentsBuilder(2,"Armaan", "arm@gmail.com");
		   st3.showCredentials();
		   st3.space();
		
		StudentsBuilder st4 = new StudentsBuilder(4, "Arham", 8978812345l);
		   st4.showCredentials();
		   st4.space();
	}

}
