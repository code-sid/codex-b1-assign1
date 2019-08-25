package assignment1;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.out.print("Enter your Salary =");
		        Scanner sc=new Scanner(System.in);
		        double salary=sc.nextDouble();
		        double tax=0;
		       if(salary<15000.00)  
		            tax=(0.00+(salary*0.15));
		        else if(salary<30000.00)
		            tax=(2250.00+(salary*0.18));
		        else if(salary<50000.00)
		            tax=(5400.00+(salary*0.22));
		        else if(salary<80000.00)
		            tax=(11000.00+(salary*0.27));
		        else if(salary<1500000.00)
		            tax=(21600.00+(salary*0.33));
		        else 
		            tax=-1.0;
		        
		        System.out.print("Tax="+tax);    
		        }

		    
		  
	}


