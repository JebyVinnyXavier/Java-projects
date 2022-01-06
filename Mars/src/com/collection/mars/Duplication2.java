package com.collection.mars;

import java.util.HashSet;

public class Duplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// HashSet initialization
        			
		HashSet<Student1> set = new HashSet<>();
  
        // Add entries in HashSet
        set.add(new Student1(80, "Jeby"));
        set.add(new Student1(95, "vinny"));
        set.add(new Student1(80, "Jeby"));
        set.add(new Student1(95,"vinny"));
        for (Student1 std : set) {
            System.out.println(std.getName() + " " + std.getMarks());
        }
    }
}		  
		    
		        
