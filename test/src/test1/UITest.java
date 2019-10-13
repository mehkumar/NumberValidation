package test1;

import java.util.Scanner;

public class UITest {
	
	public static void main(String[] args) {
		
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the number");
	    int number=s1.nextInt();
		ValidateInputImpl v=new ValidateInputImpl ();
		v.validate(number);
		
	}

}
