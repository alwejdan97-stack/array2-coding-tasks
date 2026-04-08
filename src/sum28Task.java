public class sum28Task {
    public static void main(String[] args){
        int[] number = {2, 7, 10, 2, 2, 2};
        System.out.println(sum28(number));
    }
    public static boolean  sum28(int[] number){
        int sum =0;
        for(int num : number){
            if(num==2) {
                sum = sum + num;
            }
        }
        if(sum == 8){
            return true;
        }else{
            return false;
        }
    }
}
