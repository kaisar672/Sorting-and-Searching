import java.util.Scanner;
public class InterpolationSearch {
    void input(int arr[],int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
    }
    int interpolSearch(int arr[],int key,int size){
            int low=0,high=size-1,pos=0,numer=0,denom=0,temp=0,sub=0;
            while(low<high){
                numer=key-arr[low];
                denom=arr[high]-arr[low];
                sub=high-low;
                temp=(numer/denom)*sub;
                pos=low+temp;
                if(arr[pos]==key){
                    System.out.println("Within Loop");
                    System.out.println("Element is Found at index "+pos);
                    return 0;
                }
                else if(key>arr[pos]){
                    low=pos+1;
                }
                else{
                    high=pos-1;
                }
            }
            if(high==low){
                if(arr[high]==key){
                    System.out.println("Element is Found at index "+high);
                    return 0;
                }
                else{
                    System.out.println("Element is not Found");
                    return 0;
                }
            }
            return 0;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        InterpolationSearch ob=new InterpolationSearch();
        ob.input(arr,size);
        System.out.println("Enter the Key");
        int key=scan.nextInt();
        ob.interpolSearch(arr,key,size);
    }
}
