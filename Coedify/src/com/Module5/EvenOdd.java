package com.Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {
	
	public static void main(String[] args) {
			
		int even=0;
		int odd=0;
		
		List<Integer> ls = new ArrayList<>(Arrays.asList(9,10,49,13,75,89,90,100));
		
		for(int i: ls){
			if(i%2==0) even++;
			else odd++;
		};
		
		System.out.println(even+" "+odd);
		
	}
	
}
