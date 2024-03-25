import java.util.Scanner;
public class Max_Min {
    void input(int arr[],int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Elements :");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
    }
    void findMaximum_Minimum(int arr[],int size){
        int max=arr[0],min=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Maximum element is "+max);
        System.out.println("Minimum Element is "+min);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Size of Array : ");
        int size=scan.nextInt();
        int arr[]=new int[size];
        Max_Min obj=new Max_Min();
        obj.input(arr,size);
        obj.findMaximum_Minimum(arr,size);
    }
}
