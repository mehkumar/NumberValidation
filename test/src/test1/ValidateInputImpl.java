package test1;

import java.util.HashMap;
import java.util.Map;

//Implementing ValidateInpt Interface
public class ValidateInputImpl implements ValidateInput  {

	@Override
	public void validate(int input) {
		
		//HashMap declaration
		HashMap<Integer,String> al=new HashMap<Integer,String>();
		try {
			
			//TDD based validation for incorrect input
			if(input==0 || input<0)
			{
				throw new CustomValidation("Invalid Input");
			}
		}
		catch(CustomValidation e)
		{
			System.out.println(e.getMessage());
			System.out.println("Enter correct Input");
		}
		catch(Exception e)
		{
			System.out.println("Enter correct Input");
		}
		for(int i=1;i<=input;i++)
		{
			//Condition as per the problem statement
			if(i%3==0 & i%5==0)
			{
				al.put(i, "foobar");
			}
			else if (i%5==0) {
				al.put(i, "bar");
			}
			
			else if (i%3==0) {
				al.put(i, "foo");
			}
			else
			{
				al.put(i,String.valueOf(i));	
			}
		}
		
		for(Map.Entry<Integer, String> es:al.entrySet())	 
		{
			//Printing the values in the HashMap
			System.out.println(es.getValue());
		}
	
	}

}
