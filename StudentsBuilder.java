package Assignment7;

public class StudentsBuilder {

	private int id;
	private String name;
	private String email;
	private long mobileNum;
	
	
	
	
//..............Student with default Credentials................
	
	public StudentsBuilder() {
		this.id= 0;
	    this.name = "N/A";
	    this.email = "N/A" ;
	    this.mobileNum = 0 ;
	}
	
//..............Student with all Credentials...................
	
    public StudentsBuilder(int id, String name, String email, long mobileNum) {
	    this.id= id;
	    this.name = name;
	    this.email = email;
	    this.mobileNum = mobileNum;
	}
    
//..............Student without Mobile Number...................
    
    public StudentsBuilder(int id, String name, String email) {
	    this.id= id;
	    this.name = name;
	    this.email = email;
	    this.mobileNum = 0 ;
	}
    
//..............Student without Email............................
    
    public StudentsBuilder(int id, String name, long mobileNum) {
	    this.id= id;
	    this.name = name;
	    this.email = "N/A" ;
	    this.mobileNum = mobileNum;
	}

    
    
//..............Method to Show Credentials.......................
    
    public void showCredentials() {
    	System.out.println(this.id);
    	System.out.println(this.name);
    	System.out.println(this.email);
    	System.out.println(this.mobileNum);
    }
	
    public void space() {System.out.println();}
	
}
