import java.util.Scanner;
class SumOfDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int n;
n=num;
int rem;
int sum=0;
while(num!=0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("sum of digits of number "+n+" is "+sum);
}
}