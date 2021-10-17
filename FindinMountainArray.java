/**
 * FindinMountainArray
 */

// link :https://leetcode.com/problems/find-in-mountain-array/
public class FindinMountainArray {
    
}

int search (int [] arr ,int target){
    int peak = peakIndexInMountainArray(arr);
    int firstTry = orderAgnosticBS(arr, target,0,peak);
    if(firstTry!=-1) return firstTry;

    return orderAgnosticBS(arr, target, peak+1, arr.length-1)
}
public int peakIndexInMountainArray(int[] arr){
    int start = 0, end = arr.length - 1;
    while (start< end) {
        int mi = start+ (end - start) / 2;
        if (arr[mi] < arr[mi + 1])
            start= mi + 1;
        else
            end = mi;
    }
    return start;
}
 int orderAgnosticBS(int[] arr, int target,int start,int end ) {
  

    // find whether the array is sorted in ascending or descending
    boolean isAsc = arr[start] < arr[end];

    while(start <= end) {
        // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return -1;
}
