public class matchUpTask {
    public static void main(String[] args){
        int[] number1 = {2, 5, 2, 3, 4};
        int[] number2 = {1, 2, 3, 5, 8};
        System.out.println("total count is: "+matchUp(number1,number2));
    }
    public static int  matchUp(int[] number1, int[] number2){
        int count = 0;
        for(int i=0; i<number1.length; i++){
              if(number1[i] != number2[i] && (Math.abs(number1[i] - number2[i])<=2)){
                  count++;
              }
        }return count;
    }
}
