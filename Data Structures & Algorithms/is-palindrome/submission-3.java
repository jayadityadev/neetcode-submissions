class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // check left character
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right)
                left++;
            char left_char = s.charAt(left);
            
            // check right character
            while (!Character.isLetterOrDigit(s.charAt(right)) && left < right)
                right--;
            char right_char = s.charAt(right);

            // if left and right cross mid-way through the loop
            if (left >= right) {
                break;
            }

            // compare
            if (Character.toLowerCase(left_char) != Character.toLowerCase(right_char))
                return false;
            else {
                left++; right--;
            }
        }
        return true;
    }
}
