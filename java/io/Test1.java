import java.io.IOException;
import java.io.StringReader;

public class Test1 {

    public static void main(String[] args) {

        StringReader c = new StringReader("abcdefghijklmnopqrstuvwxyz");

        char s[] = new char[18];

        try {
            int g =c.read(s,2,9);
            System.out.println(g);
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("in exception");

        }

        System.out.println("The length of s is "+s.length);

        System.out.println("++++++++++++++++++++++");

        // System.out.println(s[0]);
        // System.out.println(s[1]);
        System.out.println(s[2]);
        // System.out.println(s[3]);
        // System.out.println(s[4]);


        // for(int i =0;i<s.length;i++)
        // {
        //     System.out.print(s[i]);
        // }

        


        // try {

        //     int k =c.read();
        //     System.out.println(k);
            
        // } catch (IOException e) {
            
        //     System.out.println("in catch");
        // }

        // char d[] ={'A','B','l'};

        // try{
        // int h =c.read();
        // System.out.println(h);
        // }
        // catch(IOException e)
        // {
        //     System.out.println("in catch");
        // }



        



        






        


    }
}