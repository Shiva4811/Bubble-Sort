public class BubbleSortArrayOptimized {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,5,-1,32,23,31};
        System.out.println("The array elements are: ");
        int n=arr.length;
        for(int x=0; x<n-1; x++){
            boolean flag=true;
            for(int i=0; i<n-1-x; i++){
                if(arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }
}
