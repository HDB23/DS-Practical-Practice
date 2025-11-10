import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int customerID[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010}; 
        System.out.print("Enter a key : ");
        try
        {
            int key = sc.nextInt();
            boolean flag = false;

            for(int i=0; i<customerID.length; i++)
            {
                if(key == customerID[i])
                {
                    flag = true;
                }
            }
            if(flag == true)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter integer value !");
        }

        sc.close();
    }
}