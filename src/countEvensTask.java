public class countEvensTask {
    public static void main(String[] args){
        int[] number = {2, 1, 2, 3, 4};
        System.out.println("total even is: "+countEvens(number));
    }
    public static int countEvens(int[] number){
        int count =0;
        for(int num : number){
        if(num % 2 == 0 ){
                System.out.println(num + " ");
                count ++;
            }
        }return count;
    }
}
