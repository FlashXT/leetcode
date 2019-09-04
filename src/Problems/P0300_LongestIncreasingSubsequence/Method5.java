package Problems.P0300_LongestIncreasingSubsequence;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/4,17:07
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//贪心算法：在长度最大为len的递增序列里若末尾元素越小，该递增序列越容易和后面的子序列构
// 造出一个更长的递增子序列。也即认为，长度为len的递增子序列中末尾元素最小的那种最需要保
// 留。我们不妨称这个目前找到序列为到目前为止的 最优序列。
//实现思路：设置一个low数组，先把第一个元素放入low数组，对于后面的元素，只需要先比较数组中的最后一个元素，如果比数组中的最后一个元素大
// 就直接放入数组中，否则，在数组中 二分查找 第一个比该元素大的元素，将这个元素位置上的值 替换为 当前元素值，替换这一步就使前面的元素
// 更小了，替换位置前的数没有影响，替换位置上的数替换为当前数明显是有利于后面上升子序列的增长。

public class Method5 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length ==0) return 0;
        int maxL = 0;
        int[] low = new int[nums.length];
        low[0] = nums[0];
        for(int i = 1;i< nums.length;i++) {
            if (nums[i] > low[maxL]) {
                low[++maxL] = nums[i];
            } else {
                int pos = BinarySearch(low, nums[i], maxL);
                low[pos] = nums[i];
            }
        }
        return ++maxL;

    }
    public static int BinarySearch(int [] arr,int target,int high){
        int low =0,mid;
        while(low<=high) {
            mid=(low+high)>>1;
            if(arr[mid]<target)
                low=mid+1;
            else high=mid-1;

        }
        return low;
    }
}
