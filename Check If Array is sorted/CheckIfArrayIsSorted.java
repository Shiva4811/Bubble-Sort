public class CheckIfArrayIsSorted {
    public static void main(String args[]){
        int[] arr={1,2,4,5,3,6};
        boolean flag=true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                flag=false;
                break;
            }
        }
        if(flag==false) System.out.println("Array is not sorted.");
        else   System.out.println("Array is sorted.");
    }
}
