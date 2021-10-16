
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// same for : https://leetcode.com/problems/find-peak-element/
public class PeakIndex {
    
}
public int peakIndexInMountainArray(int[] arr){
    int start = 0, end = arr.length - 1;
    while (start< end) {
        int mi = start+ (end - lo) / 2;
        if (arr[mi] < arr[mi + 1])
            start= mi + 1;
        else
            end = mi;
    }
    return start;
}