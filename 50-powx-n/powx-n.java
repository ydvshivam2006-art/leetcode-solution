class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            N = -N;
        }
        double ans = 1.0;
        double currentProduct = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans *= currentProduct;
            }
            currentProduct *= currentProduct;
        }
        return n < 0 ? 1.0 / ans : ans;
    }
}