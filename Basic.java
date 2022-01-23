/**
 * 
 */
package upasana.com;

import java.util.Scanner;

/**
 * @author Upasana Singh
 *
 */
public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x=15;
//		String s="Upasana";
//		char c='s';
//		boolean b=true;
//		
//		// ctrl+/ -> comment
//		//syso ctrl+space
//		
//		//Control statements -> Decision Making Statements
//		
//		//1. IF  2. IF - ELSE  3. Nested IF 4. If ladder
//		Scanner sc = new Scanner(System.in);
//		int w=sc.nextInt();
//		
//		int t=sc.nextInt();
//		int m=1;
//		if(w==1) {
//			
//			if(t==5)
//				System.out.println("I will teach java" + w);
//			else
//				System.out.println("I will watch harry poter");
//			
//			
//		}
//		else if(m==1)
//			System.out.println("I will go to mall");
//		else 
//			System.out.println("I will go to park");
		
		
		//How to take input from user
		
		
		
//		int a=sc.nextInt();
//		String s=sc.nextLine();
		
		
		//Loops : For loop
		
		for(int i=0;i<=10;i++) //odd number
		{
			if(i%2==0)
				continue;
			System.out.println("I's value is  "+ i);
		}
		
		//Loops : While Loop
		int j=0;
		while(j<=10) {
			System.out.println("J's value is  "+ j);
			j++;
		}
		
		//Loop: do while
		
		int k=0;
		do {
			System.out.println("K's value is  "+ k);
			k++;
		}while(k<=10);
		
	}

}
