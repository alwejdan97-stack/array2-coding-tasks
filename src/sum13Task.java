public class sum13Task {
    public static void main(String[] args){
        int[] number = {2, 1, 2, 13, 4};
        System.out.println("total count is: "+ sum13(number));
    }
    public static int sum13(int[] number){
        int sum = 0;
        for(int num : number){
            if(num == 13){
                break;
            }else{
                System.out.println(num + " ");
                sum++;
            }
        }return sum;
    }
}
