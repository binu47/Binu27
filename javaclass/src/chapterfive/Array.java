package chapterfive;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		//part1
		
		String[] studentname= {"binyam", "daniel", "fuad", "hilina", "mati", "selam", "sofi", "zeleke"};
		
		//part2
		
		 System.out.println("Student Names:");
	        for (int i = 0; i < studentname.length; i++) {
	            System.out.println(studentname[i]);
	        }
	        
	     //part3
	        Arrays.sort(studentname);
	        System.out.println("\nSorted Student Names (A → Z):");
	        for (String name : studentname) {
	            System.out.println(name);
	        }
	        int a = 15;

	        int b = 12;

	        System.out.print(a%b);

	        System.out.print(",");

	        System.out.print(b%a);
	}

}
