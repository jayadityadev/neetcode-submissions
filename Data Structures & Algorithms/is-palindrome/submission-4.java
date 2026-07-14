class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // check left character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            
            // check right character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            // if left and right cross mid-way through the loop
            if (left >= right) {
                break;
            }

            // extract characters
            char left_char = s.charAt(left);
            char right_char = s.charAt(right);

            // compare
            if (Character.toLowerCase(left_char) != Character.toLowerCase(right_char))
                return false;
            
            
            left++; right--;
        }
        return true;
    }
}
