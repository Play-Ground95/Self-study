import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your base :");
        int base = scanner.nextInt();
        System.out.println();
        System.out.print("Enter your power :");
        int power = scanner.nextInt();

        int result=1;
        for (int i = 1; i <=power; i++) {
            result*=base; //rsl=rsl*base-->1*2-->2*2
        }
        System.out.println("result is :"+result);
    }
}
