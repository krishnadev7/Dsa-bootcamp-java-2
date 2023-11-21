import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operator or press x to exit: ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }else if (op == '-') {
                    ans = num1 - num2;
                }else if (op == '*') {
                    ans = num1 * num2;
                }else if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }else if(op == '%'){
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid operator");
            }
        }
        System.out.println(ans);
    }
}
