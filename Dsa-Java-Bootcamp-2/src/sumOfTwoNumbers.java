import java.util.Scanner;

public class sumOfTwoNumbers {

    public static void main(String[] args) {
        int a = 40;
        int b = 50;

        Sum(a,b);
        
    //    int sum = Sum();
    //    System.out.println("Sum is: " + sum);
    }
    // static int Sum(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter first Number: ");
    //     int num1 = input.nextInt();
    //     System.out.println("Enter second Number: ");
    //     int num2 = input.nextInt();
    //     int sum = num1 + num2;
    //     return(sum);
    // }

    // using arguments and parameters
        static void Sum(int a, int b){
            int sum = a + b;
            System.out.println(sum);
        }
}
