abstract class electro
{
public abstract void on();
public abstract void off();
public void charge()
{
System.out.println("Put charging");
}
}
public class Mobile extends electro
{
public void on()
{
System.out.println("Mobile is ON");
}
public void off()
{
System.out.println("Mobile is OFF");
}

public static void main(String arg[])
{
Mobile m=new Mobile();
m.on();
m.off();
m.charge();
}
}