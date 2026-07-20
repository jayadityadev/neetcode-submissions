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
        int copy = n;
        Set<Integer> uniq = new HashSet<>();
        while (copy != 1) {
            copy = squaredSum(copy);
            if (!uniq.add(copy)) return false;
        }
        return true;
    }
}
