import java.util.Scanner;
public class numberrev {
	public static void main(String[] args) {
		int a,b,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a>0)
		{
			b=a%10;
			sum=sum*10+b;
			a=a/10;
			
		}
		
		System.out.print(sum);
	}

}
