import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList(10);

        // list.add(54);
        // list.add(43);
        // list.add(23);
        // list.add(53);
        // list.add(12);

        // list.remove(4);
        // System.out.println(list.contains(34));
        // System.out.println(list);c

        // input
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        // output
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}
