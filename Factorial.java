import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
	int c,n,fact=1;
	System.out.print("enter the integer value:");
	Scanner in= new Scanner(System.in);
	n=in.nextInt();
	for(c=1;c<=n;c++)
	fact=fact*c;
	System.out.print("the factorial value" +  " " + fact);
	
	

	}

}
