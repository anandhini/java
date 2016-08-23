import java.io.IOException;
import java.util.Scanner;
public class vewelornot {
	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char c;
		Scanner in=new Scanner(System.in);
		c=(char)System.in.read();
			if(c=='a'|| c=='e' || c=='i' || c=='o'|| c=='u')
			{
			System.out.println("The given value is vowel");
			}
		else
			System.out.println("The given value is consonent");
			
	
	}

}
