import java.util.Scanner;
public class stringrev {
public static void main(String[] args) {
	 String st,rev="";
	 Scanner in= new Scanner(System.in); 
	 st=in.nextLine();
	 int len=st.length();
	 for(int i=len-1;i>=0;i--)
	 rev=rev+st.charAt(i);
	 System.out.print("reversed string is" + " " + rev);
	 

	}

}
