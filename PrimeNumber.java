package week1.day1.assignments;

import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) 
	{
		int num=13;
		boolean flag=false;
		for (int i = 2; i<num/2; i++) 
		{
            if (num % i==0) 
            {
        	flag=true;
 
		    }			
        
		}
		if (flag==false) 
		{
			System.out.println("Prime");
		}
		else 
		{
			System.out.println("Not a Prime");
		}
			
		
	}

}
