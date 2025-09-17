/**
 * 
 */
package Tandemloop;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,c;
		System.out.println("Enter a:");
		a=sc.nextDouble();
		System.out.println("Enter c:");
		c=sc.nextDouble();
		System.out.println("Enter type of operation (add,sub,mul,div)");
		String operation;
		operation=sc.next();
		double result=0;
		if(operation.equals("add")||operation.equals("+")){
            result=a+c;
        }else if(operation.equals("sub")||operation.equals("-")){
            result=a-c;
        }else if(operation.equals("mul")||operation.equals("*")){
            result=a*c;
        }else if(operation.equals("div")||operation.equals("/")){
        	if(a!=0 && c!=0) {
            result=a/c;
        	}else {
        		System.out.println("Invalid num");
        		return;
        	}
        }else {
        	System.out.println("Enter correct operation");
        	return;
        }
		System.out.println("answer = " + result);
		sc.close();
	}
}
