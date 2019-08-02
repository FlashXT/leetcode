package Problems.P069_SqrtX;

//零点定理（二分法求方程的根），该方法需要计算平方
public class Method1 {
    public int mySqrt(int x) {
        if(x == 1) return x;
        long begin = 0;
        long end = x;
        long mid = begin+(end - begin)/2;
        long premid = 0;
        //該题要求的精确度不高，所以循环终止条件不是10e-6
        while(Math.abs(mid-premid)>=1){
            premid = mid;

            if(mid*mid -x >0 )
                end = mid;
            else if(mid*mid -x < 0)
                begin = mid;
            mid = begin+(end - begin)/2;

        }
        return (int)Math.floor(mid);
    }
}
