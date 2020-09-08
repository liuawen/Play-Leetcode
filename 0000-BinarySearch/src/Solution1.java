/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-08
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,5,4,7,5,6,7,8,9};
        System.out.println(Solution.binarySearch(nums,3));
    }
    public static int binarySearch(int[] nums, int key){
        int l = 0, r = nums.length - 1;
        while (l<r){
            int m = l + (r-l)/2;
            if (nums[m]>=key){
                r=m;
            }else {
                l=m+1;
            }
        }
        return l;
    }

}
