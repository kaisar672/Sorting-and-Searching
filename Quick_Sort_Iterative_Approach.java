import java.util.Scanner;
public class Quick_Sort_Iterative_Approach {
    int low,high,top=-1;
    void input(int arr[],int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Elements:");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
    }
    void quickSort(int arr[],int size){
        // int top=-1;
     //   System.out.println("Inside QuickSort");
        int stak[]=new int[10];
        stak[++top]=high;
        while(low<high){
            System.out.println("low="+low);
            System.out.println("High="+high);
            System.out.println("*********************");
            int pos=partition(arr,size);

            if(pos==low){
                low=pos+1;
                stack(stak);
                continue;
            }
            if(pos==high){
                high=pos-1;
                stack(stak);
                continue;
            }
            if(pos!=low && pos!=high){
                stak[++top]=pos;
                high=pos-1;
                stack(stak);
            }
        }
    }
    void stack(int stak[]){
       // System.out.println("inside Stack");
        if(low==high && top>0){
            low=stak[top]+1;
            top--;
            if(top==0){
                high=stak[top];
          //      top--;

            }
            else{
                high=stak[top]-1;
            }
        }
    }
    int partition(int arr[],int size){
     //   System.out.println("Inside Partititon");
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
//        System.out.println("*************************");
//        for(int x=0;x<size;x++){
//            System.out.println(arr[x]);
//        }
        return j;
    }
    void swap(int arr[],int low,int high){
      //  System.out.println("Inside Swap");
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    void display(int arr[],int size){
        System.out.println("The Sorted Array is Given:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Quick_Sort_Iterative_Approach obj=new Quick_Sort_Iterative_Approach();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The size of Array:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        obj.input(arr,size);
        obj.low=0;
        obj.high=size-1;
        obj.quickSort(arr,size);
        obj.display(arr,size);

    }
}
