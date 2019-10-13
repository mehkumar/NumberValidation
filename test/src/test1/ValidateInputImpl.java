package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidateInputImpl implements ValidateInput {

	@Override
	public void validate(int input) {
		HashMap<Integer,String> al=new HashMap();
		for(int i=1;i<=input;i++)
		{
			
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
			System.out.println(es.getValue());
		}
	
	}
	

	

}
