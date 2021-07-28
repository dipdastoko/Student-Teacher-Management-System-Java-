package mypack;
import java.util.Scanner;

public class Teacher1 implements Teacher{
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String teacherId;
	private static int id=100;
	private String courses=" ";
	private int Balance=0;
	private static int costofcourse=2000;
	private String p;
	
	int j; //for_exception_handling_loop
	
	@Override
	public void teacher(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Teacher Firstname:");
		this.firstname=in.nextLine();
		
		System.out.print("Enter Teacher lastname:");
		this.lastname =in.nextLine();
		
//exception_handling_part_starts		
		do{
			j=2;
		
		System.out.print("1-Assitant\n2-Lecturer-\nEnter teacher class level:");
		this.gradeyear=in.nextInt();
		try{
			if(gradeyear<1 || gradeyear>2){
				
				throw new InvalidOptionException();
			}
		}
		catch(InvalidOptionException e)
		{
			e.printStackTrace();
			j=1;
			System.out.println("Please Choose between 1 and 2");
		}
		}while(j==1);
//exception_handling_part

setTeacherId();
		
		if(gradeyear==1){
				p="Assistant";	
	                    }
					
		if(gradeyear==2){
                p="Lecturer";        
				        }

}
//teacher_method_ends

	@Override
	public void setTeacherId(){
		id++;
		this.teacherId=gradeyear+""+id;
	}
	
	
	
	
	@Override
	public void enroll(){
		do{
			System.out.print("Enter course to register(P to quit):");
			Scanner in = new Scanner(System.in);
			String course =in.nextLine();
			if(!course.equals("P")){
				courses =courses+"\n"+course;
				Balance=Balance+costofcourse;
			}
			else{
				System.out.println();
				break;
			}
		} while(1 !=0);
		
		       System.out.println("Teacher Information: ");
		       System.out.println();
		       System.out.println("Name:   "+firstname+" "+lastname+"\n"+"Status: "+p+"\n"+"ID:     "+teacherId);
		       System.out.println();
                       System.out.println("Registered Courses: ");
		       if(courses==" "){
                                    System.out.println("No registered course");}
                        else{  
		       System.out.println(courses);
                                } 
                System.out.println();
		System.out.println("Teacher account balance:"+Balance);
                System.out.println();
	}

		
		
}