 import java.lang.System;

public class StudentScheduler {
	
	//Admin ad = new Admin();
		
		void StudentSched(String StudentName, int RollNumber, String [] CourseName) {
			
			//Student [] st = new Student [Admin.a1];
			
			//for (int i=0; i<Admin.a1; i++)
			//{
				
				System.out.println("Name of the Student is "+ StudentName);
				System.out.println("Roll number of " + StudentName + " is "+ RollNumber);
				
				for (int i=0; i < CourseName.length ; i++) {
				
					System.out.println(StudentName + " enrolled in "+ "\"" + CourseName[i] + "\" " + "course");
					
				}
		}
		
		//Sorting Roll Numbers
			
		void sort(String [] StudentName, int [] RollNumber, int NoofStudents) {
			
			//int [] RollNumber1;
			int [] sortRollNumber1;
			//RollNumber1 = new int[NoofStudents];
			sortRollNumber1 = new int[NoofStudents];
			//String [] sortStudentName;
			
			//sortStudentName = new String[NoofStudents];
			
			for(int i=0; i<(NoofStudents); i++) {
				
				sortRollNumber1[i] = RollNumber[i];
				
				
			}
		//}
			
			//void sort1() {
			
				
			for(int i=0 ; i<(NoofStudents); i++) {
				
			
				for(int j=i+1; j < (NoofStudents); j++)
				{
					
					if(sortRollNumber1[j] < sortRollNumber1[i]) 
					{
					int temp = sortRollNumber1[i];
					sortRollNumber1[i] = sortRollNumber1[j];
					sortRollNumber1[j] = temp;
									
					}
				}

								
			}
			
			for (int i=0; i<NoofStudents; i++) {
				
				for (int j=0; j<NoofStudents ; j++){
					
					if(sortRollNumber1[i] == RollNumber[j]) {
						
						System.out.println("Name of Roll Number " +StudentName[j] +" is " + sortRollNumber1[i]);	
					}
				
					
					
				}
				
			}
		
						
			
		}

}
