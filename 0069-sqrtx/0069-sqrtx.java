class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
//         int start = 0;
//         int end = x;
//         int ans = 0;

//         while (start < end) {

//             int mid = start + (end - start) / 2;

//             if (mid * mid == x) {
//                 return mid;
//             } else if (mid * mid < x) {
//                 start = mid + 1;
//                 ans = mid;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return ans;
    }
}