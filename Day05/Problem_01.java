import java.util.Scanner;
abstract class smartdevice
{
    abstract void turnOn();
    abstract void turnOff();
}
public class smartAc extends smartdevice
{
    public void turnOn()
    {
        System.out.println("Smart AC is turned ON");
    }
    public void turnOff()
    {
        System.out.println("Smart AC is turned OFF");
    }
}
class smartTv extends smartdevice
{
    public void turnOn()
    {
        System.out.println("Smart TV is turned ON");
    }
    public void turnOff()
    {
        System.out.println("Smart TV is turned OFF");
    }
}
public class smartFan extends smartdevice
{
    public void turnOn()
    {
        System.out.println("Smart Fan is turned ON");
    }
    public void turnOff()
    {
        System.out.println("Smart Fan is turned OFF");
    }
}
public class smartLight extends smartdevice
{
    public void turnOn()
    {
        System.out.println("Smart Light is turned ON");
    }
    public void turnOff()
    {
        System.out.println("Smart Light is turned OFF");
    }
}

public class Problem_01
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the smart device to operate (AC/TV/Fan/Light): ");
    System.out.println(1. smart Ac\n2. smart Tv\n3. smart Fan\n4. smart Light);

    smartdevice device = null;

    int choice = sc.nextInt();

    switch (choice)
    {
        case 1: device = new smartAc();break;
        case 2: device = new smartTv();break;
        case 3: device = new smartFan();break;
        case 4: device = new smartLight();break;
        default: System.out.println("Invalid choice"); return;
    }
    if (device != null)
    {
        System.out.println("1. Turn ON\n2. Turn OFF");
        int option = sc.netInt();

        if(option == 1) device.turnOn();
        else if(option == 2) device.turnOff();
        else System.out.println("Invalid option");
    }
}
}