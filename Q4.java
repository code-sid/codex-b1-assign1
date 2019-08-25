package assignment1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=4, b=5,c=10, d=7;
int grt;
grt=(a>b && a>c && a>d)? a:((b>c && b>d)? b:(c>d?c:d));
System.out.println(grt);
	}

}
