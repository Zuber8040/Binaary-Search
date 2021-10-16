// import java.lang.Thread.State;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
        int ans = findPos(arr,10);
        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
    static int findPos(int[] arr,int target ){
        int start =0;
        int end =1;
        while(target>arr[end]){
                // take new start 
                int temp = end +1;
                // now double the size 
                // end = prev.end + sizeofbox*2;
                end = end +(end-start+1)*2;
                start = temp;
        }
        return binnarySearch(arr, target, start, end);
    }
    
    static int binnarySearch(int [] arr,int target,int start,int end){
        while(start<=end){
             // step 1:  find the middle
             // int mid=(start+end)/2;
             int mid = start+(end -start)/2;
            if(target<arr[mid]){
                     end = end-1;
                 }else if(target>arr[mid]){
                     start=mid+1;
                 }else{
                     // ans found 
                     return mid;
                 }
         }
     return -1;
    } 
}
