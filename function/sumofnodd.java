import java.util.*;
public class sumofnodd
{
    public static void sum(int n )
    { int sum = 0 ; 
        for (int i = 1; i <=n ; i++)
        { if ( i %2 == 1 ){
           sum =  sum + i ;
        }
           
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      //input 3 number
      System.out.println(" enter n number :");
      int a = sc.nextInt();
     sum( a );
    }}