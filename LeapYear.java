import java.util.Scanner;
public class leap {
	public static void main(String[] args) {
		int x;
		Scanner in= new Scanner(System.in);
		x=in.nextInt();
		if((x%4==0) && (x%400==0) ||(x%100!=0))
		{
			System.out.println("the given number is leapyear");
			
		}
		else
			System.out.println("the given year is notleapyear");

	}

}
