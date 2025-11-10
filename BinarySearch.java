import java.util.Scanner;

public class BinarySearch {
    static void bubbleSort(int A[])
    {
        for(int i=0; i<A.length; i++)
        {
            for(int j=i+1; j<A.length; j++)
            {
                if(A[i] > A[j])
                {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
    }

    static int binarySearch(int A[], int left, int right, int x)
    {
        while(left <= right)
        {
            int mid = (left + right)/2;

            if(A[mid] == x)
            {
                return A[mid];
            }
            else if(A[mid] > x)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int customerID[] = {1004, 1003, 1006, 1007, 1008, 1010, 1001, 1002, 1005, 1009};
        System.out.print("Customer IDs : ");
        for(int i=0; i<customerID.length; i++)
        {
            System.out.print(customerID[i] + ", ");
        }

        bubbleSort(customerID);

        try
        {
            System.out.print("\nEnter the ID to find : ");
            int x = sc.nextInt();
            int n = customerID.length;
            int result = binarySearch(customerID, 0, n-1, x);
    
            if(result == -1)
            {
                System.out.println("Customer ID "+ x + " is not Found");
            }
            else
            {
                System.out.println("Customer ID " + x + " is found at index " + result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a integer value !");
        }
    }
}
