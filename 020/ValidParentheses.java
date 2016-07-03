/**
 * Time:  O(n)
 * Space: O(n)
 */

public class ValidParentheses {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.empty()) return false;
                
                char top = stack.pop();
                
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
    
}