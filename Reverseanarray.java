
public class Reverseanarray{
    public static void main(String []args){
        int []arr ={1,2,3,4,5};
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static int [] Reverse(int[]num){
        int []temp = new int[num.length];
        // loop for new array to put values directly  5 4 3 2 1
        for(int i=0;i<num.length;i++){
             temp[i] = num[num.length-1-i];
        }
        for(int i=0;i<num.length;i++){
            num[i]= temp[i];
        }
        return num;
    }
}