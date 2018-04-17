package com.interview.java;

public class a1b10c12 {

	public static void main(String[] args) {
		String str =  "a1b10c12g3t1";
		for(int j=0; j<str.length(); j++)
        {
        	
        	char a = str.charAt(j);
            int b = ((int)str.charAt(++j)-48);
           
            if(j+1 >= str.length())
            {
                for(int i=0; i<b; i++)
                System.out.print(a);
                break;
            }
            
            if (((int)str.charAt(j+1)-48)>-1 && ((int)str.charAt(j+1)-48)<10)
            {
                b = (b*10) + ((int)str.charAt(++j)-48);
            }
           for(int i=0; i<b; i++)
                System.out.print(a);
        }

	}

}
