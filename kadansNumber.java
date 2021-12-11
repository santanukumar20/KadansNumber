import java.util.*;
public class kadansNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the length of array");
        int l = s.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i <l; i++) {
            System.out.println("enter the array: ");
            arr[i] = s.nextInt();
        } 
        int max = arr[0];
        for (int i = 0; i < l; i++) {
           
            sum = sum + arr[i];
            if(sum>arr[0]) max = sum;
            if(sum<0) sum = 0; 
        }
        System.out.println(max);
    }
}
