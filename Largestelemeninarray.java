public class Largestelemeninarray {
    public static void main(String[]args){
        int []arr={2,6,4,7,8,10,9};
        largest(arr);
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int largestnumber = arr[arr.length-1];
        System.out.println("The largest element in the array is:"+largestnumber);
    }
    public static int [] largest(int[]arr){
        for(int i=0;i<arr.length-1;i++) //Bubblesort For the number of passes n-1
        {
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
        return arr;
    }
    
}
