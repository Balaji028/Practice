import java.util.Scanner;

class Icecream
{

    

    public IceCream[] storeDetailsinIceCreamArray(int index)
    {
        String name;
        Icecream[] ice = new Icecream[index];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<ice.length;i++)
        {
            name = sc.nextLine();
            if(name =="")
            {
                name ="Vanilla";
                ice[i]=name;

            }
            else
            {
                ice[i]=name;
            } 
        }
    }

    protected void displayingDetails(IceCream ice)
    {
        for(int )

    }

}