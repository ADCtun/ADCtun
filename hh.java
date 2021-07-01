import java.util.*;
class Main
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
for(int i=3;i>=0;i--)
{
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}