public class BubbleSort {
    public static void main(String[] args)
    {
        int emloyeeSalaries[] = {80000, 90000, 10000, 30000, 20000, 40000, 50000, 60000, 70000, 100000};
        System.out.print("Employee salary before sort : ");
        for(int i=0; i<emloyeeSalaries.length; i++)
        {
            System.out.print(emloyeeSalaries[i] + " ");
        }

        int temp = 0;
        for(int i=0; i<emloyeeSalaries.length; i++)
        {
            for(int j=i+1; j<emloyeeSalaries.length; j++)
            {
                if(emloyeeSalaries[i] > emloyeeSalaries[j])
                {
                    temp = emloyeeSalaries[i];
                    emloyeeSalaries[i] = emloyeeSalaries[j];
                    emloyeeSalaries[j] = temp;
                }
            }
        }

        System.out.println("Employee salaries after sort : ");
        for(int i=0; i<emloyeeSalaries.length; i++)
        {
            System.out.print(emloyeeSalaries[i] + " ");
        }

        System.out.println("\nTop 5 employee salaries : ");
        for(int i=emloyeeSalaries.length-1; i>=emloyeeSalaries.length-5; i--)
        {
            System.out.print(emloyeeSalaries[i] + " ");
        }
    }
}
