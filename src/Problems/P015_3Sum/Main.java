package Problems.P015_3Sum;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/8 13:39;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
/*Given an array nums of n integers, are there elements a, b, c in nums such
 that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 Note:
    The solution set must not contain duplicate triplets.
 Example:
    Given array nums = [-1, 0, 1, 2, -1, -4],
    A solution set is:
    [
      [-1, 0, 1],
      [-1, -1, 2]
    ]
*/
public class Main {
    public static  void main(String [] args){
        int [] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
//        System.out.println(new Method1().threeSum(nums));
        System.out.println(new Method2().threeSum(nums));
    }

}
