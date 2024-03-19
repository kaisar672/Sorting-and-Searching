import java.util.Scanner;
public class ExponentialSearch {
    int size;
    void input(int arr[],int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }

    }
    String exponentialSearch(int arr[],int key,int size){
        int low=0,mid=0;
        if(arr[0]==key){
            return "Element is found";
        }
        int high=1;
        while(arr[high]<=key){
            if(arr[high]==key){
                return"Element is Found";
            }
            else{
                low=high;
                high=high=high*2;
             //   System.out.println("high = "+high);
                if(high>(size-1) ){
                   high=size-1;
                   break;
                }
            }
        }
     //   System.out.println(arr[low]);
     //   System.out.println(arr[high]);
        //From Here it is Binary Search.
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                return"Element is Found";
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(low>high) {
            return "Element is Not Found";
        }
        return"0";
    }
    public static void main(String[] args){
        ExponentialSearch ob=new ExponentialSearch();
        Scanner scan=new Scanner(System.in);
        int arr[];
        System.out.println("Enter the size of Array");
        int size=scan.nextInt();
        arr=new int[size];
        ob.input(arr,size);
        System.out.println("Enter the key value");
        int key=scan.nextInt();
        String str=ob.exponentialSearch(arr,key,size);
        System.out.println(str);

    }
}
