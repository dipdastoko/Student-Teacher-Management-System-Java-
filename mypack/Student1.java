package mypack;
import java.util.Scanner;

public class Student1 extends Student{
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentId;
	private static int id=500;
	private String courses=" ";
	private int tuitionBalance=0;
	private static int costofcourse=1500;
	private String s;
	
	int i; //for_exception_handling_loop
	
	@Override
	public void student(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Student Firstname:"); 
		this.firstname=in.nextLine();
		
		System.out.print("Enter Student lastname:");
		this.lastname =in.nextLine();
		
		
//exception_handling_part_starts		
		do{
			i=2;
		
		System.out.print("1-UnderGraduate\n2-PostGradute-\nEnter student class level:");
		this.gradeyear=in.nextInt();
		
		try{
			if(gradeyear<1 || gradeyear>2){
				
				throw new InvalidOptionException();
			}
			
		}
		
		catch(InvalidOptionException e)
		{
			e.printStackTrace();
			 i=1;
			 System.out.println("Please choose 1 or 2");
		}
		
		}while(i==1);
//exception_handling_part_ends	

setStudentId();
		
			if(gradeyear==1){
				
				s="UnderGraduate";
				
							}
					
		    if(gradeyear==2){
				
                s="PostGraduate";
				
						    }	
		
}
//student_method_ends
			
	@Override
	public void setStudentId(){
		id++;
		this.studentId=gradeyear+""+id;
	}
	

	
	
	@Override
	public void enroll(){
		do{
			System.out.print("Enter course to enroll(Q to quit):");
			Scanner in = new Scanner(System.in);
			String course =in.nextLine();
			if(!course.equals("Q")){
				courses =courses+"\n"+course;
				tuitionBalance=tuitionBalance+costofcourse;
				
				
			}
			else{
				System.out.println();
				break;
			}
		} while(1 != 0);
		       
		       System.out.println("Student Information");
		       System.out.println();
		       System.out.println("Name:   "+firstname+" "+lastname+"\n"+"Status: "+s+"\n"+"ID:     "+studentId);
		       System.out.println();
               System.out.println("Registered Courses: ");
		       if(courses==" "){
                 System.out.println("No registered course");
				               }
               else{  
		         System.out.println(courses);
                   } 
		       System.out.println();                     
		       System.out.println("Tuition balance:"+tuitionBalance);
		       System.out.println();
			
	}

		
		
}