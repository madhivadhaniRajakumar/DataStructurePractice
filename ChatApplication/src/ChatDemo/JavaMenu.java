package ChatDemo;

import java.util.Scanner;

public class JavaMenu extends ChatMenu{

	Scanner sc = new Scanner(System.in);
	public void javamenu(){
		System.out.println("********************");
		
		System.out.println("Please select for the given options");
		System.out.println("1.Validity");
		System.out.println("2.Assessment Details");
		System.out.println("3.Curriculum Doubt");
		System.out.println("4.Project Help");
		System.out.println("5.Previous Menu");
		System.out.println("6.Exit");
		courseMenu();
		
		
	}
	
	
}
