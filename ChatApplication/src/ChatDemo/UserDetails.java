package ChatDemo;

public class UserDetails {
	String userName;
	String course;
	public UserDetails() {
		
	}
	
	public UserDetails(String name) {
		userName = name;
	}
	
	public void activePlan(String course) {
		this.course = course;
	}
	
	
}
