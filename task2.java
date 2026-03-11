Q1.Write a Program to Display below pattern
package apna;

import java.util.Iterator;
import java.util.Scanner;

public class ADvancedpattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the rows: ");
		int n =sc.nextInt();
                		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	} 

}
 Output:
Enter the rows: 5
    * 
   ***  
  *****   
 *******    
*********     
*********     
 *******    
  *****   
   ***  
    * 
Q2 Write a Program to Display below pattern

package apna;

import java.util.Iterator;
import java.util.Scanner;

public class ADvancedpattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the rows: ");
		int n =sc.nextInt();
                		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	} 

}

Output:
 Enter the rows: 5
    * 
   ***  
  *****   
 *******    
*********     




