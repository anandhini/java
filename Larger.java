import java.util.Scanner;
public class larger {
	public static void main(String[] args) {
		int a,b,c;
	Scanner in= new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a>b && a>c)
		System.out.println("the value of a is larger");
	else if(b>c)
		System.out.println("the value of b is larger");
	else
		System.out.println("the value of c is larger");
	
	}

}
