class SingleTonDemo
{
    // static variable single_instance of type Singleton
    private static SingleTonDemo single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private SingleTonDemo()
    {
        s = "Hello I am a string part of Singleton class";
    }



    // static method to create instance of Singleton class
    public static SingleTonDemo getInstance()
    {
        if (single_instance == null)
            single_instance = new SingleTonDemo();

        return single_instance;
    }
}
class Main
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        SingleTonDemo x = SingleTonDemo.getInstance();

        // instantiating Singleton class with variable y
        SingleTonDemo y = SingleTonDemo.getInstance();
        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");

        // changing variable of instance y
        y.s = (y.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
    }
}