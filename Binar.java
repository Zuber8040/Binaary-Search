public class Binar{
   public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,10};
        int k=6;
        int ans = binnarySearch(arr, k);
        System.out.println(ans);
   }

//    return sthe index at which the element is present 

   static int binnarySearch(int [] arr,int k){

       int start = 0 ;
       int end=arr.length-1;
       while(start<=end){
            // step 1:  find the middle
            // int mid=(start+end)/2;
            int mid = start+(end -start)/2;
           if(k<arr[mid]){
                    end = end-1;
                }else if(k>arr[mid]){
                    start=mid+1;
                }else{
                    // ans found 
                    return mid;
                }
        }
    return -1;
   } 
}
