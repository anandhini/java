import java.util.*;
public class PositiveNegative {
public static void main(String[] args)
{
	do{
	int a;
	System.out.println("Enter an Integer : ");
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	if(a>0)
		System.out.println("The Number Is Positive...!");
	else
		if(a<0)
			System.out.println("The Number Is Negative...!");
		else
			
			System.out.println("The Number Is Zero...!");
}while(true);
}
}
