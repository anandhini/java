import java.util.Scanner;
public class rev{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,u,s=0,t=0,M;
		int N=input.nextInt();
	   while(N>0)
	   {
	     a=N%10;
	     s=s+a;
	     N=N/10;
	    }
	   M=s;
	   while(M>0)
	   {
	     u=M%10;
	     t=t*10+u;
	     M=M/10;
	    }
	    if(s==t)
	    	System.out.println("the given no is palindrom");
	    else
	    	System.out.println("the given no is not palindrom");
	}

}
