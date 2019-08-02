package Problems.P072_EditDistance;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {

    public static void main(String [] args){
//        int [] arrs = {6,3,4,3,3,4,5,5,4,6};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arrs = new int [n];
        for(int i = 0; i < arrs.length;i++){
            arrs[i] = scan.nextInt();
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<arrs.length;i++){
            int num = change(arrs,i);
            res = res > num? num:res;
        }
        System.out.println(res);
    }
    public static int change(int [] arr,int i){

        int [] arr1 = new int [i];
        for(int k = 0; k < arr1.length;k++)
            arr1[k] = arr[k];
        int [] arr2 = new int[arr.length-i-1];
        for(int m = 0; m<arr2.length;m++)
            arr2[m] = arr[i+1+m];
        //i之前的元素逆序排序
        Arrays.sort(arr1);
        for(int k = 0; k< arr1.length/2;k++){
            int temp = arr1[k];
            arr1[k] =  arr1[arr1.length-1-k];
            arr1[arr1.length-1-k] = temp;
        }
        //i之后的元素顺序排序
        Arrays.sort(arr2);
        //统计交换的数量
        int nums = 0;
        for(int k = 0; k < arr1.length;k++){
            if(arr1[k] != arr[k])
                nums++;
        }
        for(int k= 0; k< arr2.length;k++){
            if(arr2[k]!= arr[i+1+k])
                nums++;
        }
        return nums;
    }
}
