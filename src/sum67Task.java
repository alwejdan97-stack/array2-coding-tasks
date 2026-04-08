public class sum67Task {
    public static void main(String[] args){
        int[] number = {2, 7, 10, 2};
        System.out.println(sum67(number));
    }
    public static int sum67(int[] number){
        int sum=0;
        boolean skip = false;
        for(int num : number){
            if (num == 6){
                skip =true;
                continue;
            }else if (num == 7 && skip){
                skip = false;
                continue;
            }else if(!skip) {
                sum = sum + num;
            }
        }
        return sum;
    }
}
