/**
 * Agnostic 
 * order agnotic binnary  search means deceding order of binnary search
 * 
 */
public class Agnostic {
    public static void main(String[] args) {

    }
    static int orderA(int []arr,int k){
        int start=arr[0];
        int end = arr.length-1;

        // find wheter the array is sorted in ascending &  deceiding 
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            // step 1:  find the middle
            // int mid=(start+end)/2;
            int mid = start+(end -start)/2;
           if(k<=arr[mid]){
                    end = end-1;
                }else if(k>=arr[mid]){
                    start=mid+1;
                }else{
                    // ans found 
                    return mid;
                }
        }
    }
    
}