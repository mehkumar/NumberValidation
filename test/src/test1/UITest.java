package test1;
import java.util.Scanner;
public class UITest {

		//Main Function
		public static void main(String[] args){
		
		//Initializing input variable			
		int number=0;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			  number=s1.nextInt();
			  ValidateInputImpl v=new ValidateInputImpl ();
			  
			  //Function call for invoking the validator function
			  v.validate(number);
		}
		catch(Exception e)
		{
			System.out.println("Enter a non-decimal numerical value");
			
		}
		finally
		{
				s1.close();	
			
		}
	}

}
