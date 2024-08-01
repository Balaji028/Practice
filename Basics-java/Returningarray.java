import java.util.Scanner;

class IceCream
{
    public String Name;

    public IceCream(String Name)
    {
        this.Name = Name;

    }

    public String getName()
    {
        return Name;
    }

    public static  IceCream[] getDetails(int index)
    {
        System.out.println("In get getDetails");
        IceCream [] ice = new IceCream[index];

        System.out.println("The length of icecream array is"+ice.length);

        for(int i=0 ;i<ice.length;i++)
        {
            System.out.println("enter the values ");
            Scanner sc = new Scanner(System.in);
            String temp;
            temp =sc.nextLine();
            
            if(temp=="")
            {
                temp="vanilla";
            }
            ice[i]=new IceCream(temp);
            
        }

        return ice;


    }

}

public class Returningarray {

    public static void main(String[] args) 
    {
       IceCream[] s =  IceCream.getDetails(3);

       for(int i =0;i<s.length;i++)
       {
        System.out.println("The value is "+s[i].getName());
       }

    }
}