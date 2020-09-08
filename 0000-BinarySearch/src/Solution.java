/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-08
 *二分查找也称为折半查找，每次都能将查找区间减半，这种折半特性的算法时间复杂度为 O(logN)。
 * l + r
 * l + h 可能出现加法溢出，也就是说加法的结果大于整型能够表示的范围。但是 l 和 h 都为正数，因此 h - l 不会出现加法溢出问题。所以，最好使用第二种计算法方法。
 *
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Solution.binarySearch(nums,7));
    }
    public static int binarySearch(int[] nums, int key){
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int m = l + ( r - l )/2;
            if (nums[m] == key){
                return m;
            }else if (key>nums[m]){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return -1;
    }
}
