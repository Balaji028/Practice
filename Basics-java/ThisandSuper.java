class Sample1
{
    public Sample1()
    {
        
        this(10);
        System.out.println("in no argument constrcutor");

    }

    public Sample1(int x)
    {
        
        this(x,x+9);
        System.out.println("one argument constructor");
    }

    public Sample1(int x,int y)
    {
        System.out.println(x+y);
        System.out.println("two argument constrcutor");
    }
}




public class ThisandSuper
{
    public static void main(String[] args)
    {
        Sample1 obj = new Sample1();
        
        
    }
}