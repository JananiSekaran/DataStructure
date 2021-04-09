package com.exercise.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		 /*int myArray1[] = {23, 36, 96, 78, 55};
	      int myArray2[] = {78, 45, 19, 73, 55};*/
	     
		  int myArray1[] = { 9, 4, 6, 2, 10, 10 };
	      int myArray2[] = { 14, 3, 6, 9, 10, 15, 17, 9 };
		
	      System.out.println("Intersection of the two arrays ::"+Arrays.toString(intersectionArray(myArray1, myArray2)));
	      System.out.println("Intersection of the two arrays ::"+Arrays.toString(findInterserctorOfTwoArray(myArray1, myArray2)));
	      
	}

	/*private static void interSectionArray(int[] myArray1, int[] myArray2) {
		
		for(int i=0;i<myArray1.length;i++)
	    	  for(int j=0;j<myArray2.length;j++)
	    		  if(myArray1[i]==myArray2[j])
	    			  System.out.println(myArray2[j]);
	}*/
	
	
	
	
private static int[] intersectionArray(int[] myArray1, int[] myArray2)
{
	
	/*
	Set<Integer> set1=new HashSet<Integer>();
	Set<Integer> set2=new HashSet<Integer>();
	for(int i: myArray1){
        set1.add(i);
    }
 
	for(int i:myArray2)
	{
		if(set1.contains(i))
			set2.add(i);
	
	}
	
	int[] result= new int[set2.size()];
	int j=0;
	for(int i:set2)
	{
		result[j++]=i;
		
	}
	
	
	return result;
*/	

	return Arrays.stream(myArray1).distinct().filter(x->Arrays.stream(myArray2).anyMatch(y->y==x)).toArray();
	

}


private static int[] findInterserctorOfTwoArray(int[] array1, int[] array2) {
    Map<Integer,Integer> map=new HashMap<>();
    for (int element : array1) {
        for (int element2 : array2) {
            if(element==element2) {
                map.put(element, element);
            }
        }
    }
    int[] newArray=new int[map.size()];
    int con=0;
    for(Map.Entry<Integer, Integer> lst:map.entrySet()) {
        newArray[con]=lst.getValue();
        con++;
    }
    return newArray;
}


public int[] intersect(int[] nums1, int[] nums2) {
    Set<Integer>set1=new HashSet<Integer>();
    Set<Integer>set2=new HashSet<Integer>();
    for(int i:nums1)
        set1.add(i);
     
     for(int j:nums2)
     {
         if(set1.contains(j))
             set2.add(j);
     }
     
     int result[]=new int[set2.size()];
     int k=0;
     for(int i:set2)
     {
         result[k++]=i;
         
     }
     
     return result;
 }
}
