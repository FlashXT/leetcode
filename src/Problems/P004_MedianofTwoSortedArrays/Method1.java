package Problems.P004_MedianofTwoSortedArrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/31 9:36;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//从中位数的定义出发，推出中位数满足的条件，然后寻找使该条件成立的位置；
//https://leetcode.wang/leetCode-4-Median-of-Two-Sorted-Arrays.html
public class Method1 {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if( m > n){
            int [] temp = A; A = B; B = temp;
            int tmp = m; m = n;n = tmp;
        }
        int iMin = 0,iMax = m,halflen = (m+n+1)/2;
        while(iMin <= iMax){
            int i = (iMin+iMax)/2;
            int j = halflen - i;
            if(i < iMax && B[j - 1] >A[i]){
                iMin = i+1;
            }
            else if (i > iMin && A[i-1] > B[j]){
                iMax = i -1;
            }
            else{
                int maxLeft = 0;
                if(i == 0 ) maxLeft = B[j-1];
                else if(j == 0) maxLeft = A[i-1];
                else maxLeft = Math.max(A[i-1],B[j-1]);
                if((m+n)%2 == 1) return maxLeft;

                int minRight = 0;
                if (i == m) minRight = B[j];
                else if (j == n) minRight = A[i];
                else minRight = Math.min(A[i],B[j]);

                return (maxLeft+minRight)/2.0;
            }

        }
        return 0.0;
    }
}
