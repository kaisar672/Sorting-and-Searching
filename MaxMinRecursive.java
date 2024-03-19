import java.util.Scanner;
public class MaxMinRecursive {
    int max2=Integer.MIN_VALUE;
    int min2=Integer.MAX_VALUE;
    void input(int arr[], int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Elements :");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
    }
    int find_Max_min_Recursively(int arr[],int i,int j){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        if(j==i+1 || i==j){
            if(arr[i]>=arr[j]){
                max=arr[i];
                min=arr[j];
            }
            else{
                max=arr[j];
                min=arr[i];
            }
            if(max>max2){
                max2=max;
            }
            if(min<min2){
                min2=min;
            }
            return 0;
        }
        else {
            int mid = (i+j)/2;
            find_Max_min_Recursively(arr,i,mid);
            find_Max_min_Recursively(arr,mid+1,j);
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println("Enter the Size of Array:");
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        MaxMinRecursive obj=new MaxMinRecursive();
        obj.input(arr,size);
        int i=0;
        int j=size-1;
        obj.find_Max_min_Recursively(arr,i,j);
        System.out.println("The Maximum Element in the array is : "+obj.max2);
        System.out.println("The Mininmum Element in the array is : "+obj.min2);
    }
}
