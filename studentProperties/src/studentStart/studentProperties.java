package studentStart;

public class studentProperties {

	
		private String firstName;
		private String lastName;
		private int id;
		private String major;
		
		
		
		public studentProperties() {
			
		}

		public studentProperties(String firstName, String lastName, int id, String major) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = id;
			this.major = major;
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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}
		
		
		
}

	


