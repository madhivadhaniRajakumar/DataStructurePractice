package ChatDemo;

import java.util.Scanner;

public class Validity extends JavaMenu implements LastMenu  {
	Scanner sc = new Scanner(System.in);
	public void validityMenu(){
		int option = sc.nextInt();
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
			javamenu();
			break;
		case 4:
			greating();
		}
	}
	public void assessmentMenu() {
		int option = sc.nextInt();
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
			javamenu();
			break;
		case 5:
			greating();
			
		}
	}


	
}
