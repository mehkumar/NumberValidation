package test1;
import java.util.Scanner;
public class UITest {
	
		public static void main(String[] args) {
		int number=0;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			  number=s1.nextInt();
			  ValidateInputImpl v=new ValidateInputImpl ();
			  v.validate(number);
		}
		catch(Exception e)
		{
			System.out.println("Enter a positive numerical value");
			
		}
		finally
		{
				s1.close();	
			
		}
	}

}
