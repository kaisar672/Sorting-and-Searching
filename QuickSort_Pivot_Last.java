import java.util.Scanner;
public class QuickSort_Pivot_Last {
    void input(int arr[],int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Elements:");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
    }
    void quickSort(int arr[],int low,int high,int size){
        if(low<high){
            int pos=partition(arr,low,high);
            quickSort(arr,low,pos-1,size);
            quickSort(arr,pos+1,high,size);
        }
    }
    int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low,j=high;
        int flag=0;
        while(i<j){
            while(arr[i]<=pivot) {
                i++;
                if (i == (high + 1)) {
                    i = high;
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                break;
            while(arr[j]>=pivot){
                j--;
                if(j==(low-1) ){
                    j=pivot;
                    flag=1;
                    break;

                }
            }
            if(flag==1)
                break;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,high,i);
        return i;
    }
    void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void display(int arr[],int size){
        System.out.println("The Sorted Array is Given :");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        QuickSort_Pivot_Last obj=new QuickSort_Pivot_Last();
        obj.input(arr,size);
        int low=0;
        int high=size-1;
        obj.quickSort(arr,low,high,size);
        obj.display(arr,size);

    }
}
