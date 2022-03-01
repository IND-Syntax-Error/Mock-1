import java.util.Scanner;
public class exchange
{
    String sent,rev;
    int size;
    exchange()
    {
        sent="";
        rev="";
        size=0;
    }

    void readsentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence");
        sent=sc.nextLine();
        size=sent.length();
    }

    void exfirstlast()
    {
        char ch=' ';
        String wd="";
        for(int i=0;i< size;i++)
        {
            ch=sent.charAt(i);
            if(ch==' '||ch=='.')
            {
                if(wd.length()>1)
                {
                    /*last character*/
                    rev=rev + wd.charAt(wd.length()-1);
                    /*middle characters*/
                    rev=rev + wd.substring(1,wd.length()-1);
                    /*first character*/
                    rev=rev + wd.charAt(0);
                    /*space or full stop*/
                    rev=rev+ch;
                }
                else
                {
                    rev=rev+wd+ch;
                }

                wd="";
            }
            else
            {
                wd=wd+ch;
            }
        }
    }

    void display()
    {
        System.out.println("Input:"+sent);
        System.out.println("Output: "+rev);
    }

    public static void main()
    {
        Exchange obj1=new Exchange();
        obj1.readsentence();
        obj1.exfirstlast();
        obj1.display();
    }
}
