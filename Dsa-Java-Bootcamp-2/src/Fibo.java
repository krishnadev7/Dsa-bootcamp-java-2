import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(n >= count){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }  
}