/**
 * 
 */
package Tandemloop;
import java.util.Scanner;
public class multiple {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num :");
	int a=sc.nextInt();
	int c[]=new int[a];
	System.out.println("enter" +a+ "numbers:");
	for (int i=0;i<a;i++){
        c[i] = sc.nextInt();
    }
	int[] counts=new int[11];
	for(int i=1;i<=10;i++){
        int count=0;
        for(int num:c){
            if(num%i==0){
            	count++;
            }
            }
        counts[i] = count;
	}
	System.out.println("Output:");
	System.out.print("{");
    for(int i=1;i<=10;i++){
        System.out.print(i+":"+counts[i]);
        if(i<10){
            System.out.print(",");
        }
    }
    System.out.println("}");
    sc.close();
	}
	
}
