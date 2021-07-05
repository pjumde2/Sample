package Sel2020_1.Sel2020_1;

import java.util.Scanner;

public class Test44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2, div=1;
		
		System.out.println("Please enter number1: ");
		Scanner scan=new Scanner(System.in);
		
		num1=scan.nextInt();
		System.out.println("Please enter number2: ");
Scanner scan1=new Scanner(System.in);
		
		num2=scan1.nextInt();
		
		for(int i=1;i<=num1 && i<=num2 ;i++)
		{
			if(num1%i==0 && num2%i==00)
			{
				div=i;
			}
			
		}
		
		System.out.println("GCD is "+div);
			
		
	

	}

}
