interface MyInterface
{
   public void method1();
   public void method2();
}

class Sample implements MyInterface
{
  public void method1()
  {
      System.out.println("Interface Implementation for method1");
  }
  public void method2()
  {
      System.out.println("Interface implementation of method2");
  }
  public static void main(String arg[])
  {
      MyInterface obj = new Sample();
      obj. method1();
      obj.method2();
  }
}