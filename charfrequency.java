import java.util.*;
class charfrequency
{
	public void Frequency(String str)
	{
		int len = str.length();
		int freq = 0, count = 0, mx = 0, gap = 0;
		System.out.println("Character\tFrequncy");
		for(int i=0;i<len;i++)
		{
			freq = 0;
			count = 1;
			for(int x=i-1;x>=0;x--)
			{
				if(str.charAt(x) == str.charAt(i))
				{
					freq = 1;
					break;
				}
			}
			if(freq == 0)
			{
				for(int x=i+1;x<len;x++)
				{
					if(str.charAt(x) == str.charAt(i))
						count++;
				}
				System.out.println(str.charAt(i) + "\t" + count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		charfrequency frequ = new charfrequency();
		frequ.Frequency(str);
	}
}