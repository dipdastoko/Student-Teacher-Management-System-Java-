import mypack.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		 String answer;
		 
		  

		do{
			
			
			
		System.out.println();
		System.out.println("****Welcome to Student-Teacher Management****");
		System.out.println();
		
		System.out.println("Enter 1 to register a Student\n"+"Enter 2 to register a Teacher\n");
		System.out.print("Enter Your Choice: ");
		
		int c; //switch_case
	    c = a.nextInt();
		System.out.println();
		
		switch(c){
			
		case 1:
		
		Student su;
		su = new Student1();
		su.student();
		su.enroll();
		break;
		
		case 2:
		
		Teacher1 tu = new Teacher1();
		tu.teacher();
		tu.enroll();
	    break;
		
		default:
		    System.out.println("Wrong Input. Try Again\n");
		}
		
		System.out.println("Do you want to another one? Yes or No");
		answer = b.nextLine();
		answer=answer.toUpperCase();
		}
		while(answer.equals("YES"));
	}
}