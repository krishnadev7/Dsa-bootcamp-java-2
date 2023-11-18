public class reverseOfNumber {
    public static void main(String[] args) {
        int num = 32323;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if(rem == 3){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
