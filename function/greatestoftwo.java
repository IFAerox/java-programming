import java.util.*;
public class greatestoftwo 
{
      public static void dec(int a ,int b  )
    { if(a > b )
        System.out.println("greater number " + a );
        else 
            System.out.println("greater number "+ b);
         
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      //input 3 number
      System.out.println(" enter a number :");
      int a = sc.nextInt();
       System.out.println(" enter b number :");
      int b = sc.nextInt();
     dec( a, b );
     sc.close();
    }}
