import java.util.Arrays;
public class Twod
{
	public static void main(String []args)
	{
		int[][] marks={{100,99,98},{60,50,40}};
		System.out.println(marks[0][0]);
		System.out.println(marks[0][1]);
		System.out.println(marks[0][2]);
		System.out.println(marks[0][0]);
		System.out.println(marks[1][1]);
		System.out.println(marks[1][2]);
		Arrays.sort(marks[0]);
		Arrays.sort(marks[1]);
	}
}