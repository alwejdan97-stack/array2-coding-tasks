public class no14Task {
    public static void main(String[] args){
        int[] number = {2, 5, 2, 3, 4};
        System.out.println(no14(number));
    }
    public static boolean no14(int[] number){
        for(int num: number){
            if(num == 1 || num == 4 || (num == 1 && num == 4)){
                return false;
            }
        }return true;
    }
}
