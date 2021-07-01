import java.util.Scanner;
class sample
{
public static void main(String args[])
{
int a;
int n;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter a value n: ");
n=sc.nextInt();
int product =1;
while (n > 0){
sum += n%10;
product*=n%10;
n/=10;
}
a=product-sum;
System.out.println("the output is :" +a);
}
}
