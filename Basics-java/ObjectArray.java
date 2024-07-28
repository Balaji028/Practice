class Sample
{

    int x;
    int y;

   
    protected Sample(int x,int y)
    {
        System.out.println("The two argument constructor is overloaded");
        this.x=x;
        this.y=y;      
    }
    protected Sample(float x,float y)
    {
        System.out.println("the two argument floating constructor is overloaded");
        this.x=(int)x;
        this.y=(int)y;
    }

    public int getDetails()
    {
        return (int)this.x+this.y;

    }




}


public class ObjectArray
{
    public static void main(String[] args) 
    {
        
        /* 
        Sample obj = new Sample(10,10);
        System.out.println(obj.getDetails());
        obj=null;
        

        Sample obj1 = new Sample(10.5f,20.56f);
        System.out.println(obj1.getDetails());*/

        Sample obj2= new Sample(18,20);
        System.out.println(obj2.getDetails());
        



        
    }
}