import java.util.Scanner;
class ascii
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		String str1 = str.toUpperCase();
		int len = str1.length();
		for(int i=0;i<len;i++)
		{
			char ch = str1.charAt(i);
			System.out.println("ASCII of " + ch  
            + " = " + (int)ch);
		}
	}
}