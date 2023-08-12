import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter youur positive integer :");
        int input = scanner.nextInt();
        System.out.println();

        int fact=1;
        
        for (int i = 1; i <= input; i++) {

            fact*=i; //fact=fact*i
            

        }
        System.out.println("factorial value is" + "=" + fact);

        /*
         import java.util.Scanner;

public class FactorialDemo1
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
       
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        
        System.out.println("Factorial: "+ fact);
    }
} 
         */
    }
}
