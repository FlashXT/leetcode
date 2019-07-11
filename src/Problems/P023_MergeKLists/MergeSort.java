package Problems.P023_MergeKLists;

import java.util.ArrayList;
import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/11 10:09;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class MergeSort {
    public static void main(String [] args){
        int [] nums = {32,45,32,45,67,89};
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeSort(int []nums,int start,int end){
        if(start == end)
            return;
        int mid = start+(end - start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);

    }
    public static void merge(int [] nums ,int start ,int mid,int end){
        int [] temp = new int[end - start+1];
        int i = start,j = mid+1;
        int k = 0;
        while(i <=mid && j <=end){
            if(nums[i] < nums[j]){
                temp[k++] = nums[i++];
            }
            else
                temp[k++] = nums[j++];
        }

        while( i <= mid){
            temp[k++] = nums[i++];
        }

        while( j <= end){
            temp[k++] = nums[j++];
        }

        for(k = start; k <= end;k++){
            nums[k] = temp[k-start];
        }

    }
}
