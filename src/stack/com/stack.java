package stack.com;

import java.util.Stack;

public class stack {
    public static boolean isValid (String s) {
        // write code here
        if(s == null || s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int len  = s.length();

        for(int i = 0 ; i < len ; i++){
            if(s.charAt(i)=='['){
                stack.push(']');
            }else if(s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || s.charAt(i) !=stack.pop()){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
