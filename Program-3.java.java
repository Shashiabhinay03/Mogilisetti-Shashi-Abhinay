/**
 * 
 */
package Tandemloop;
import java.util.Scanner;
public class oddnum2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :");
        int a = sc.nextInt();
        int count;
        if(a%2==0) {
        	count=a-1;
        }else {
        	count=a;
        }
        for (int i=1;i<=count;i++) {
        	int odd=2*i-1;
        	if(i<count) {
        		System.out.print(odd + ",");
            } else {
                System.out.print(odd);
        	}
        }sc.close();
	}
}
