package org.karthi.array;

public class ArrayAscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int k;
		int[] Array = new int[]{44,88,22,77,99};
  
        for (int i=0;i<Array.length;i++) {
        	for(int j = i;j<Array.length;j++) {
        		if(Array[i]<Array[j]){
        		  k = Array[i];
        		  Array[i]=Array[j];
        		  Array[j]=k;
        			
        		}}}
        			
      for(int a : Array) {
    	  System.out.println(a);
      }
      }
    	  
      }
