package ChatStackDemo;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Stack;


public class Menu implements LastMenu{
	static Stack<Integer> userOption = new Stack<>();
	//static Stack<String> stack = new Stack<>();
	static int level =0;
	static boolean over =false;
	int option;
	String uname;
	User u = new User();
	static Scanner sc = new Scanner(System.in);
	public void setup() {
		System.out.println("Welcome to ChatBot Application");
		System.out.println("Please Enter your name");
		
		uname = sc.nextLine();
		
		u.userName =uname;
		LocalTime time=java.time.LocalTime.now();  
		int hour = time.getHour();
		
		System.out.println("*************************");
		
		if(hour<12) {
			System.out.println("Good Morning! "+u.userName );
		}
		else {
			System.out.println("Good Evening! "+u.userName);
		}
		
	}
	void greating() {
		level=0;
		System.out.println("Thank you!");
		System.out.println("Have a great day!");
		System.out.println("***************************************************");
	}
	
	public void mainMenu() {
		System.out.println("Please select course you subscribed for");
		System.out.println("1.Java and its Application");
		System.out.println("2.Data Structures and Algorithm");
		System.out.println("3.Web Application Development");
		System.out.println("4.React JS ");
		System.out.println("5.Exit");
		
		int option = sc.nextInt();
		userOption.add(option);
		mainMenuOperation(option);
		
	}
	public void mainMenuOperation(int option) {
		
		switch(option) {
		case 1 : u.activePlan("JAVA");
		//	stack.add(u.course);
			courseMenu();
		    break;
		case 2: u.activePlan("DSA");
			//stack.add(u.course);
			courseMenu();
			break;
		case 3: u.activePlan("DSA");
		//	stack.add(u.course);
			courseMenu();
			break;
		case 4: u.activePlan("REACTJS");
			//stack.add(u.course);
			courseMenu();
			break;
		case 5:greating();
			//stack.add(u.course);
			break;
		}
		
	}
	public void courseMenu() {
		
		System.out.println("Please select for the given options");
		System.out.println("1.Validity");
		System.out.println("2.Assessment Details");
		System.out.println("3.Curriculum Doubt");
		System.out.println("4.Project Help");
		System.out.println("5.Main Menu");
		System.out.println("6.Exit");
		
		int option = sc.nextInt();
		userOption.add(option);
		courseDetailMenu(option);
			
	}
	public void courseDetailMenu(int option) {
		
		switch(option) {
		case 1: validityMenu();
			//stack.add("Validity");
			break;
		case 2: 
			//stack.add("Assessment");
			assessmentMenu();
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
			//stack.removeAllElements();
			userOption.clear();
			break;
		case 6:
			greating();
			over=true;
			break;
		}
	}
	public void validityMenu() {
		System.out.println("1.To check Validity Details");
		System.out.println("2.To Extend current Validity");
		System.out.println("3.Go to Previous Menu");
		System.out.println("4.Exit");
		
		int option = sc.nextInt();
		userOption.add(option);
		validityDetails(option);
	}
	
	public void assessmentMenu() {
		System.out.println("1.Completed Assesment");
		System.out.println("2.Upcoming Assessment");
		System.out.println("3.Assessment Result");
		System.out.println("4.Go to Previous Menu");
		System.out.println("5.Exit");
		int option = sc.nextInt();
		userOption.add(option);
		assessmentDetail(option);
	}
	
	
	public void validityDetails(int option) {
		switch(option) {
		case 1:
			valityDetails();
			greating();
			break;
		case 2:
			extendValidity();	
			greating();
			break;
		
		case 3:
			userOption.pop();
			userOption.pop();
			 option = userOption.peek();
			 mainMenuOperation(option);
			break;
		case 4:
			greating();
			break;
		}
	}
	public void assessmentDetail(int option) {
		switch(option) {
		case 1:
			completedAssesment();;
			greating();
			break;
		case 2:
			upcomingAssesment();	
			greating();
			break;
		
		case 3:
			result();
			greating();
			break;
		case 4:
			userOption.pop();
			userOption.pop();
			 option = userOption.peek();
			 mainMenuOperation(option);
			break;
		case 5:
			greating();
			
		}
	}
	
	
	public static void main(String[] args) {
		Menu m = new Menu();
		m.setup();
		while(!over) {
			if(userOption.isEmpty()) {
				m.mainMenu();
			}
			
		}
		
	}

}
