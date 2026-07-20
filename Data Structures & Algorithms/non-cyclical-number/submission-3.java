class Solution {
    public int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += (lastDigit * lastDigit);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }
        while (slow != fast);
        return slow == 1;
    }
}
