public class BasicArray
{
    public static void main(String[] args)
    {

        int [] x = new int[10];
        print(x);
        modify(x);
        print(x);

    }

    public static void modify(int[] ref)
    {
        for(int i =0;i<ref.length;i++)
        {
          ref[i]=i;

        }
    }

    public static void  print(int[] ref)
    {
        for(int i =0;i<ref.length;i++)
        {
            System.out.println("The value at " +i + " is = "+ref[i]);
        }
    }
}