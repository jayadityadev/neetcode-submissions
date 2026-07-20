class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = 1;
        while (i <= n) {
            digits[n-i] += 1;
            if (digits[n-i] < 10)
                break;
            digits[n-i] = 0;
            i++;
        }
        if (i > n) {
            int[] newDigits = new int[n+1];
            newDigits[0] = 1;
            return newDigits;

        }
        return digits;
    }
}
