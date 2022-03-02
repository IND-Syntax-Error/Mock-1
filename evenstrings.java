import java.util.*;
class evenstrings
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[10];
		System.out.println("enter 10 strings : ");
		for(int i=0;i<10;i++)
		{
			str[i] = sc.nextLine();
		}
		System.out.println("strings with even no of char :");
		for(int i=0;i<10;i++)
		{
			if(str[i].length()%2==0)
			{
				System.out.println(str[i]);
			}
		}
	}
}