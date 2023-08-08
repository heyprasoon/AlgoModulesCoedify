package com.coedify;

import java.util.HashMap;

public class Frequency {
	 
	public static void main(String[] args) {
		
		int[] arr= {10,20,20,30,25};
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i:arr) {
			
			map.put(i,map.getOrDefault(i, 0) +1);
			
		}
		
		System.out.println(map);
		
	}
	
}
