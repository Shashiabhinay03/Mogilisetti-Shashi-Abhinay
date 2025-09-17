/**
 * 
 */
package Tandemloop;

import java.util.Scanner;

public class oddnum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num :");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			int oddnum= 2*i-1;
			if(i<a) {
				System.out.print(oddnum +",");
			}else {
				System.out.print(oddnum);
			}
		}sc.close();
	}
}
