package 其他.t1209;


import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/12/17 21:50
 */
public class RemoveDuplicates {
    public String removeDuplicates(String s, int k) {
        if (s.length()<k){
            return s;
        }
        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Integer> times = new LinkedList<>();
        characters.push(s.charAt(0));
        times.push(1);

        for (int i = 1; i < s.length(); i++) {
            if (!characters.isEmpty() && characters.peek() == s.charAt(i)) {
                times.push(times.pop() + 1);
                if (times.peek() == k) {
                    characters.pop();
                    times.pop();
                }
            }else{
                characters.push(s.charAt(i));
                times.push(1);
            }
        }
        StringBuilder res = new StringBuilder();
        int size = characters.size();
        for (int i = 0; i < size; i++) {
            int count = times.pop();
            char c = characters.pop();
            for (int j = 0; j < count; j++) {
                res.insert(0, c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates("pbbcggttciiippooaais", 2));
        System.out.println(new RemoveDuplicates().removeDuplicates("deeedbbcccbdaa", 3));
        System.out.println(new RemoveDuplicates().removeDuplicates("abcd", 2));
    }
}
