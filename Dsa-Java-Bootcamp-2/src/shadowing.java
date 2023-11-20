public class shadowing {
   static int x = 90; // this will shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // 90 will replace by 40 known as shadowing;
        System.out.println(x); // 40
        function();
    }

    static void function(){
        System.out.println(x);
    }
}
