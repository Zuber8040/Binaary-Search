public class TwoSum {
    public static void main(String[] args) {
        int [] numbers ={2,7,11,15};
        int target =9;
        int[] ans = twoSum(numbers, target);
        System.out.println(ans);
    }
    static int[] twoSum(int [] numbers,int target){
        int[] ans={-1,-1};
        for(int i=1;i<numbers.length;i++){
            for(int j=1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                } 
            }
        }
    return ans;
    
    }
}
