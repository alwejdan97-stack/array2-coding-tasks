public class fizzArrayTask {
    public static void main(String[] args){
        int number = 10;
        int[] nums = fizzArray(number);
        for(int num: nums){
            System.out.println(num+" ");
        }
    }
    public static int[] fizzArray(int number){
        int[] nums = new int[number];
        for(int i=0; i< number; i++){
            nums[i] = i;
        }
        return nums;
    }
}
