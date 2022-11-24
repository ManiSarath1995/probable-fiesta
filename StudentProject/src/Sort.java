
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {23,56,13,34,567,678, 45};
		
		//int temp;
		
		for(int i=0 ; i<array.length; i++) {
			
			
			for(int j=i+1; j < array.length; j++)
			{
				int temp=0;
				if(array[j] < array[i]) 
				{
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
								
				}
			}

							
		}
		
		for (int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}

}
