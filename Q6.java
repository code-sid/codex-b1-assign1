package assignment1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Year : ");
        Scanner yr=new Scanner(System.in);
        int year=yr.nextInt();
        String leap=((year%100!=0 && year%4==0 || year%400==0)?"Yes,it's a leap Year ":"No,it's not a leap Year");
        System.out.print(leap);
	}

}
