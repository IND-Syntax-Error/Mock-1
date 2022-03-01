import java.util.*;
class identicalarray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[10];
		System.out.println("Enter the elements of the first array : ");
		for(int i=0;i<10;i++)
		{
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[10];
		System.out.println("Enter the elements of the second array : ");
		for(int i=0;i<10;i++)
		{
			arr2[i] = sc.nextInt();
		}
		boolean yes = Arrays.equals(arr1, arr2);
		if(yes == true)
		{
			System.out.println("equal");
		}
		else 
			System.out.println("not equal");
	}
}