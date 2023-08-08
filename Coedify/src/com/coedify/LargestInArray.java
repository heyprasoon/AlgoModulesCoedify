package com.coedify;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,10,3,4,10};
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		
	}

}
