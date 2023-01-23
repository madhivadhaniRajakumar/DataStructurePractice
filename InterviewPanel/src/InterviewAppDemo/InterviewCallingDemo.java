package InterviewAppDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewCallingDemo {
	Scanner sc = new Scanner(System.in);
	Queue<String> name = new LinkedList<>();
	
	static boolean over = false;
	public void addCandidate(String name) {
		this.name.add(name);
	}
	public void nextPerson()
	{
		name.remove();
	}
	
	public void switchMenu() {
		System.out.println("1.To add a Candidate");
		System.out.println("2.To End the Interview and call the next candidate");
		System.out.println("3.To Exit");
		
		int option = sc.nextInt();
		menu(option);
	}
	public void menu(int option) {
		switch(option) {
		case 1: 
			System.out.println("Enter name");
			String name = sc.next();
			addCandidate(name);
			System.out.println("Person added to the Inteview queue");
			break;
		case 2:
			nextPerson();
			String next = this.name.peek();
			if(next==null) {
				System.out.println("No Candidate Left");
			}
			else {
				System.out.println("Next Person :" + next);

			}
			break;
		case 3: 
			System.out.println("Thank You !..........");
			over = true;
			break;
		}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewCallingDemo dm = new InterviewCallingDemo();
		while(!over) {
			dm.switchMenu();
		}

	}

}
