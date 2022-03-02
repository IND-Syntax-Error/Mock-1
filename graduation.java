import java.util.Scanner;
public class graduation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years[] = {1982,1987,1996,1999,2003,2006,2007,2009,2010};
        System.out.println("Enter graduation year : ");
        int year = sc.nextInt();
        int L = 0;
        int U = years.length - 1;
        int M = -1;
        while(L<=U)
        {
            int r = (L+U)/2;
            if(years[r]==year)
            {
                M = r;
                break;
            }
            else if(years[r]<year)
            {
                L = r + 1;
            }
            else
            {
                U = r - 1;
            }
        }
        if(M==-1)
            System.out.println("Record does not exist");
        else
            System.out.println("Record Exists");
    }
}