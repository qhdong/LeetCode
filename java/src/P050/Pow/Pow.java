package P050.Pow;

public class Pow {
    public double myPow(double x, int n) {
        if (n < 0) return 1 / myPow(x, -n);
        else if (n == 0) return 1;
        else if (n == 1) return x;
        else if ((n & 1) == 0) return myPow(x*x, n>>1);
        else return myPow(x*x, n>>1) * x;
    }
}
