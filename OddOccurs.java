public class OddOccurs {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        /*
        when we do xor of same number then its produce 0
        it means if number occurs even number of time then ans gonna produce if number occurs odd
        number of times then it produces that number
        */
        int xxor=0;
        for(int i=0;i<nums.length;i++){
            xxor = xxor^nums[i];
        }
        return xxor;
    }
}
