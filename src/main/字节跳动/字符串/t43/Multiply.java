package 字节跳动.字符串.t43;

public class Multiply {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int res[] = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int m = num1.charAt(i) - '0';
            for (int j = num2.length()-1; j >=0 ; j--) {
                int n = num2.charAt(j) - '0';
                int sum = res[i+j+1] +m * n;
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == 0 && res[i] == 0) {
                continue;
            }
            result.append(res[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Multiply().multiply("123", "456"));
        System.out.println(new Multiply().multiply("99999", "0"));
    }
}
