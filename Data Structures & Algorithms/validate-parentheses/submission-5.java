class Solution {
    public boolean isValid(String s) {
        // Associating brackets (closing -> opening)
        Map<Character, Character> brackets = new HashMap<>(Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        ));

        // O(N), O(N)
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!brackets.containsKey(current))     // is its an opening bracket
                stack.push(current);                // push to stack
            else {                                  // if its a closing bracket
                if (stack.isEmpty())                // if closing and empty stack (no opening)
                    return false;                   // obv not valid (cannot start with closing)
                Character top = stack.peek();       // check the most recent element in stack
                if (brackets.get(current) == top)   // if the top has associated closing
                    stack.pop();                    // valid pair, pop
                else                                // if the top is a different closing
                    return false;                   // not valid pair
            }
        }
        if (stack.isEmpty())    // finally, if all elements popped, ie every opening had a closing
            return true;        // return true
        return false;           // if some open left in stack, dangling, false
        
    }
}
