class Solution {
    public int subtractProductAndSum(int n) {
        int last_digit;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            last_digit = n % 10;
            sum = sum + last_digit;
            product = product * last_digit;
            n = n / 10;

        }
        return product - sum;
    }
}