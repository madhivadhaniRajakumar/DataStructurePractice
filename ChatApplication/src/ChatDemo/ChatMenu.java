package ChatDemo;

import java.time.LocalTime;
import java.util.Scanner;


public class ChatMenu extends UserDetails{
	Scanner sc = new Scanner(System.in);
	UserDetails ud = new UserDetails();
	
	String uname;
	void greating() {
		System.out.println("Thank you!");
		System.out.println("Have a great day!");
	}
		
	void mainMenuChoice() {
		System.out.println("Welcome to ChatBot Application");
		System.out.println("Please Enter your name");
		
		uname = sc.nextLine();
		ud.userName =uname;
		LocalTime time=java.time.LocalTime.now();  
		int hour = time.getHour();
		
		System.out.println("*************************");
		
		if(hour<12) {
			System.out.println("Good Morning! "+ud.userName );
		}
		else {
			System.out.println("Good Evening! "+ud.userName);
		}
		mainMenu();

	}
	public void mainMenu() {
		System.out.println("Please select course you subscribed for");
		System.out.println("1.Java and its Application");
		System.out.println("2.Data Structures and Algorithm");
		System.out.println("3.Web Application Development");
		System.out.println("4.React JS ");
		System.out.println("5.Exit");

		 JavaMenu jv = new JavaMenu();
		int option = sc.nextInt();
		switch(option) {
		case 1 : ud.activePlan("JAVA");
		   
		    jv.javamenu();
		    break;
		case 2: ud.activePlan("DSA");
			jv.javamenu();
			break;
		case 3: ud.activePlan("WEBAPP");
			jv.javamenu();
			break;
		case 4: ud.activePlan("REACTJS");
			jv.javamenu();
			break;
		case 5:greating();
			break;
		}
		
	
	}
	public void courseMenu() {
		Validity v = new Validity();
		int option = sc.nextInt();
		switch(option) {
		case 1: 
			System.out.println("1.To check Validity Details");
			System.out.println("2.To Extend current Validity");
			System.out.println("3.Go to Previous Menu");
			System.out.println("4.Exit");
			v.validityMenu();
			break;
		case 2:
			System.out.println("1.Completed Assesment");
			System.out.println("2.Upcoming Assessment");
			System.out.println("3.Assessment Result");
			System.out.println("4.Go to Previous Menu");
			System.out.println("5.Exit");
			
			
			break;
		case 3:
			System.out.println("Your ticket Have been raised! Our Curriculum Expert will get back to you shortly");
			greating();
			break;
		case 4:
			System.out.println("Your ticket Have been raised! Our Curriculum Expert will get back to you shortly");
			greating();
			break;
		
		case 5:
			mainMenu();
			break;
		case 6:
			greating();
		
		}	
	}
	
	
	public static void main(String[] args) {
		ChatMenu cm = new ChatMenu();
		cm.mainMenuChoice();
	}
}


