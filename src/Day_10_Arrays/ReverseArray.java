package Day_10_Arrays;

public class ReverseArray {
   public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30};
        reverseArray(arr);

    }
    static void reverseArray(int [] arr){
       int starting = 0;
       int ending = arr.length-1;

       while(starting<=ending){
           int temp = arr[starting];
           arr[starting] = arr[ending];
           arr[ending] = temp;
           starting++;
           ending--;

       }
       for(int ele : arr){
           System.out.print(ele + " ");
       }
    }
}
