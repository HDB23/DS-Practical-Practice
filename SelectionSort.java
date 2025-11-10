public class SelectionSort {
    public static void main(String[] args)
    {
        int employeeSalaries[] = {80000, 90000, 10000, 30000, 20000, 40000, 50000, 60000, 70000, 100000};
        System.out.print("Employee Salaries : ");
        for(int i=0; i<employeeSalaries.length; i++)
        {
            System.out.print(employeeSalaries[i] + " ");
        }
        int temp = 0;
        for(int i=0; i<employeeSalaries.length; i++)
        {
            int smallest = i;
            for(int j=i+1; j<employeeSalaries.length; j++)
            {
                if(employeeSalaries[j] < employeeSalaries[smallest])
                {
                    smallest = j;
                }
            }
            temp = employeeSalaries[i];
            employeeSalaries[i] = employeeSalaries[smallest];
            employeeSalaries[smallest] = temp;
        }

        System.out.print("\nEmployee Salaries after sort : ");
        for(int i=0; i<employeeSalaries.length; i++)
        {
            System.out.print(employeeSalaries[i] + " ");
        }
        System.out.println("\nTop 5 employee salaries are : ");
        for(int i=employeeSalaries.length - 1; i>=employeeSalaries.length - 5; i--)
        {
            System.out.print(employeeSalaries[i] + " ");
        }
    }
}
