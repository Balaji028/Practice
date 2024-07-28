
class Test
{
    public static void Check(int x)
    {
        System.out.println("x is overloaded with one arg");
    }

    public static void Check(int x ,int y)
    {
        System.out.println("x any y are overloaded with two arguments");
    }

    public static int Check(int x,int y,int z)
    {
        System.out.println("x ,y,z are overloaded");
        return x+y+z;
    }
}



public class Overloading {

    public static void main(String[] args) 
    {
        Test.Check(0);
        Test.Check(2, 3);
        Test.Check(2, 2, 2);
        
        
    }
}