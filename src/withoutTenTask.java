public class withoutTenTask {
    public static void main(String[] args){
        int[] number = {2, 3, 10, 2};
        number = withoutTen(number);
        for(int result : number) {
            System.out.println(result+" ");
        }
    }
    public static int[] withoutTen(int[] number){
        int[] result = new int[number.length];
        int i=0;
        for(int num : number){
            if(num!=10){
                result[i]=num;
                i++;
            }
        }
        return result;
    }
}
