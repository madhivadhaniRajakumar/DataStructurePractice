package ChatDemo;

public interface LastMenu {
	default void valityDetails() {
		System.out.println("Validity Ends ny 28th March");
	}
	default void extendValidity() {
		System.out.println("Validity Extended till April 28th");
	}
	default void completedAssesment() {
		System.out.println("You have completed 10/15 Assessment");
	}
	default void upcomingAssesment() {
		System.out.println("Upcoming Assessment on 2nd Feb 2023");
	}
	default void result() {
		System.out.println("Not Available");
	}
}
