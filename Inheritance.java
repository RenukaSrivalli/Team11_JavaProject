class Git1
{
public void parent()
{
System.out.println("Parent");
}
}
class Git2 extends Git1
{
public void child()
{
System.out.println("Child");
}
}
class Inheritence
{
public static void main(String args[]){
Git2 obj=new Git2();
obj.parent();
obj.child();
}
}
