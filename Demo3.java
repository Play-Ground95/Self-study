import java.util.Scanner;

public class Demo3 {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter youur positive integer :");
         int input=scanner.nextInt();
         System.out.println();

         for (int i = 1; i <= 10; i++) {
            System.out.println(input+"X" +i +"="+(input*i));
         }



         /*
           Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
          */
         
        
    }
}
