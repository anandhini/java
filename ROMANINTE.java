
import java.util.Scanner;
public class Roin{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s;
		int va=0;
		s=in.nextLine();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='I')
				va+=1;
			else if(s.charAt(i)=='V')
				va+=5;
			else if(s.charAt(i)=='X')
				va+=10;
			
			
		}
		if(s.contains("IV"))
			va-=2;
		if(s.contains("IX"))
			va-=2;
		System.out.println("the corresponding integer is"+va);
	}

}
