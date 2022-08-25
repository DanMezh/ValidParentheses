import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main (String[] args) {
        String str = "({[])}";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValidV2(str));
    }

    public boolean isValidV2(String str) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> characterMap = Map.of(
                    '(', ')',
                    '{', '}',
                    '[', ']');
            for (int i =0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (characterMap.containsKey(currentChar)) {
                    stack.push(currentChar);
                } else {
                    if (stack.isEmpty() || characterMap.get(stack.peek()) != currentChar) {
                        return false;
                    }
                    stack.pop();
                }
            }
            return stack.isEmpty();


        }
    }




