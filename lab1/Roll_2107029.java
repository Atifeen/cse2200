import java.util.Scanner;

public class Roll_2107029 
{


   public static void main(String[] args)
   {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    n = sc.nextInt();
    int [] arr  = new int[n];

    System.out.println("Enter the elements of array:");
    for(int i=0; i<n; i++)
    {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Enter the number to search:");
    int search = sc.nextInt();

    int count = 0;
    for (int i=0; i<n; i++)
    {
      if (arr[i] == search)
      {
        count += 1;
      }
    }

    System.out.println("The number of occurrences of " + search + " is: " + count);
    sc.close();

   }
}
