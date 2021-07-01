import java.util.*;
class Main
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=4;i>=0;i--)
{
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}