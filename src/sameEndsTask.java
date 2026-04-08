public class sameEndsTask {
    public static void main(String[] args){
        int num = 2;
        int[] number = {2, 3, 4, 2};
        int[] number1 = {3, 3, 4, 5};

        System.out.println(sameEnds(number,num));
        System.out.println(sameEnds(number1,num));

    }
    public static boolean sameEnds(int[] number, int num){
        //if(num>=0 && num<=number.length ) {
            for (int i = 0; i < num; i++) {
                if (number[i]!=number[number.length-num+i]) {
                    return false;
                }
            }
            return true;
    }
}
