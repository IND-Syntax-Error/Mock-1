import java.util.*;
class fibonachi
{
String x,y,z;
int n;
fibonachi()
{
x="a";
y="b";
z="ba";
}
void accept()
{
Scanner Sc = new Scanner (System.in);
System. out.println ("Enter number of terms");
n = Sc.nextInt();
}
void generate()
{
System. out.print(x+","+y);
for(int i=0; i<=n-2; i++)
{
System.out.print(","+z);
x=y;
y=z;
z=y+x; 
}
}
static void main()
{ 
fibonachi obj=new fibonachi();
obj.accept();
obj.generate();
}
}
