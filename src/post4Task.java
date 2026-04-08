public class post4Task {
    public static void main(String[] args){
        int[] number = {2, 3, 4, 2};
        number = post4(number);
        for(int result:number){
            System.out.println(result);
        }
    }
    public static int[] post4(int[] number){
        int last=-1;
        for(int i=0; i<number.length;i++){
            if(number[i]==4){
                last=i;
            }
        }
        int[] result = new int[number.length-last-1];
        int index=0;
        for(int i=last+1; i< number.length; i++){
            result[index]=number[i];
            index++;
        }
        return result;
    }
}
