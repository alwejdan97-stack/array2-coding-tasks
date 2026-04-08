public class lucky13Task {
    public static void main(String[] argst){
        int[] number = {2, 5, 2, 3, 4};
        System.out.println(lucky13(number));
    }
    public static boolean  lucky13(int[] number){
        for(int num : number) {
            if (num == 0 || num == 3) {
                return false;
            }
        }return true;
    }
}
