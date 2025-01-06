import java.util.Scanner;
public class input
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.print("Your age is ");
		System.out.println(age);
		System.out.print("What is your name");
		String s=sc.next();
		System.out.println("Enter the value of BOA");
		String aryan  = sc.nextLine();		
		System.out.print("Your  name  is ");
		System.out.println(s);		
		System.out.print("Your college name  is ");
		System.out.println(aryan);

	}
}