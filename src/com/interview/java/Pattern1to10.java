package com.interview.java;

public class Pattern1to10 {

	public static void main(String[] args) {
		int n=9;
        for (int i = 1; i < n; i++) 
        {
        	int v=i;
	        for (int j = 1,o=n-1; j <= i; j++,o--)
		     {	   
	        	if(j==1){
	        		System.out.print(i+" ");
	        	}else{
	        		v=v+o;
	        		System.out.print(v+" ");
	        	}
	        }
	        System.out.println();
        }

	}

}
