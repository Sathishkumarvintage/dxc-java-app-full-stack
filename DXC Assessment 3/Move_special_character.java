package exam;

import java.util.Scanner;

public class Move_special_character {

	static String value(String data)
	{
		String normal="",special="";
		String reg="[^a-zA-Z0-9]";
		 for(int i=0;i<data.length();i++)
	        {
	        	char c=data.charAt(i);
	        	if(data.valueOf(c).matches(reg))
	        		special=special+c;
	        	else
	        		normal=normal+c;
	        }
		return normal+special;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String data;
		System.out.println("Enter the String and special char :");
		data=s.next();
		System.out.println(value(data));

	}

}
