import java.util.Scanner;
class uppervowel
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uppercase = 0, vowels = 0;
		char ch[] = new char[10];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<10;i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		for(int i=0;i<ch.length;++i)
		{
			if(Character.isUpperCase(ch[i]) == true)
				++uppercase;
			else if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				++vowels;
		}
		System.out.println("number of upper case : " + uppercase);
		System.out.println("number of vowels : " + vowels);
	}
}