package com.coedify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fabonachi {

	public static void main(String[] args) {
		
	List<Integer> list= new ArrayList<>();
		
		list.add(0);
		list.add(1);
		
		for(int i=2; i<=20; i++) {
		
			
			int num= list.get(i-1) + list.get(i-2);
			
		    list.add(num);
			
		}
		
     System.out.println(list);	
		
	}	
}
