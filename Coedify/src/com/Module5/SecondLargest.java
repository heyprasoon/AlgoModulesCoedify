package com.Module5;

import java.util.*;
public class SecondLargest {
	
	public static void main(String[] args) {
		
		int[] arr = {9,10,49,13,75,89,90,100};
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
		
		System.out.println(arr[1]);
		
		
	}

}
