import java.util.Scanner;
class RaceCar
{


    public int id;
    public String name;


    public RaceCar(int id,String name)
    {
        System.out.println("in Racecar constructor");
        this.id=id;
        this.name=name;
    }

    public String getCarName()
    {
        return this.name;
    }

    public int getCarID()
    {
        return this.id;
    }

    public void carNameandID()
    {
        System.out.println("The value is "+this.id +"  "+ " TheCarname is  "+this.name);
    }

}




  public class CustomArray
  {
    public static void main(String[] args) 
    {
           System.out.println("how many car details needed to be entered");
           Scanner sc = new Scanner(System.in);
           int noOfCar = sc.nextInt();
           
           

           RaceCar[] obj = new RaceCar[noOfCar];

           System.out.println("The length of Race car is "+obj.length);

           System.out.println("now entering the details of the  car");

           for(int i =0;i<obj.length;i++)
           {
               int id ;
               String name;
               
               id = sc.nextInt();
               name =sc.nextLine();
               obj[i]= new RaceCar(id,name);

           }

           for(int i =0;i<obj.length;i++)
           {
             System.out.println("The value of car is "+i );
             obj[i].getCarID();
             obj[i].getCarName();
             obj[i].carNameandID();

           }





        
    }
  }