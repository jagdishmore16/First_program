package pratice;

import java.util.Scanner;

public class Inpute {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter First name");
//		String a = sc.next();
//		System.out.println("Enter Secomd name");
//		String b = sc.next();
//		//String d = a + b;
//		System.out.println("a ="+ a +" b =" +b);
		
		
		StringBuffer sb = new StringBuffer("study");
		System.out.println(sb);
		// modifying object
		sb.append("tonight");
		System.out.println(sb);    // Output: studytonight
	}

}

