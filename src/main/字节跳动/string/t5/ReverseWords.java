package 字节跳动.string.t5;

public class ReverseWords {
    public String reverseWords(String s) {
            if (s.equals(" ")) {
                return "";
            }
            StringBuilder result = new StringBuilder();
            int count = 0;
            boolean firstWorld = true;
            for (int i = s.length()-1; i >=0 ; i--) {
                if (s.charAt(i) != ' ') {
                    count++;
                    continue;
                }
                if (count != 0) {
                    if (firstWorld) {
                        firstWorld = false;
                    } else {
                        result.append(" ");
                    }
                    result.append(s.substring(i + 1, i + count + 1));
                    count = 0;

                }
            }
            if (count != 0) {
                if (!firstWorld) {
                    result.append(" ");
                }
                result.append(s.substring(0, count));
            }
            return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("a"));
    }
}
