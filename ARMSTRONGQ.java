import java.util.Scanner;
public class Ar{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b,t,q=0;
		b=in.nextInt();
		int m,c=0;
		m=b;
		while(m>0)
		{
			c++;
			 m=m/10;
			
		}
		int n=b;
		while(n>0)
		{
			t=n%10;
			q=q+(int)Math.pow(t,c);
			n=n/10;
			
			
		}
		if(b==q)
			System.out.println("armstrong number");
		else
			System.out.println(" not  armstrong number");
		
	}

}
