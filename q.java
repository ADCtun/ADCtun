class Main
{
public static void main(String args[])
{
char ch='A';
for(int i=0;i<=4;i++)
{
for(int j=0;j<i+1;j++)
{
System.out.print(ch++);
}
System.out.println();
}
}
}