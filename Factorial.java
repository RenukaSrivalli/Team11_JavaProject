import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int fact=1;
if(num==0)
{
System.out.println("Factorial of a number "+num+" is 1");
}
else
{
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of a number "+num+" is "+fact);
}
}
}