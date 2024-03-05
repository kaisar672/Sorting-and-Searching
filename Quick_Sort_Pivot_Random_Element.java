import java.util.Scanner;
import java.util.Random;
public class Quick_Sort_Pivot_Random_Element {
    void input(int arr[], int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Elements :");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
    }
    void quickSort(int arr[],int low,int high){
        int index;
        if (low < high) {
            Scanner scan=new Scanner(System.in);
//            while(true){
//                System.out.println("Enter The pivot Element' index from  "+low+" to "+high);
//                index=scan.nextInt();
//                if(index>=low && index<=high){
//                    break;
//                }
//                else{
//                    System.out.println("You have not Entered valid index :");
//                    System.out.println("Enter the valid index :");
//                    continue;
//                }
//            }
            Random ran=new Random();
            index=ran.nextInt(high-low)+low;
            System.out.println("Random value selected is "+arr[index]);
            this.swap(arr,low,index);
            int pos=partition(arr,low,high);
            quickSort(arr,low, pos-1);
            quickSort(arr,pos+1,high);
        }
    }
    int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int flag=0;
        int i=low,j=high;
        while(i<j){

            while(arr[i]<=pivot){
                i++;
                if( i==(high+1) ){
                    flag=1;
                    i=low;
                    break;
                }
            }
            while(arr[j]>=pivot){
                j--;
                if( j==(low-1) ){
                    j=low;
                    break;
                }
            }
            if(flag==1)
                break;
            if(i<j)
                this.swap(arr,i,j);
        }
        this.swap(arr,low,j);
        return j;
    }
    void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    void display(int arr[],int size){
        System.out.println("The sorted Array is Given :");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Quick_Sort_Pivot_Random_Element obj=new Quick_Sort_Pivot_Random_Element();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size=scan.nextInt();
        int arr[]=new int[size];
        obj.input(arr,size);
        int low=0;
        int high=size-1;
        obj.quickSort(arr,low,high);
        obj.display(arr,size);

    }
}
