package 字符串.t273;

/**
 * @auther: sotowang
 * @date: 2020/3/3 20:31
 */
public class NumberToWords {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String[] one = new String[]{
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        String[] two = new String[]{
                "Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
        };
        String[] three = new String[]{
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (num < 10) {
                sb.append(one[num]);
                break;
            } else if (num < 20) {
                sb.append(two[num - 10]);
                break;
            } else if (num < 100) {
                sb.append(three[num / 10]).append(" ");
                num %= 10;
            } else if (num < 1000) {
                sb.append(one[num / 100]).append(" ").append("Hundred").append(" ");
                num %= 100;
            } else if (num < 10000) {
                sb.append(one[num / 1000]).append(" ").append("Thousand").append(" ");
                num %= 1000;
            } else if (num < 20000) {
                sb.append(two[num / 1000 % 10]).append(" ").append("Thousand").append(" ");
                num %= 1000;
            } else if (num < 100000) {
                sb.append(three[num / 10000]).append(" ");
                if (num % 10000 == num % 1000) {
                    sb.append("Thousand").append(" ");
                }
                num %= 10000;
            }  else if (num < 1000000) {
                sb.append(one[num / 100000]).append(" ").append("Hundred").append(" ");
                num %= 100000;
            } else if (num < 10000000) {
                sb.append(one[num / 1000000]).append(" ").append("Million").append(" ");
                num %= 1000000;
            } else if (num < 100000000) {
                sb.append(three[num / 10000000]).append(" ");
                num %= 10000000;
            } else if (num < 1000000000) {
                sb.append(one[num / 100000000]).append(" ").append("Hundred").append(" ");
                num %= 100000000;
            } else if (num > 1000000000) {
                sb.append(one[num / 1000000000]).append(" ").append("Billion").append(" ");
                num %= 1000000000;
            }

        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        assert new NumberToWords().numberToWords(100000).equals("One Hundred Thousand");
        assert new NumberToWords().numberToWords(1234567891).equals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One");
        assert new NumberToWords().numberToWords(50868).equals("Fifty Thousand Eight Hundred Sixty Eight");
        assert new NumberToWords().numberToWords(1234567).equals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
        assert new NumberToWords().numberToWords(12345).equals("Twelve Thousand Three Hundred Forty Five");
        assert new NumberToWords().numberToWords(123).equals("One Hundred Twenty Three");
        assert new NumberToWords().numberToWords(20).equals("Twenty");
    }
}
