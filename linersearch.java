import java.util.Scanner;
class linersearch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array : ");
		int length = sc.nextInt();
		int num[] = new int[length];
		int i = 0;
		System.out.println("Enter the elements of the array : ");
		for(i=0;i<length;i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("enter the element to be searched : ");
		int input = sc.nextInt();
		for(i=0;i<length;i++)
		{
			if(num[i]==input)
			{
				break;
			}
		}
		if(i == length)
		{
			System.out.println("no such element");
		}
		else
		{
			System.out.println("element found");
		}
	}
}