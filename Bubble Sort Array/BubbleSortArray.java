public class BubbleSortArray {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,-4,10,5,9};
        System.out.println("The array elements are: ");
        print(arr);
        int n=arr.length;
        for(int x=0; x<n-1; x++){
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("The sorted array elements are: ");
        print(arr);
    }
}
