public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 43 ,54, 65, 34};
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
