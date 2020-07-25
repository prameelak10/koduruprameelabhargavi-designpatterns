import java.util.Scanner;
interface Command
{
    public void execute();
}
class Light
{
    public void on()
    {
        System.out.println("Light is ON");
    }
    public void off()
    {
        System.out.println("Light is OFF");
    }
}
class LightOnCommand implements Command
{
    Light light;
    public LightOnCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
        light.on();
    }
}
class LightOffCommand implements Command
{
    Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
        light.off();
    }
}

class CommandDemo
{
    public static void main(String[] args)
    {
        int n;

        Scanner s = new Scanner(System.in);
        Light l=new Light();
        LightOnCommand l1=new LightOnCommand(l);
        LightOffCommand l2= new LightOffCommand(l);
        while(true)
        {
            System.out.println("Enter your command\n1.Light On\n2.Light Off\n3.Exit");
            n=s.nextInt();
            if(n==1)
            {
                l1.execute();
            }
            else if(n==2)
            {
                l2.execute();
            }
            else
            {
                System.out.println("Exit");
                break;
            }

        }
    }
}