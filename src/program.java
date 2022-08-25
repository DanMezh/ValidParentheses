import java.util.Map;
import java.util.Stack;

public class program {
   public boolean isValid(String str) {
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

