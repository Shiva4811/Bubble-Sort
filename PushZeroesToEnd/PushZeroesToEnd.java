//Push zeroes to the end of the array while maintaining the relative order of other elements
public class PushZeroesToEnd {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr={1,0,4,0,3,-40,100,0,5};
        System.out.println("The array is: ");
        print(arr);
        int noZ=0;
        for(int ele: arr){
            if(ele==0) noZ++;
        }
        for(int x=0; x<noZ; x++){
            for(int i=0; i<arr.length-1-x; i++){
                if(arr[i]==0){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("The resultant array is: ");
        print(arr);
    }
}
