class Method
{
void add()
{
System.out.println("Hi");
}
static void ready()
{
System.out.println("Welcome");
}
Method(int a)
{
System.out.println("Value of a is"+a);
}

public static void main(String args[])
{
Method obj=new Method(10);
obj.add();
ready();
}
}