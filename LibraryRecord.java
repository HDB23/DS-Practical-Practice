// Count avg
// Min Max
// Zero Borrows
// Frequency

import java.util.Scanner;

public class LibraryRecord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of library members : ");
        int n = sc.nextInt();

        int borrowCounts[] = new int[n];
        System.out.print("Enter library members : ");
        for(int i=0; i<borrowCounts.length; i++)
        {
            borrowCounts[i] = sc.nextInt();
        }

        // 1. Avg
        double avg = computeAvg(borrowCounts);
        System.out.println("Average of borrowings : " + avg);

        // 2. Min Max
        int extremes[] = findMinMax(borrowCounts);
        System.out.println("Lowest borrow counts : " + extremes[0]);
        System.out.println("Highest borrow counts : " + extremes[1]);

        // 3. Zero Borrows
        int zeroCounts = countZeroBorrowers(borrowCounts);
        System.out.println("Number of zero borrowings : " + zeroCounts);

        // 4. Frequency
        int mode = findMode(borrowCounts);
        System.out.println("Most frequent borrows : " + mode);

        sc.close();        
    }

    // 1. Avg
    static double computeAvg(int A[])
    {
        int sum = 0;
        for(int i=0; i<A.length; i++)
        {
            sum += A[i];
        }
        double avg = (double) sum/A.length;
        return avg;
    }

    // 2. Min Max
    static int[] findMinMax(int A[])
    {
        int min = A[0], max = A[0];
        for(int i=0; i<A.length; i++)
        {
            if(A[i] < min)
            {
                min = A[i];
            }
            if(A[i] > max)
            {
                max = A[i];
            }
        }
        return new int[]{min, max};
    }

    // 3. Zero Count
    static int countZeroBorrowers(int A[])
    {
        int count = 0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i] == 0)
            {
                count++;
            }
        }
        return count;
    }

    // 4. Frequency
    static int findMode(int A[])
    {
        int mode = A[0];
        int maxCount = 0;

        for(int i=0; i<A.length; i++)
        {
            int count = 0;
            for(int j=0; j<A.length; j++)
            {
                if(A[i] == A[j])
                {
                    count++;
                }
            }
            if(count > maxCount)
            {
                maxCount = count;
                mode = A[i];
            }
        }
        return mode;
    }
}