public class modThreeTask {
    public static void main(String[] args){
        int[] number = {2, 3, 4, 5};
        System.out.println(modThree(number));
    }
    public static boolean modThree(int[] number){
        for(int i=0; i< number.length-2; i++){
            if (number[i]%2==0 && number[i+1]%2==0 && number[i+2]%2==0) {
                return true;
            }else if(number[i]%2!=0 && number[i+1]%2!=0 && number[i+2]%2!=0) {
                return true;
            }
        }
            return false;
    }
}
