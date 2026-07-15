package Daily_Learning.Day_10_Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,25,66,0,54};
        int j =0;
        for(int i =0 ; i< arr.length ; i++){
            if (arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j] = 0;
            j++;
        }
        for (int ele : arr){
            System.out.print(ele +" ");
        }

    }
}
