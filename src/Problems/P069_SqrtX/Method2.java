package Problems.P069_SqrtX;

//牛顿法
public class Method2 {
    public int mySqrt(int x) {
        double  x0 = x;
        double  x1 = 0;
        double  temp = x0;
        while(temp-x1 >=1){
            x1 = x0 - fx(x0,x)/dfx(x0);
            temp = x0;
            x0 = x1;
        }
        System.out.println((int)x1);
        return (int)x1 ;
    }
    public double fx(double root,double x){
        return root*root-x;
    }
    public double dfx(double x){
        return 2*x;
    }
}
