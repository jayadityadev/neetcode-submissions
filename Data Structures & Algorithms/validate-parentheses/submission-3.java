class Solution {
    public boolean isValid(String s) {
        // Associating brackets (closing -> opening)
        Map<Character, Character> brackets = new HashMap<>(Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        ));
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!brackets.containsKey(current))
                stack.push(current);
            else {
                Character top = stack.peek();
                if (top == null)
                    return false;
                if (brackets.get(current) == top)
                    stack.pop();
                else
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
        
    }
}
