import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        int[] arr={4,2,5,-1,0};
        int min = arr[0];
        int max = arr[0]; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("minimum value:"+min);
        System.out.println("maximum value:"+max);
    }
    
}
