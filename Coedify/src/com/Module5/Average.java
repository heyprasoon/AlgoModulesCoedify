package com.Module5;

import java.util.Arrays;

public class Average {
	
	public static void main(String[] args) {
		
		int[] arr = {9,10,70,90,100};
		
		Arrays.sort(arr);
		
		double sum=0;
		for(int i:arr) {
			sum+=i;
		}
		
		
		System.out.println(sum/arr.length);
		
	}

}
