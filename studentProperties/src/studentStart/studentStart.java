package studentStart;

public class studentStart {

	public static void main(String[] args) {
		
		studentProperties student1 = new studentProperties(); 
		student1.setFirstName("Kyle");
		student1.setLastName("Stankovich");
		student1.setId(990675963);
		student1.setMajor("Software development");
		
		System.out.println(student1.getFirstName() + " "
		+ student1.getLastName()+ " has the student ID number "
		+ student1.getId()+ " and his major is "
		+ student1.getMajor());
		
		
		
		
		
	}

}
