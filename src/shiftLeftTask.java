public class shiftLeftTask {
    public static void main(String[] args){
        int[] number = {2, 3, 4, 2};
        number = shiftLeft(number);
        for(int result : number){
            System.out.println(result+" ");
        }
    }
    public static int[] shiftLeft(int[] number){
        int first = number[0];
        for(int i=0; i< number.length-1; i++){
            number[i]=number[i+1];
        }
        number[number.length-1]=first;
        return number;
    }
}
