

// link : https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedSortedArray {
        public static void main(String[] args) {
            int [] nums ={4,5,6,7,0,1,2};
            System.out.println(search(nums,0));
        }
        static int search(int[] nums, int target) {
            int pivot = findPivot(nums);
            if(pivot==-1) {
                return binnarySearch(nums, target,0,nums.length);
            }
            if(nums[pivot]==target) return pivot;
            if(target>=nums[0]){
                return binnarySearch(nums, target, 0, pivot-1);
            }

            return binnarySearch(nums, target, pivot+1, nums.length-1);

        }

        static int  findPivot(int [] nums){
            int start =0;
            int end = nums.length-1;
            while(start<=end){
                int mid = start+ (end-start)/2;
                if(mid<end && nums[mid]>nums[mid+1]){
                        return mid;
                }
                if(mid>start && nums[mid]<nums[mid-1]){
                    return mid-1;
                }
                if(nums[mid]<=nums[start]){
                    end=mid-1;
                }else{
                    start=mid-1;
                }
            }
            return -1;
        }

        static int binnarySearch(int [] nums,int target,int start,int  end){
            while(start<=end){
                 // step 1:  find the middle
                 // int mid=(start+end)/2;
                 int mid = start+(end -start)/2;
                if(target<nums[mid]){
                         end = end-1;
                     }else if(target>nums[mid]){
                         start=mid+1;
                     }else{
                         // ans found 
                         return mid;
                     }
             }
         return -1;
        } 
}
