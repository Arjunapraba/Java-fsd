package assisted_practice;
public class Bubble_Sort {

    public static void main(String[] args){

     int[] arr= {55,544,74,2,895};
     bubbleSort(arr);
     for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;
        for(int i=0;i<len;i++){
            for (int j=1;j<(len);j++){
                if(arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
                }
             }
             }
            }
          }
