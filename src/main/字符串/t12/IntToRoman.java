package 字符串.t12;

/**
 * @auther: sotowang
 * @date: 2019/11/28 21:53
 */
public class IntToRoman {
    public String intToRoman(int num) {
        int[] alab = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV","V", "IX", "X","XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int index = 12;
        StringBuilder res = new StringBuilder();
        while (num != 0) {
            int count = num / alab[index];
            while (count-- != 0) {
                res.append(roman[index]);
            }
            num %= alab[index--];

        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntToRoman().intToRoman(624));
    }
}
