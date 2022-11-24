import java.util.Scanner;

public class Admin {

	
	static int a1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//int a1 = ss.a;
		Scanner sc = new Scanner (System.in);
		
		
		 System.out.println("Enter the total number of Students in the class");
		
		 a1 = sc.nextInt();
		
		Student [] s = new Student [a1];    // creates object size array Students
		
		for (int i=0; i<a1; i++)
		{
			// Assigning Name
			s[i] = new Student();
			System.out.println("Please enter the Student Name");
			s[i].setStudentName(sc.next()); // asks user to enter the name and then assigns it to the Student Name variable 
			// System.out.println(s[i].getSudentName());
			
			// Assigning Roll Number
			System.out.println("Please enter a Roll Number for " + s[i].getStudentName());
			
			int b = sc.nextInt();
			
			if (i==0)
			{
				s[i].setRollNumber(b);
			}
			
			
			
			for(int p=0, q=0, temp=2; temp==2 || p!=q; temp++)
			{
				p=0; q=0;
				while (p<i)
				{
		
					if(b != s[p].getRollNumber())
					{
						q++;
					}
					p++;
				}
				

				if (p == q)  //How to use variables created in loop, out side the loop?
				{
					s[i].setRollNumber(b);
				}else
				{
					System.out.println("Roll Number already exsists. Please Enter a different Roll Number");
					System.out.println("Trial # " + temp + " to enter the Roll number for " + s[i].getStudentName());
					b = sc.nextInt();
				}
				
				
			}
			
						
			// Assigning Courses
			int c;
			System.out.println("Please enter the no.of Courses " + s[i].getStudentName() + " wants to enroll in");
			c = sc.nextInt();
			
			String[] co = new String[c]; // Creates Object size depending on no.of courses
			
			for (int j=0; j<c; j++)
			{
				//Courses[j] = new Student();
				System.out.println("Please enter the Course Name");
				co[j] = sc.next();
			}
			 
			s[i].setCourses(co);
			
		}
		
		StudentScheduler ss = new StudentScheduler();
		
		for (int i=0; i<a1; i++)
		{
		ss.StudentSched(s[i].getStudentName(), s[i].getRollNumber(), s[i].getCourses());
		

		}
		
		String [] Name;
		int[] Number;
		Name = new String[a1];
		Number = new int[a1];      //How to create array of arrays?
		
		
		for (int i=0; i<a1; i++)
		{
		
		//ss.sort(s[i].getStudentName(), s[i].getRollNumber(), a1);
			Name[i] = s[i].getStudentName();
			Number[i] = s[i].getRollNumber();
			
		}
		
		ss.sort(Name, Number, a1);
	}

}
