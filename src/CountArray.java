import java.util.Scanner;

public class CountArray {
    public static int CountArray(int arr[]){
        int size= arr.length;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return size-count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        System.out.println("Enter the array values:");
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=CountArray(arr);
        System.out.println("Count Number "+count);


    }
}
