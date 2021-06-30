import java.util.Scanner;  
class Main  
{  
public static void main(String arg[]){  
int n,number, sum;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");   
number=sc.nextInt();
n=number;  
for(sum=0; number!=0; number=number/10){      
sum = sum + number % 10;  
}  
if(n%sum == 0)  
System.out.println(n + " is a harshad number");  
else  
System.out.println(n + " is not a harshad number");  
} 
}