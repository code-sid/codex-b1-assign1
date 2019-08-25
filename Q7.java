import java.util.Scanner;

public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int no1= input.nextInt();
		int no2= input.nextInt();
		System.out.println("Enter the '1 for addition','2 for substraction','3for multiplication','4for division'");
		int operation= input.nextInt();
	
			switch(operation)
				{
					case 1:System.out.println("Answer for addition is:"+(no1+no2));
					break;
					case 2:System.out.println("Answer for subtraction is:"+(no1-no2));
					break;
					case 3:System.out.println("Answer for multiplication is:"+(no1*no2));
					break;
					case 4:System.out.println("Answer for division is:"+(no1/no2));
					break;
					default:System.out.println("Invalid operation Entered");
	
				}

	}
		
}
