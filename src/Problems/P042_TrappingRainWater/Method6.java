package Problems.P042_TrappingRainWater;

import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 17:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//使用栈，括号匹配的思想
/*
   我们用栈保存每堵墙。
   当遍历墙的高度的时候，如果当前高度小于栈顶的墙高度，说明这里会有积水，我们将墙的高度的下标入栈。
   如果当前高度大于栈顶的墙的高度，说明之前的积水到这里停下，我们可以计算下有多少积水了。计算完，
   就把当前的墙继续入栈，作为新的积水的墙。

   总体的原则就是，
       ①当前高度小于等于栈顶高度，入栈，指针后移。
       ②当前高度大于栈顶高度，出栈，计算出当前墙和栈顶的墙之间水的多少，然后计算当前的高度和新栈
        的高度的关系，重复第 ②步。直到当前墙的高度不大于栈顶高度或者栈空，然后把当前墙入栈，指针后移。
 */
public class Method6 {
    public int trap(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while(current < height.length){
            //如果栈不空并且当前指向的高度大于栈顶高度就一直循环
            while(!stack.isEmpty() && height[current] > height[stack.peek()]){
                int  h = height[stack.peek()];
                stack.pop();
                if(stack.empty()){
                    break;
                }
                int distance = current - stack.peek()-1;
                int min = Math.min(height[stack.peek()],height[current]);
                res += distance*(min - h);
            }
            stack.push(current);
            current++;
        }
       return res;
    }
}
