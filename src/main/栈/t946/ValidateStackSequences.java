package 栈.t946;

import java.util.LinkedList;

/**
 * @author: wangsongtao
 * @date: 2020/06/03 20:28
 */
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        LinkedList<Integer> stack = new LinkedList<>();
        int index = 0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
