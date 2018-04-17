package com.interview.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		int[] my_array = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,1,2,3,4,5};
        Set<Integer> listPrabhu=new HashSet<Integer>();
        
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
            	
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                  
                    	listPrabhu.add(my_array[j]);
                	
                }
            }
        }
        for(Integer r:listPrabhu ) {
    		System.out.print(r);// prints the value in the corresponding index.
    		}


	}

}
