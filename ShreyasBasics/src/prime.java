/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class prime {
	
	
	
	public static int difference (int min,int max) {
		 int num = 0;
		 int Difference = 0;
	        String  primeNumbers = "";

	        for(int i = min;i<=max;i++){
	            int counter = 0;
	              for(num =i; num>=1; num--){
	                if(i%num==0)
	             	     {
	 		        counter = counter + 1;
		                        }
		            }
		        if (counter ==2)
		        {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i ;
		     
	         
		        }
	        }
	        System.out.println(primeNumbers);
	        System.out.println(primeNumbers.length());
	        if (primeNumbers.length()>1){
	             
		        	char [] primeno = primeNumbers.toCharArray();
		        			System.out.println(primeno);
		        			int val = primeNumbers.length() - 1;
		        			System.out.println(val);
		        			char maxx = primeno[val];
		        			char minn = primeno[0];
					         System.out.println(maxx);   
					         System.out.println(minn);
				
	            Difference = maxx-minn;
	            System.out.println(Difference);
	            return Difference;
	        }
	        else if(primeNumbers.length()==1){
	          System.out.println("0"); 
	          return 0;
	        }
	        else{
	            System.out.println("-1");
	            return -1;
	        }


	   
	}
	
	
    @SuppressWarnings("resource")
	public static void main(String args[] ) throws Exception {

       System.out.println(difference(5,5));

    }
}
