import java.lang.Math;
import java.util.Scanner;
class ArmstrongNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int temp,n;
temp=num;
n=num;
int rem;
double arm=0;
int count=0;
while(num!=0)
{
rem=num%10;
count++;
num=num/10;
}
while(temp!=0)
{
rem=temp%10;
arm=arm+Math.pow(rem,count);
temp=temp/10;
}
if(arm==n)
{
System.out.println(n+" is a armstrong number");
}
else
{

System.out.println(n+" is not a armstrong number");
}
}
}
