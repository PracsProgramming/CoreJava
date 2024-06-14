package String;

import java.util.Scanner;

public class CharAtExample {
public static void main(String[] args) {
	String name = "javabykiran";
	String name2 = "zzz";
	
	Scanner sc = new Scanner(System.in);
	
	
	int i = 0;
	int j = 0;
	char[] ch1 = name.toCharArray();
	char[] ch2 = name2.toCharArray();
	
	
	    for ( i = 0 ;i< ch1.length-1 ;i++ )
	    {
	       for ( j = 0;j< ch2.length-1;j++ )
	       { 
	           if( ch2[j] == ch1[i] )
	           break;
	       }
	     if(j==ch2.length) 
	      System.out.println("fail");
	     else
		    {
		 System.out.println("pass");}
	    }
	 
	
	

	char ch = name.charAt(4);
	System.out.println(ch);
	
}


}
