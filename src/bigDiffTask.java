public class bigDiffTask {
    public static void main(String[] args){
        int[] number = {2, 3, 10, 2};
        System.out.println(bigDiff(number));
    }
    public static int bigDiff(int[] number){
        int max = number[0];
        int mini= number[0];
        int result =0;
        for(int num: number){
            if(num > max){
                max= num;
            }else if(num< mini){
                mini= num;
            }
            result= max - mini;
        }
        return result;
    }
}
