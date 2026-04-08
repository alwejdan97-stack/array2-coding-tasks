public class fizzBuzzTask {
    public static void main(String[] args){
        int a = 2;
        int b = 6;
        String[] result=fizzBuzz(a,b);
        for(String output : result){
            System.out.println(output+" ");
        }
    }
    public static String[]  fizzBuzz(int a, int b){
        String[] result=new String[b-a];
        int index=0;
        for(int i= a; i < b; i++) {
            if (i % 15 == 0) {
                result[index] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index] = "Fizz";
            }else if(i % 5 == 0){
                result[index] = "Buzz";
            }else{
                result[index]=Integer.toString(i);
            }
            index++;
        }
        return result;
    }
}
