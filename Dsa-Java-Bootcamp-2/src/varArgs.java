import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,4,5,5,4,3,52,53,64);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
